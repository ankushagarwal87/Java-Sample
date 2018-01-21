/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package numbernumbernumber;
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
        int arr[]=new int[t];
        int max=0;
        for(int i=0;i<t;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
                 max=Math.max(max,arr[i]);
        }
        BigInteger x[]=new BigInteger[max+2];
        x[0]=new BigInteger("1");
        x[1]=new BigInteger("5");
        int k=1,y=1;
        for(int i=1;k<=max;i++,k++)
        {
              y=k;
        x[k]=power(i);
      //  System.out.println(k+" "+x[k]);
       
        for(int j=1;j<y && k<=max ;j++)
        {
      k++;
      x[k]=power(i).add(x[j]);
     // System.out.println(k+" "+x[k]);
        }

    }
        for(int i=0;i<t;i++)
        {
            System.out.println(x[arr[i]]);
        }
}



static BigInteger power(int x)
{
BigInteger a=new BigInteger("1");
BigInteger b=new BigInteger("5");
for(int i=1;i<=x;i++)
{
    a=a.multiply(b);
}
return a;
}
}