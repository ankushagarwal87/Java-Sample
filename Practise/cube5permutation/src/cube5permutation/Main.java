/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cube5permutation;

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
        int f=0;
        int a[]=new int[20];
        for(int i=3000;f!=1;i++)
        {
            per(i,a);
        }



    }
    static void per(int i,int a[])
    {
        long x=(long)i*i;
        while(x>0)
        {
            for(int k=0;k<19;k++)
            {
                if(a[k]>9)
                {
                    a[k+1]+=a[k]/10;
                    a[k]+=a[k]%10;
                }


                }
            }
        }


}
