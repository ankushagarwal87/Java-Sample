/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacci;
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
        BigInteger arr[]=new BigInteger[500];
        arr=fibonacci();
        int p=0;
        BigInteger q[]=new BigInteger[10000000];
        while(!(s.equals(("0 0"))))
        {
            String a[]=new String[2];
            a=s.split(" ");
            BigInteger x=new BigInteger(a[0]);
            BigInteger y=new BigInteger(a[1]);
            BigInteger z=new BigInteger("0");
            for(int i=1;i<=490;i++)
            {
                if(arr[i].compareTo(x)>=0 && arr[i].compareTo(y)<=0)
                {
                    z=z.add(new BigInteger("1"));
                }

            }
            q[p]=z;
        p++;
        s=br.readLine();
        }
        for(int i=0;i<p;i++)
                   System.out.println(q[i]);
        
    }

    static BigInteger[] fibonacci()
    {
        BigInteger a[]=new BigInteger[500];
        a[1]=new BigInteger("1");
        a[2]=new BigInteger("2");
        for(int i=3;i<=490;i++)
        {
            a[i]=a[i-1].add(a[i-2]);
           // System.out.println(a[i]+" "+i+" "+(a[i].toString()).length());
        }
        return a;
    }
}
