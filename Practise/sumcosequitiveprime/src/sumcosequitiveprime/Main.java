/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sumcosequitiveprime;

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
        int j=0;
        int t=0,y=0;
        for(int i=2;i<1000000;i++)
        {
            if(prime(i))
            {
                a[j++]=i;
                int n=number(i,a);
                if(n>t)
                {
                    t=n;
                    y=i;
                   System.out.println(i+" "+n+" "+t+" "+y);
            }
            }
        }
    }
static boolean prime(int x)
{
    int flag=0;
    for(int j=2;j<=Math.sqrt(x);j++)
    if(x%j==0)
    {
        flag=1;
     break;
    }
    if(flag==0)
        return true;
    else return false;
}
static int number(int y,int a[])
{

    for(int j=0;a[j]!=y;j++)
    {
    int k=0;
        for(int i=j;a[i]!=y;i++)
        {
            k+=a[i];
          if(k==y)              return (i-j);
          if(k>y) break;
    }
    }
return 0;

}

}