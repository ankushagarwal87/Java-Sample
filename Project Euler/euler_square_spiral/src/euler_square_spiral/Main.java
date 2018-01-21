/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_square_spiral;

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
        boolean flag=true;
        int z=3,cnt=0;
        int i=2;
         while(flag)
        {
            int a,b,c;
            
            for(;i<z;i=i+2)
            {
                a=(i*i)+1;
                b=(i*i)+(i+1);
                c=(i*i)-(i-1);
                if(isPrime(a))
                    cnt++;
                if(isPrime(b))
                    cnt++;
                if(isPrime(c))
                    cnt++;

            }
             double w=((cnt*100)/(2*z-1));
        System.out.println(z+" "+cnt+" "+w);
       if(w<10)
        {
            flag=false;
            System.out.println(z+" "+cnt+" "+w+" "+(2*z-1));
        }
        z=z+2;

        }
    }


    static boolean isPrime(int p)
    {
        for(int i=2;i<=(int)Math.sqrt(p);i++)
        {
            if(p%i==0)
                return false;
        }
        return true;
    }
}
