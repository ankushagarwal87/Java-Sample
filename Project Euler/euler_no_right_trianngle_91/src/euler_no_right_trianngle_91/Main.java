/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_no_right_trianngle_91;

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
        int x=51;
        int cnt=0;
        for(int a=0;a<x;a++)
        {
            for(int b=0;b<x;b++)
            {
                for(int c=0;c<x;c++)
                {
                    for(int d=0;d<x;d++)
                    {
                        int p=a*a+b*b;
                        int q=c*c+d*d;
                        int r=Math.abs(c-a);
                        int s=Math.abs(d-b);
                        int t=r*r+s*s;
                        int max;
                        if(p!=0 && q!=0 && t!=0)
                        {
                        if(p>q && p>t)
                        max=p;
                        else if(q>p && q>t)
                            max=q;
                        else
                            max=t;
                        if((p+q+t)==2*max)
                           cnt++;// System.out.println(a+" "+b+" "+c+" "+d+" "+(++cnt));
                    }
                    }
                }
            }

        System.out.println(cnt);
    }
    }
}
//14234*2