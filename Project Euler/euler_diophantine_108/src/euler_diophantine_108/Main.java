/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_diophantine_108;

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
        long x=1000L;
        //boolean flag=true;
        long a=1L,y=0;
       while(y<x)
       {
           a++;
           y=0;
           for(long b=a+1;b<=2*a;b++)
            {
           long c=b-a;
           long d=a*b;
           if(d%c==0)
           {
               y++;
              // System.out.println(a+" "+b+" "+d/c+" "+y);
            }
          }
          System.out.println(a+" "+y);
    }System.out.println(a+" "+y);
    }
}
//180180