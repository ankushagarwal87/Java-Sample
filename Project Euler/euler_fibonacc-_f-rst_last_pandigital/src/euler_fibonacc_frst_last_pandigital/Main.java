/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_fibonacc_frst_last_pandigital;
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
   /* BigInteger a=new BigInteger("1");
    BigInteger b=new BigInteger("1");
    BigInteger c=new BigInteger("2");
    int i=3;
   while(true)
    {
       i++;
        a=b;
        b=c;
        c=a.add(b);
     if(i%10000==0)
        System.out.println(i+" "+a+" "+b+" "+c);
        if(c.compareTo(new BigInteger("1000000000"))>0 && pandigital(c))
        {
            System.out.println(i+" "+c);
            break;
        }
    }

    }

    static boolean pandigital(BigInteger x)
    {
       String s=x.toString();
       int l=s.length();
       int a[]=new int[10];
       int b[]=new int[10];
       for(int i=0;i<9;i++)
       {
           a[s.charAt(i)-48]++;
           b[s.charAt(l-1-i)-48]++;
       }
       for(int i=1;i<10;i++)
       {
           if(a[i]!=1 || b[i]!=1)
               return false;
      }
       return true;


    }
*/
 int x[]=new int[90000];
 int y[]=new int[90000];

 x[0]=1;
 y[0]=1;
 int i=2;
 int l=1;

        while(true)
        {
            i++;
            int z[]=new int[90000];
             String p="";
          for(int j=0;j<l;j++)
          {
              z[j]=x[j]+y[j]+z[j];
              if(z[j]>9)
              {
                  z[j+1]++;
                 z[j]=z[j]%10;
              }

            //p+=String.valueOf(z[j]);
          }
             if(z[l]>0)
                 l++;
            x=y;y=z;
            if(i%10000==0)
            {              System.out.print(i+" "+l+" ");
         //   for(int j=l-1;j>=0;j--)
           //     System.out.print(z[j]);
                                    System.out.println();
            }
            if(l>10 && pandigital(z,l))
        {
             System.out.print(i+" ");
            for(int j=l-1;j>=0;j--)
                System.out.print(z[j]);
            break;
        }
       }
}
static boolean pandigital(int a[],int b)
    {
       int c[]=new int[10];
       int d[]=new int[10];
       for(int i=0;i<9;i++)
       {
           c[a[i]]++;
           d[a[b-1-i]]++;
       }
       for(int i=1;i<10;i++)
       {
           if(c[i]!=1 || d[i]!=1)
               return false;
      }
       return true;
}

}
//329468