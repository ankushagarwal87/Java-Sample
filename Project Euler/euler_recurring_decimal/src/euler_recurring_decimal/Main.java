/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_recurring_decimal;
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
       // System.out.println(Math.toDegrees(Math.asin(3.0/5)+Math.asin(4.0/5)));
        int a=10;
        int max=0,pos=-1;
        for(int i=2;i<1000;i++)
        {
            String s="";
            a=10;
            if(i>9)
                a*=10;
            if(i>99)
                a*=10;
          //  System.out.print(i+" ");
            int cnt=0;
            while(a!=0)
            {

               int b=a/i;
               s+=String.valueOf(b);
               a=(a%i)*10;
               
           //    System.out.print(b);
           //     if((a/i)==b)
             //   {
               //     cnt=s.length();
                 //   break;
               // }
               if (s.length()>1 && present(s))
                    {
                 //   cnt=s.length()-1;
                   // cnt=cnt/2;
                        break;
                    }
            }
         /*   if(cnt>max)
            {
                max=cnt;
                pos=i;
            }
           */System.out.println(i+" "+s);
    }
    }

    static boolean present(String x)
    {
        int l=x.length();
        for(int i=l/2+1;i<l;i++)
        {
            String a=x.substring(i,l);
            int d=l-i;
            String b=x.substring(i-d,i);
            if(a.equals(b))
                return true;
        }
   return false;

    }
}
