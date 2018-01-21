/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package triangleperimeter;

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
    int x=0;
        for(int p=1;p<=1000;p++)
    {int s=0;
        for(int a=1;a<=p/2;a++)
        {
            for(int b=1;b<=p/2;b++)
            {
                if((p-a-b)*(p-a-b)==(a*a+b*b))
                {
                    s++;
                    System.out.println(a+" "+" "+b+" "+(p-a-b)+" "+p);
                }
            }
        }
    if(s>x)
    {
        x=s;
         System.out.println("          "+x);
    }

    }

System.out.println("          "+x);

    }

}
