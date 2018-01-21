/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package smalloddcomposite;

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
        for(int i=3;i<6000;i=i+2)
        {
            if(!prime(i))
            {
                System.out.println(i);
                int a[]=new int[i];
                int b[]=new int[(int)Math.sqrt(i)];
                int k=0,m=0;
               for(int j=i-1;j>=2;j--)
               {
                   if(prime(j))
                    a[k++]=j;
               }
               for(int j=(int)Math.sqrt(i);j>0;j--)
               {
                   b[m++]=j*j;
               }
                int flag=0;
                for(int j=0;j<k;j++)
                {
                    for(int l=0;l<m;l++)
                    {
                        if((a[j]+2*b[l])==i)
                        {
                            System.out.println(i+" "+a[j]+" "+b[l]);
                            flag++;
                           l=i;
                           j=i;
                           break;
                    }
                }
            }
                if(flag==0)
                     System.out.println(i);
        }
    }
    }
static boolean prime(int x)
{
    int c=0;
for(int i=2;i<=Math.sqrt(x);i++)
{
    if(x%i==0)
    {
        c++;
        break;
    }
}
    if(c==0)
return true;
    else return false;
}

}
