/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pandigital;

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
       
        for(int i=2000;;i++)
        {
            if(prime(i))
            {
     int a[]=new int[10];
                int y=0;
                int k=i;
                while(k!=0)
                {
                    y++;
                    a[k%10]++;
                    k/=10;
                 }
                for(int j=1;j<=y;j++)
                    if(a[j]!=1)
                    {
                        k=1;
                        break;
                    }
                if(k==0)
                    System.out.println(i);

           }
       }

}
static boolean prime(int x)
{
    int c=0;
    for(int i=2;i<=Math.sqrt(x);i++)
        if(x%i==0)
        {c=1;break;}
if(c==0)
    return true ;
else
    return false;
}
}