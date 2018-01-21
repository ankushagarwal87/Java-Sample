/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_ndigit_npower;

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
     
        double a=1;
        int cnt=0;
        long c=Long.MAX_VALUE;
        int tot=0;
//System.out.println(Long.MAX_VALUE+" "+Double.MAX_VALUE);
        double r=Double.MAX_VALUE;
        while(a<r)
        {
        int digit=(int)Math.log10(a)+1;
        double d=Math.rint(Math.pow(a,1.0/digit));
        double e=(Math.pow(d,digit));
    //    System.out.println(a+" "+digit+" "+d+" "+e);
        if(a==e)
                 System.out.println(a+" "+digit+" "+d+" "+e+" "+(++tot));
        if(e>a)
            a=e;
      /*
        long x=2L;
        boolean flag=true;
        while(flag)
        {
            long y=1L;
            for(int i=1;i<=digit;i++)
            {
                y=(long)(y*x);
                if(y>a)
                {
                    flag=false;
                    break;
                }
            }
            if(y==a)
            {
                cnt++;
                System.out.println(x+" "+digit+" "+a+" "+cnt);
                flag=false;
            }
            x++;

        }*/
        else
        {
            a=Math.pow((d+1),digit);
        }


    }
    }
}
