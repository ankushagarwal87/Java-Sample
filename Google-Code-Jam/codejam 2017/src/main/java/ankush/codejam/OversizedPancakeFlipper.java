package ankush.codejam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OversizedPancakeFlipper {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		int testCase = Integer.parseInt(input.readLine());
		int answer[]=new int[testCase];
		String fields[]=new String[2];
		String  line,row;
		int size,length,count;
		char rowCharArray[];
		for(int i=0;i<testCase;i++)
		{
			line = input.readLine();
			fields =line.split(" ");
			row=fields[0];
			size=Integer.parseInt(fields[1]);
			length=row.length();
			rowCharArray=row.toCharArray();
			count=0;
			for(int j=0;j<=length-size;j++)
			{
				if(rowCharArray[j]=='-')
				{ 
					for(int k=j;k<j+size;k++)
					{
						if(rowCharArray[k]=='-')
							rowCharArray[k]='+';
							else
								rowCharArray[k]='-';
					}
					count++;
				}
			}
			int totalHappy =0;
			for(int j=0;j<length;j++)
			{
				if(rowCharArray[j]=='+')
					totalHappy++;
			}
			if(totalHappy==length)
				answer[i]=count;
			else 
				answer[i]=-1;
		}
		for(int j=0;j<testCase;j++)
		{
			if(answer[j]>=0)
				System.out.println("Case #"+(j+1)+": "+answer[j]);
			else
				System.out.println("Case #"+(j+1)+": "+"IMPOSSIBLE");
		}
	}

}
