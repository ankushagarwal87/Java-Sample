package ankush.codejam;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
import java.text.DecimalFormat;

	public class PonyExpress {

		public static void main(String[] args) throws NumberFormatException, IOException {
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader input = new BufferedReader(reader);
			int testCase = Integer.parseInt(input.readLine());
			String answer[]=new String[testCase];
			String fields[]=new String[2];
			for(int i=0;i<testCase;i++)
			{
				String s=input.readLine();
				fields=s.split(" ");
				int n=Integer.parseInt(fields[0]);
				int q=Integer.parseInt(fields[1]);
				int e[]=new int[n];
				int sp[]=new int[n];
				for(int j=0;j<n;j++)
				{
				s=input.readLine();
				fields=s.split(" ");
				e[j]=Integer.parseInt(fields[0]);
				sp[j]=Integer.parseInt(fields[1]);
				}
				int arr[][]=new int[n][n];
				String x[]=new String[n];
				for(int j=0;j<n;j++)
				{
				s=input.readLine();
				x=s.split(" ");
				for(int k=0;k<n;k++)
					{
						int temp=Integer.parseInt(x[k]);
						if(temp>0)
							arr[j][k]=temp;
						else 
							arr[j][k]=Integer.MAX_VALUE;
					}
				}
				s=input.readLine();
				fields=s.split(" ");
				int a=Integer.parseInt(fields[0]);
				int b=Integer.parseInt(fields[1]);
				int[][] p = constructInitialMatixOfPredecessors(arr);
		        for(int j=0;j<n;j++)
		        {
		        	for(int k=0;k<n;k++)
		        	{
		        		for(int l=0;l<n;l++)
		        		{
		        			
		        			if(arr[k][j] == Integer.MAX_VALUE || arr[j][l] == Integer.MAX_VALUE)
		        				continue;
		        					
		        			if(arr[k][l]>(arr[k][j]+arr[j][l]))
		        			{
		        				arr[k][l]=arr[k][j]+arr[j][l];
		        				p[i][j] = p[k][j];
		        			}
		        		}
		        	}
		        }
		        int dist=arr[a-1][b-1];
		        
			}
		}
		private static int[][] constructInitialMatixOfPredecessors(int[][] d) {
			int[][] p = new int[d.length][d.length];
			for (int i = 0; i < d.length; i++) {
				for (int j = 0; j < d.length; j++) {
					if (d[i][j] != 0 && d[i][j] != Integer.MAX_VALUE) {
						p[i][j] = i;
					} else {
						p[i][j] = -1;
						}
				}
			}
			return p;
		}
	}