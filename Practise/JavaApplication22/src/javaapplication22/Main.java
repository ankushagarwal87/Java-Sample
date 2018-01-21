/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication22;

/**
 *
 * @author Ankush
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]=new int[10000];

        for(int i=1;i<=1000;i++)
        {
            int k[]=new int[10000];
        k[0]=1;
            for(int j=1;j<=i;j++)
            {
                for(int l=9996;l>=0;l--)
                {
                k[l]=k[l]*i;
                    k[l+3]+=k[l]/1000;
                    k[l+2]+=k[l]/100;
                   k[l+1]+=k[l]/10;
                    k[l]%=10;

       }

            }
                 for(int l=0;l<20;l++)
                {
                   a[l]+=k[l];
                if(a[l]>9)
                   {

                    a[l+1]+=a[l]/10;
                    a[l]%=10;
                    }

                 }
         for(int l=0;l<20;l++)
                  if(i==7) System.out.println(k[l]);

         }

}
}
