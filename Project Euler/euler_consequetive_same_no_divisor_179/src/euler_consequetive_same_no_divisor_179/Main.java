/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_consequetive_same_no_divisor_179;

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
        int x=2,tot=0;
        for(int i=3;i<=10000000;i++)
        {
            double b=Math.sqrt(i);
            int y=1,z=0;
            for(int j=2;j<b;j++)
            {
                if(i%j==0)
                 z++;
            }
            y=(y+z)*2;
            if(b==Math.ceil(b))
                y++;
            //System.out.println(i+" "+b+" "+y);
            if(y==x)
            {
                tot++;
              //  System.out.println((i-1)+" "+i+" "+b+" "+y+" "+tot);
            }
            x=y;
            if(i%1000000==0)
                System.out.println(i+" "+tot);
        }
        System.out.println(tot);
    }

}
//986262