/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package codejam_rpi;
import java.io.*;
import java.util.*;
/**
 *
 * @author ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        // InputStreamReader isr=new InputStreamReader(System.in);
        //BufferedReader br=new BufferedReader(isr);

        Scanner sc = new Scanner(new FileReader("input.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

        int t=Integer.parseInt(sc.nextLine());
        double ans[][]=new double[t][100];
        int d[]=new int[t];
        for(int i=0;i<t;i++)
        {
             d[i]=Integer.parseInt(sc.nextLine());
             int n=d[i];
            int arr[][]=new int[n][n];
            for(int j=0;j<n;j++)
            {
                String s=sc.nextLine();
                for(int k=0;k<n;k++)
                {
                    if(s.charAt(k)=='0')
                        arr[j][k]=0;
                    if(s.charAt(k)=='1')
                        arr[j][k]=1;
                    if(s.charAt(k)=='.')
                        arr[j][k]=-1;
                }
            }
                double x[]=new double[n];
                double win[]=new double[n];
                double los[]=new double[n];
                double y[]=new double[n];
                double z[]=new double[n];
                for(int j=0;j<n;j++)
                {
                 double a=0,b=0;
                    for(int k=0;k<n;k++)
                    {
                       //System.out.print(arr[j][k]);
                        if(arr[j][k]==1)
                            a++;
                        else if(arr[j][k]==0)
                            b++;
                    }
                    x[j]=(double)(a/(a+b));
                    win[j]=a;
                    los[j]=b;
                 //   System.out.println(x[j]);
                }
                for(int j=0;j<n;j++)
               {
                    double p=0.0;
                    int cnt=0;
                    for(int k=0;k<n;k++)
                    {
                    double a=0,b=0;
                        if(arr[k][j]==0)
                        {
                            a=win[k];
                            b=los[k]-1;
                            cnt++;
                        }
                        else if(arr[k][j]==1)
                        {
                            a=win[k]-1;
                            b=los[k];
                            cnt++;
                        }
                        if(arr[k][j]!=-1)
                        p=p+(double)(a/(a+b));

                    }
                    y[j]=(double)(p/cnt);
                    //System.out.println(y[j]);
                }
                for(int j=0;j<n;j++)
                {
                double    p=0.0;
                   int cnt=0;
                    for(int k=0;k<n;k++)
                    {
                        if(arr[j][k]!=-1)
                        {
                            p+=y[k];
                            cnt++;
                        }
                    }
                    if(cnt!=0)
                    z[j]=(double)(p/cnt);
                   // System.out.println(x[j]+" "+y[j]+" "+z[j]);

              //  }
               //for(int j=0;j<n;j++)
                //{
                    ans[i][j] = 0.25*x[j] + 0.50*y[j] + 0.25*z[j];
                }


        }
//DecimalFormat f = new DecimalFormat("#.#########");
        for(int i=0;i<t;i++)
        {
           pw.println("Case #"+(i+1)+":");
            for(int j=0;j<d[i];j++)
            {
               
           pw.println((ans[i][j]));
            }
        }

        pw.flush();
        pw.close();
        sc.close();
    }

}

