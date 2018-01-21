/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package primepower;

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
        for(int i=1501;i<2000;i++)
        {
            int a,b,c,d,e,f;
            for(int j=501;j<=i/2;j++)
            {
                a=j;
                b=i-a;
                for(int k=j+1;k<=i/2;k++)
                {
                    c=k;
                    d=i-c;
                    for(int l=k+1;l<=i/2;l++)
                    {
                        e=l;
                        f=i-e;
                        if(a!=b && a!=c && a!=d && a!=e && a!=f && b!=c && b!=d && b!=e && b!=f && c!=d && c!=e && c!=f && d!=e && d!=f && e!=f )
                    {
                      if(a<1001 && b<1001 && c<1001 && d<1001 && e<1001 && f<1001)
                        cnt++;
                 //     System.out.println(cnt);
                 System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+cnt);
                    }
                }
            }
            }
        }
        System.out.println(cnt);
    }

}
