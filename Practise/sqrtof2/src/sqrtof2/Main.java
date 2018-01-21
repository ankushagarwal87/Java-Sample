/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sqrtof2;

/**
 *
 * @author ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[]=new int[400];
        int d[]=new int[400];
       n[1]=3;
 d[1]=2;
 int a[]=new int[400];
 a[1]=2;
 int s=0;
 for(int k=2;k<400;k++)
 {
     a[k]=0;d[k]=0;n[k]=0;
 }
for(int i=1;i<1000;i++)
{
    f(d,n,a);
   p(d);
    q(n,d,a);
     p(n);
     for(int j=1;j<400;j++)
         a[j]=d[j];
     //p(a);
     System.out.println();
     if(c(n,d,i,s))
         s++;
}
System.out.println(s);
    }
    static boolean c(int x[],int y[],int a,int s)
    {
        boolean t=false;
        for(int j=399;j>0;j--)
        {
            if(x[j]>0)
            {
                if(y[j]==0)
                {
                    t=true;

            System.out.println(a+" "+x[j]+" "+y[j]+" "+s);
                }
            break;
        }
    }
        return t;
    }
static void f(int x[],int y[],int z[])
{
    for(int j=1;j<399;j++)
    {
        if(x[j]>9)
        {
            x[j+1]=x[j+1]+1;
            x[j]%=10;
        }
        x[j]+=y[j];
        if(x[j]>9)
        {
            x[j+1]=x[j+1]+1;
            x[j]%=10;
        }
    }
}
static void q(int x[],int y[],int z[])
{
    for(int j=1;j<399;j++)
    {
        if(x[j]>9)
        {
            x[j+1]+=x[j]/10;
            x[j]%=10;
        }
        x[j]=x[j]+2*z[j];
        if(x[j]>9)
        {
            x[j+1]+=x[j]/10;
            x[j]%=10;
        }
    }
}
static void p(int x[])
{
    System.out.println();
    for(int j=399;j>0;j--)
        System.out.print(x[j]);
}
}
