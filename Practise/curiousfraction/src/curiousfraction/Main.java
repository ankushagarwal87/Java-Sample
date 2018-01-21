/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package curiousfraction;

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
        for(int a=10;a<99;a++)
        {
            for(int b=a+1;b<=99;b++)
            {
             if(b%10!=0)
             {
                float t=(float)a/b;
                float s=(float)(a/10)/(b%10);
               if(t==s)
                    System.out.println(a+" "+b+" "+t);
            }
        }
        }

    }

}
