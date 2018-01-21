/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oddbinomialcoefficient;

/**
 *
 * @author ankush
 */
import java.io.*;
import java.util.*;
import java.math.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    //  Scanner sc=new Scanner(System.in);

    int t=Integer.parseInt(br.readLine());
    String str[][]=new String[t][15];
    int m=0;
    long x[][]=new long[t][15];
      for(int i=0;i<t;i++)
      {
          String s=br.readLine();
         String[] ss=s.split(" ");
         m=Integer.parseInt(ss[0]);
         for(int j=0;j<m;j++)
             x[i][j]=Long.parseLong(ss[j]);
      }
    for(int i=0;i<t;i++)
    {
        int arr[][]=new int[m][10000];
        for(int j=0;j<m;j++)
        {
            arr[j][0]=1;arr[j][]
            for(long k=0;k<x[i][j];k++)
            {

            }
        }


/*BigInteger a[]=new BigInteger[m];
BigInteger b[]=new BigInteger[m];
//BigInteger sum=new BigInteger("0");

for(int j=1;j<=m;j++)
         {

          a[j-1]=new BigInteger(ss[j]);
          b[j-1]=new BigInteger("1");
    BigInteger c=new BigInteger("0");
BigInteger d=new BigInteger("1");

          while(!c.equals(a[j-1]))
{
    c=c.add(d);
   b[j-1]=b[j-1].multiply(new BigInteger("11"));
}
//sum=sum.add(b[j-1]);
System.out.println(b[j-1]);
str[i][j]=b[j-1].toString();
     }
    }
  /*  for(int i=0;i<t;i++)
    {
        for(int j=0;j<m;j++)
        {
        for(int k=0;k<str[i][j].length();k++)
        {

        }
    }

}*/
}
}
}