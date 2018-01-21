/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_max_remainder_binomial;

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
        int ans=0;
        for(int i=3;i<=1000;i++)
        {
            int a=i*i;
            int n=1,k=0;
            int arr[]=new int[a];
            int max=0;
            while(true)
            {
                k=(2*n*i)%a;
                arr[k]++;
                max=Math.max(max,k);
               //System.out.println(i+" "+max+" "+k);
                if(arr[k]==2)
                    break;
                n=n+2;
            }
            ans+=max;
            System.out.println(i+" "+max+" "+ans);
        }
    }

}
//333082500