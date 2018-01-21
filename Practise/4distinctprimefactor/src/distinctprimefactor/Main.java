/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package distinctprimefactor;

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
    int a[]=new int[1000000];

        for(int i=0;i<1000;i++)
    {
            int k=0;
        for(int j=2;j<=i/2;j++)
        {
            if(i%j==0)
            {
                if(prime(j))
                {
                    a[i]++;
                  // System.out.println(i+" "+j);
                }
            }
        }
           // System.out.println(i+" "+a[i]);
if(a[i]>=3 && a[i-1]>=3 && a[i-2]>=3)
        System.out.println(i+" "+(i-1)+" "+(i-2));
    }
    }
static boolean prime(int x)
{
    int f=0;
    for(int i=2;i<=Math.sqrt(x);i++)
    {
        if(x%i==0)
        {
            f=1;
            break;
        }
    }
    if(f==0)
        return true;
    else return false;
}/*
static boolean check(int x[][],int j)
{
  for(int i=1;i<j;i++)
  {
      
  }
}*/
}
