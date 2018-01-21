/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package maxpower;

/**
 *
 * @author Ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long sum=0;
        for(int a=1;a<=100;a++)
        {
            for(int b=1;b<=100;b++)
            {
                int w=a+b;
                int x[]=new int[300];
                x[0]=1;
                for(int k=1;k<=b;k++)
                {
                    for(int l=298;l>=0;l--)
                    {
                     x[l]=x[l]*a;
                     for(int m=l;m<=x.length-2;m++)
                     {
                         x[m+1]+=x[m]/10;
                         x[m]%=10;
                     }
                    }
                }
                long z=0;
                 for(int k=0;k<300;k++)
                 {
                     System.out.println(x[k]);
                  z+=x[k];
                 }
                sum=Math.max(sum,z);
 System.out.println("end"+a+" "+b+" "+sum);
            }


        }

}
}