/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package spiralprime;

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
        long s=0,a=0,b=0,c=0,d=0,y=1;
        double x;
        for(int i=3;i<27000;i=i+2)
        {
            a=i*i;
            if((i-1)>0)
            {
            b=(i-1)*(i-1)+1;
            c=(i-1)*(i-1)+(i-1)+1;
        }
            if((i-2)>0)
                 d=(i-2)*(i-2)+(i-2)+1;
            System.out.println(a+" "+c+" "+b+" "+d);
            if(isPrime(a))
            {
                s++;
                System.out.println(a);
            }
                if(isPrime(c))
                {
                    s++;
                     System.out.println(c);
                }
                if(isPrime(b))
                {
                    s++;
                     System.out.println(b);
                }
                if(isPrime(d))
                {
                    s++;
                     System.out.println(d);
                }
y=y+4;
x=(double)s/y;
System.out.println(i+" "+s+" "+y+" "+x);
        }



    }
    static boolean isPrime(long a)
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
}
