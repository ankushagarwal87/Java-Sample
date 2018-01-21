/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_reversible;

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
      int cnt=0;
        for(int i=1;i<1000000000;i++)
        {
            StringBuffer a=new StringBuffer(String.valueOf(i));
          StringBuffer b=a.reverse();
           String c=b.toString();
            int d=Integer.parseInt(c);
            if(i%10!=0 && check((i+d)))
            {
                cnt++;
            }
            if(i%10000000==0)
        System.out.println(i+" "+a+" "+c+" "+d+" "+(i+d)+" "+cnt);
            }
    }
        
    
    //. 608720
static boolean check(int x)
{
    while(x!=0)
    {
        int a=x%10;
        if(a%2==0)
            return false;
        x/=10;
    }
    return true;
}
}
