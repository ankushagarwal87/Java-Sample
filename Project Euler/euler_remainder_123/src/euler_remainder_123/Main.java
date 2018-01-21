/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_remainder_123;

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
        long a=2;
       long b=10000000000l;
       long x=1;
       long cnt=0;
       for(long c=2;x==1;c++)
       {
           a=1;
           long d=(long)Math.sqrt(c);
           long f=0;
           for(long e=2;e<=d;e++)
           {
               if(c%e==0)
               {
                   f=1;break;
               }
           }
           if(f==0)
           {
              cnt++;
              if(cnt%2==1)
               a=2*c*cnt;
              else
                  a=2;
               System.out.println(a+" "+c+" "+cnt);
               if(a>b)
               {
                   System.out.println(cnt);
                   x=0;
               }
           }
       }
    }

}
//21035