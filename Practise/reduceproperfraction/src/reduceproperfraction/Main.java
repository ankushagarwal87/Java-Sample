/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package reduceproperfraction;

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
   int n=1000000;
   int c=0,k=0;
   double arr[]=new double[1000000];
double b[]=new double[1000000];
   for(int i=2;i<=n;i++)
   {
       for(int j=1;j<=i/2;j++)
       {
           if(hcf1(j,i))
           {
           double z=(double)j/i;
           if(!present(arr,z,k))
           {
              arr[k++]=z;
              arr[k++]=(double)1.0-z;
   //           System.out.println(j+ " "+i+" "+k);
           }

            }
       }
   System.out.println(i+" "+(k-1));
   }
    }
static boolean hcf1(int a,int b)
{
    int min;
    if(a<b)
        min=a;
    else
        min=b;
    for(int i=2;i<=min;i++)
    {
        if(a%i==0 && b%i==0)
            return false;
    }
    return true;
}

static boolean present(double ar[],double c,int l)
{
    for(int i=0;i<=l;i++)
    {
        if(c==ar[i])
            return true;

    }
    return false;
}
}
