/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler48;

/**
 *
 * @author Ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here/*

        int a[]=new int[25];

        for(int i=1;i<=1000;i++)
        {
            int k[]=new int[25];
        k[0]=1;
            for(int j=1;j<=i;j++)
            {
                for(int l=24;l>=0;l--)
                {
                    k[l]=k[l]*i;
    for(int t=0;t<24;t++)
    {
        
                   k[t+1]+=k[t]/10;
                    k[t]%=10;

       }}

            }
                 for(int l=0;l<24;l++)
                {
                   a[l]+=k[l];
                if(a[l]>9)
                   {

                    a[l+1]+=a[l]/10;
                    a[l]%=10;
                    }
              if(i==1000) System.out.println(a[l]);
                 }
         }



    }

}
