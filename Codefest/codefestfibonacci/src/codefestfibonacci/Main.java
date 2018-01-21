/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package codefestfibonacci;
import java.io.*;
import java.math.BigInteger;
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
        String s=(br.readLine());
        int x=Integer.parseInt(s);
        int y=Integer.parseInt(br.readLine());
        fibonaccigcd(x,y);

    }

    static void fibonaccigcd(int x,int y)
    {
        BigInteger z=new BigInteger("1");
       BigInteger p=new BigInteger("1");
       BigInteger q=new BigInteger("1");
for(int i=3;i<=1234567890 ;i++)
{
    q=z.add(p);
    z=p;
    p=q;
 //   System.out.println(q);
}
       z=new BigInteger("1");
       p=new BigInteger("1");
       BigInteger r=new BigInteger("1");
    for(long i=3;i<=9876543210l;i++)
{
    r=z.add(p);
    z=p;
    p=r;
   // System.out.println(r);
}
       BigInteger max=new BigInteger("1");
       BigInteger min=new BigInteger("1");
       BigInteger a=new BigInteger("0");
       boolean flag=true;
        if(q.compareTo(r)>=0)
        {
            max=q;
            min=r;
        }
           else
           {  min=q;
                max=r;
           }
                 BigInteger b;
       while(flag)
       {
             b=max.mod(min);
           System.out.println(max+" " +min+" "+b);
             if(!b.equals(a))
           {
               max=min;
               min=b;
           }
           else flag=false;
       }
                 System.out.println(min);
BigInteger c=new BigInteger("1000000007");
                 min=min.mod(c);
                 System.out.println(min);

    }
}
