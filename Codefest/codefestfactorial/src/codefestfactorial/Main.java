/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package codefestfactorial;
import java.math.*;
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
        int n=77,x=1;
         BigInteger a=new BigInteger("1");
        BigInteger b=new BigInteger("1");
        BigInteger c=new BigInteger("1");
        BigInteger d=new BigInteger("0");
        for(int i=2;i<=n;i++)
            {
                b=b.add(c);
                a=a.multiply(b);
             //   x*=i;
            }
        int cnt=0;
        BigInteger k=new BigInteger("2");
        BigInteger t=a;
        for(;t.divide(k).compareTo(d)>0;k=k.add(c))
        {
            t=t.divide(new BigInteger("2"));
            for(int j=1;j<=x;j++)
            {
                int s=0;
                int z=j;
                for(int i=1;i<=k;i++)
                {
                    s+=z;
                    z++;
                 }
                if(s==x)
                {
                                        cnt++;
                   System.out.println(k+" "+j+" "+cnt);
            }
        }
    }
    }
}



