/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_rectangle2million;

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
        int a=2;
        int d=2000000;
        int ans=d;
        int pos=0;
        while(true)
        {
            int b=(int)Math.sqrt(a);
            int min=2000000;
            int cnt=0;
            for(int i=1;i<=b;i++)
          {
              if(a%i==0)
              {
                  int c=a/i;
                  int s=0;
                  for(int j=1;j<=i;j++)
                  {
                      for(int k=1;k<=c;k++)
                         s+=(j*k);
                  }
                  
                  min=Math.min(Math.abs(s-d),min);
              System.out.println(a+" "+b+" "+i+" "+c+" "+s+" "+min+" "+ans+" "+pos);
              }
          }
            if(min<ans)
            {
         ans=min;
         pos=a;
            }
            if(min==d)
                break;
            a++;
        }
    }

}
//2772