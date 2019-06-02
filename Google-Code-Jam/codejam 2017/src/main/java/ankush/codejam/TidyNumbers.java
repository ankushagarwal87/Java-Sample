package ankush.codejam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TidyNumbers {

		public static void main(String[] args) throws NumberFormatException, IOException {
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader input = new BufferedReader(reader);
			int testCase = Integer.parseInt(input.readLine());
			String answer[]=new String[testCase];
			for(int i=0;i<testCase;i++)
			{
				String line= input.readLine();
				char[] charArray= line.toCharArray();
				int[] digit =new int[20];
				for(int j=0;j<line.length();j++)
				{
					digit[j]=charArray[j]-48;
				}
				for(int j=line.length()-1;j>0;j--)
				{
					if(digit[j]<digit[j-1])
					{
						digit[j]=9;
						digit[j-1]=digit[j-1]-1;
						int k=j;
						while(k<line.length()-1)
						{
							if(digit[k]>digit[k+1])
							{
								digit[k+1]=9;
								k++;
							}
							else
								break;
						}
					}
					
				}
				answer[i]="";
				for(int j=0;j<line.length();j++)
				{
					if(j!=0 || (digit[j]!=0 && j==0))
					answer[i]=answer[i].concat(String.valueOf(digit[j]));
				}
				
			}
			for(int j=0;j<testCase;j++)
			{
				System.out.println("Case #"+(j+1)+": "+answer[j]);
			}
		}

	}
