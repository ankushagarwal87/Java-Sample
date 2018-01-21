/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package primefamily;

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
        int x=2;
        boolean flag=true;
        int a[]={0,1,2,3,4,5,6,7,8,9};
        while(flag)
        {
            
   for(int i=0;i<10;i++)
   {
       int c=0,y=a[i];
       for(int j=x-1;j>0;j--)
       {
           c=0;
           for(int k=0;k<10;k++)
           {
               int z=f(a[k],j)+y;
               if(isPrime(z) && z!=0 && z!=1 && z>(int)Math.pow(10, j))
               {
                   c++;
                   System.out.println(x+" "+j+" "+a[k]+" "+a[i]+" "+c+" "+z);
               }   
           }
     }
                    if(c>6)
    {
        flag=false;
      System.out.println(c+" "+i+" "+"frst");
   }
 }

x++;
        }
    }
      static boolean isPrime(int a)
    {
        boolean q=true;
        for(int j=2;j<=Math.sqrt(a);j++)
        {
            if(a%j==0)
            {
                q=false;
                break;
            }
        }
        return q;
    }

static int f(int a,int b)
{
    int x=1;
    for(int i=b;i>0;i--)
    {
     x+=a*Math.pow(10, i);
    }
    return x;
}
}