/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package truncatable;

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
    int s=0;
        for(int i=10;;i++)
    {
        int x=i;
       int flag=0;
        int y=0;
int b=10;
        while(x!=0)
        {
             y=i%b;
            if(!prime(x) || !prime(y))
            {
                flag=1;break;
            }
            x/=10;b*=10;
         }
             if(flag==0)
             {
                 s+=i;
  System.out.println(i+" "+s);
        }
        }
    
    }
static boolean prime(int k)
{
        int c=0;
    for(int i=2;i<=Math.sqrt(k);i++)
        if(k%i==0) {c++;break;}
        if(k==1) c++;
if(c==0)
return true;
else
    return false;
}
}
