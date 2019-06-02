package ankush.codejam;

import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
import java.text.DecimalFormat;

	public class CruiseControl {

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
				int d=Integer.parseInt(fields[0]);
				int n=Integer.parseInt(fields[1]);
				int x[]=new int[n];
				int y[]=new int[n];
				double z[]=new double[n];
				double max=0;
				for(int j=0;j<n;j++)
				{
					s=input.readLine();
					fields=s.split(" ");
					x[j]=Integer.parseInt(fields[0]);
					y[j]=Integer.parseInt(fields[1]);
					z[j]=((d-x[j])*1.0)/y[j];
					/*if(j>0)
					{
						if(z[j]<z[j-1])
						{
							double temp=y[j]-y[j-1];
							double temp2=(x[j-1]-x[j])*y[j-1];
							double temp3=temp2/temp;
							double temp4=(x[j-1]-x[j])+temp3;
							z[j]=temp4/y[j]+(d-x[j-1]-temp3)/y[j-1];
						}
					}*/
					max=Math.max(max,z[j]);
			
					//System.out.println(x[j]+" "+y[j]+" "+z[j]+" "+max);
				}
				//answer[i]=d/max;
				DecimalFormat df = new DecimalFormat("0.000000");      
				answer[i]= df.format(d/max);
				//System.out.println(i+" "+d/max+" "+d+" "+max);
				
			}
			for(int j=0;j<testCase;j++)
			{
					System.out.println("Case #"+(j+1)+": "+answer[j]);
			}
		}

	}
