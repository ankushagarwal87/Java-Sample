package ankush.codejam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;

public class BathroomStalls {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		int testCase = Integer.parseInt(input.readLine());
		String answer[]=new String[testCase];
		for(int i=0;i<testCase;i++)
		{	
			answer[i]="";
			String line=input.readLine();
			String split[]=new String[2];	
			split=line.split(" ");
			int stalls=Integer.parseInt(split[0]);
			int people=Integer.parseInt(split[1]);
			int arr[]=new int[stalls+1];
			arr[0]=stalls;
			int position=0;
			int left=0,right=0;
			QueueDemo queue =new QueueDemo(stalls);
			for(int j=0;j<people;j++)
			{
				int maximum=arr[0];
				left=(int)Math.floor(maximum/2);
				right=(int)Math.ceil((maximum-1)/2);
				arr[0]=left;
				position++;
				arr[position]=right;
				int max=arr[0];
				for(int k=1;k<position;k++)
				{
					if(max<arr[k])
					{
						max=arr[k];
						arr[k]=arr[0];
						arr[0]=max;
					}
					//System.out.println(j+" "+k+" "+arr[k]);
				}
				//System.out.println(left+" "+right+" "+position+" "+arr[0]+" "+maximum);
			}
			//System.out.println(left+" "+right);
			answer[i]=String.valueOf(left)+" "+String.valueOf(right);
			
		}
		for(int j=0;j<testCase;j++)
		{
			System.out.println("Case #"+(j+1)+": "+answer[j]);
		}
	}

}
