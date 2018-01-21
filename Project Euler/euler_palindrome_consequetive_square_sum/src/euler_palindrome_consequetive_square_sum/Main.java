/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_palindrome_consequetive_square_sum;

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
        int x=100000000;
        long sum=0;
        for(int i=2;i<x;i++)
        {
            String a=String.valueOf(i);
            StringBuffer b=new StringBuffer(a);
            b=b.reverse();
            String c=b.toString();
            if(a.equals(c))
            {
                // System.out.println(i+" "+a+" "+b+" "+c);
                int y=(int)Math.sqrt(i/2)+1;
                int z=2;
                int pos=y;
                boolean flag=true;
                while(flag)
                {
                long p=0;
                       for(int j=pos;j>=z;j--)
                       {
                        // int p=0;
                           //ystem.out.println(i+" "+z+" "+j+" "+pos);
                          for(int k=j;k>(j-z) && j==pos;k--)
                               p+=(k*k);
                           if(p==i)
                           {
                           //   System.out.println("gch"+i+" "+j+" "+p);
                               j=0;
                               sum+=i;
                               flag=false;
                               break;
                           }
                           if(p<i)
                           {
                               pos=j;
                               break;
                           }
                           p=p-j*j+(j-z)*(j-z);
                      }
                       z++;
                       if(y<=z)
                           break;
                }
            }
            if(i%5000000==0)
                System.out.println(i+ " "+sum);
    }
        System.out.println(sum);
    }
}
////
//2906969179
