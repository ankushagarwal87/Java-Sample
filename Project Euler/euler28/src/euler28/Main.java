/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler28;

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

         long rsum=1,lsum=1,i;

                for(i=3;i<=15;i=i+2)
        {
            rsum+=i*i+(i-1)*(i-1)-(i-1)-(i-2);
            lsum+=i*i+(i-1)*(i-1)+1;
        

        System.out.println((rsum+" "+lsum));
                }
    }

}
