/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package combinationcook;
import java.io.*;
import java.math.*;

/**
 *
 * @author ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int t=Integer.parseInt(br.readLine());
   long r[]=new long[t];
   long c[]=new long[t];
   String s[]=new String[t];
   for(int i=0;i<t;i++)
        {
            s[i]=br.readLine();
          //  String a[]=s[i].split(" ");
         //   r[i]=Long.parseLong(a[0]);
         //   c[i]=Long.parseLong(a[1]);

        }
for(int i=0;i<t;i++)
{
 String a[]=s[i].split(" ");
  // String w=String.valueOf(r[i]);
    BigInteger x=new BigInteger(a[0]);
// w=String.valueOf(c[i]);
    BigInteger y=new BigInteger(a[1]);
 //w=String.valueOf(r[i]-c[i]);
   // BigInteger z=x.subtract(y);
    x=factorial(x,y);
 //y=factorial(y);
  //z=factorial(z);
  /*if((y.compareTo(new BigInteger("0"))>0))
  x=x.divide(y);
    if((z.compareTo(new BigInteger("0"))>0))
  x=x.divide(z);
  */System.out.println(x);
    }
}


static BigInteger factorial(BigInteger r,BigInteger c)
{
    BigInteger a=new BigInteger("1");
BigInteger b=new BigInteger("1");
BigInteger j=new BigInteger("1");

for(;r.compareTo(c)>0;)
{

    a=a.multiply(r);
    r=r.subtract(b);
   //System.out.println(a);
}
for(;c.compareTo(b)>0;)
{
    j=j.multiply(c);
    c=c.subtract(b);
   // System.out.println(j);
}
return (a.divide(j));
}
}