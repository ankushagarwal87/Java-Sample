/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pandigitalwithprimeproperty;

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
       
       int p[]={2,3,5,7,11,13,17};
        long x,sum=0;
        for(long i=1000000000;i<9999999999l;i++)
        {
    int a[]=new int[10];
    x=i;
    int flag=0;
          if(ispandigital(i))
          {
           //  System.out.println(i);
              for(int j=0;j<10;j++)
              {
                  a[j]=(int)(long)(x%10);
                  x/=10l;
              }

           for(int k=8;k>=2;k--)
              {
                  if((a[k]*100+a[k-1]*10+a[k-2])%p[8-k]!=0)
                  {
                     // System.out.println(i+" "+k+" "+a[k]+" "+a[k-1]+" "+a[k-2]);
                      flag=1;
                      break;
                  }
             }
           if(flag==0)
           {
               sum+=i;
               System.out.println(i+" "+(sum));
          }
        }
        }
    }
static boolean ispandigital(long x)
{
        long a[]=new long[10];
          int flag=0;

    while(x!=0)
            {
       // System.out.println((long)(x%10l));
                a[(int)(long)(x%10l)]++;
                if(a[(int)(long)(x%10l)]>1)
                {
                    flag=1;
                    x=0l;
                    break;
                }
                x/=10l;
            }

    for(int j=0;j<10 && flag==0;j++)
    {
        if(a[j]!=1)
            flag=1;
    }

if(flag==0)
    return true;
else return false;
 }
}
