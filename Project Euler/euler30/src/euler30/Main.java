/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler30;

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
for(int i=10;;i++)
{int sum=0,s,x=i;
    while(x!=0)
    {
        s=x%10;
        x/=10;
        sum+=Math.pow(s,5);
        
        
    }
            if(sum==i)System.out.println(i);
        
}




    }

}
