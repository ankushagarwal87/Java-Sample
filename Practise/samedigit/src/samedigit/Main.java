/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package samedigit;

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
        int i=142857;
        {
              int a[]=new int[10];
            int n=i;
              while(n!=0)
                {
                    a[n%10]++;
                    n/=10;
                }
             int f=0;
            for(int j=2;j<=6;j++)
            {
                int b[]=new int[10];
                int x=i*j;
                while(x!=0)
                {
                    b[x%10]++;
                    x/=10;
                }
                for(int k=0;k<10;k++)
                {
                    System.out.println(a[k]+" "+b[k]);
                    if(a[k]!=b[k])
                     f=1;
           }}
             if(f==0)
                 System.out.println(i);


                }
            }
        



    

}
