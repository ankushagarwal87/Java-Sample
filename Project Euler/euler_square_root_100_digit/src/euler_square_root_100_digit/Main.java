/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_square_root_100_digit;
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
   /*   int tot=0;
        for(int j=2;j<100;j++)
        {
            if(!(Math.sqrt(j)==Math.floor(Math.sqrt(j))))
            {
                  int x=j;
        int y=(int)Math.sqrt(x);
        BigDecimal a=new BigDecimal(String.valueOf(x));
        BigDecimal b=new BigDecimal(String.valueOf(y));
        int i=0;
        int sum=0;
        String s;
        int l=0;
             while(true)
        {
            i++;
            BigDecimal c=(b.multiply(b)).subtract(a);
            BigDecimal d=b.multiply(new BigDecimal("2"));
            BigDecimal e=c.divide(d,MathContext.DECIMAL128);
            b=b.subtract(e);
            b=b.multiply(new BigDecimal("10"));
            a=a.multiply(new BigDecimal("100"));
           // b=((b.add(c)).divide(new BigDecimal("2")));
           s=b.toString();
            l=s.length();
                       System.out.println(i+" "+b+" "+c+" "+d+" "+e+" "+l);
            if(l>110)
                break;

        }
        System.out.println(j+" "+i+" "+l+" "+s);
       for(int k=2;k<102;k++)
       {
      int d=s.charAt(k)-48;
 // System.out.print(d);
      sum+=d;
             }
        tot+=sum;
        System.out.println(j+" "+sum+" "+i+" "+s+" "+l+" "+tot);

            while(true)
            {
                i++;
                BigInteger p=factorial(2*i);
                BigInteger q=factorial(i);
                q=q.multiply(q);
                int r=(int)Math.pow(4,i);
                int t=1-2*i;
                int u=(int)Math.pow(-1,i);
                double d=u*p.intValue()*1.0/(t*q.intValue()*r);
                sum+=d;
                System.out.println(i+" "+d+" "+sum);
               
            }


            }

            }
}

    static BigInteger factorial(int x)
    {
        BigInteger y=new BigInteger("1");
        BigInteger i=new BigInteger("2");
        BigInteger z=new BigInteger(String.valueOf(x));
        for(;i.compareTo(z)<=0;i=i.add(new  BigInteger("1")))
            y=y.multiply(i);
        return y;
    }

            }
}*/

  for(int i=2;i<100;i++)
  {
        if(!(Math.sqrt(i)==Math.floor(Math.sqrt(i))))
            {
                  BigInteger x=new BigInteger(String.valueOf(i));
                  int p=(int)Math.sqrt(i);
                  BigInteger y=new BigInteger(String.valueOf(p));
                  String s=String.valueOf(y);
                  BigInteger a=new BigInteger("20");
                  BigInteger q=new BigInteger("10");
                  BigInteger b=new BigInteger("100");
                  BigInteger c=y;
                  while(true)
                  {
                         BigInteger z=y.multiply(a);
                         x=x.subtract(c);
                         x=x.multiply(b);
                         for(int j=9;j>0;j--)
                         {
                            c=z.add(new BigInteger(String.valueOf(j)));
                             c=c.multiply(new BigInteger(String.valueOf(j)));
                             if(c.compareTo(x)<0)
                             {
                                 y=y.multiply(q);
                                 y=y.add(new BigInteger(String.valueOf(j)));
                                 s+=String.valueOf(j);
                                 break;
                             }
                         }
                         System.out.println(y+" "+s+" "+x+" "+z+" "+" "+c+" "+q);
                      //   q=q.multiply(new BigInteger("10"));
                   }

        }
  }






    }
}