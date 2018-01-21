/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler_diophantine;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here

        double cnt=0,pos=-1;
        for(int j=2;j<=1000;j++)
        {
            if(Math.sqrt(j)==Math.floor((Math.sqrt(j))))
            {
                System.out.println(j);
            }
            else
            {
              boolean flag=true;
               long y=(long)Math.sqrt(j)+1;
               long x;
                while(flag)
                {

                    x=(long)(y*y-1);
                    if(x%j==0)
                    {
                        x=x/j;
                    //if(x%j==1)
                   // {
                     //   long z=(long)((y*y)/j);
                      //  System.out.println(y+" "+x+" "+z);
                    if(Math.sqrt(x)==Math.floor(Math.sqrt(x)))
                    {
                     //cnt=Math.max(cnt,(int)Math.sqrt(x));
                     if(y>cnt)
                     {
                         cnt=y;
                         pos=(int)j;
                     }
                        System.out.println(j+" "+y+" "+Math.sqrt(x)+" "+cnt+" "+pos);
                        flag=false;
                    //}
                    }
                    }
                    y++;
                
                }
            }
        }
        System.out.println(cnt+" "+pos);
    }
}
//661