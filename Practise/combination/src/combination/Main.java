/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package combination;


/**
 *
 * @author Ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 /*       int sum=0;
     for(int n=1;n<=100;n++)
     {
         
         for(int r=0;r<=n;r++)
         {
             int a[]=new int[n+1];
          a=factorial(n);
            int b[]=new int[r+1];
            int c[]=new int[n-r+1];
                b=factorial(r);
            c=factorial(n-r);
       for(int i=0;i<=r;i++)
            {
                for(int j=0;j<=n;j++)
                {
                                 
                    if(a[j]%b[i]==0)
                    {
                     //   System.out.println(a[j]+" "+b[i]+" "+r);
                         a[j]/=b[i];
                        b[i]=1;
                        break;
                    }
                }
            }
             for(int i=1;i<=n-r;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(a[j]%c[i]==0)
                    {
                    //      System.out.println(" "+a[j]+" "+c[i]+" "+r);
                        a[j]/=c[i];
                        c[i]=1;
                        break;
                    }
                }
            }
            long x=1,y=1,z=1;
            for(int i=1;i<=n;i++)
                x*=a[i];
              for(int i=1;i<=r;i++)
           y*=b[i];
              for(int i=0;i<=n-r;i++)
                        z*=c[i];
double w=(double)x/(y*z);
if(w>1000000)
{
    sum+=(n-2*r+1);
    System.out.println(n+" "+r+" "+w+" "+sum);
    r=n;
}
  
          
         }
     }
        System.out.println(sum);
  }
 static int[] factorial(int x)
 {

    int y[]=new int[x+1];
    y[0]=1;
    for(int i=1;i<=x;i++)
        y[i]=i;
    return y;
 
 }
 }*/
        int s=123256;
        long b=0;
        for(int i=501;i<=999;i++)
        {
          b=b+s;
          s-=496;
          System.out.println(i+" "+b+" "+s);
        }
    }
}