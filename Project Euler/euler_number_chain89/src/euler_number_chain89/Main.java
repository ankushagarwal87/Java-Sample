/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_number_chain89;

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
        int x=10000000;
        int cnt=0;
        int arr[]={0,1,4,9,16,25,36,49,64,81};
        for(int i=1;i<x;i++)
        {
            int y=i,n=0;
            boolean flag=true;
            //System.out.println(i);
            while(y!=1 && y!=89)
            {
                n=0;
            while(y!=0)
            {
                int z=y%10;
                y/=10;
                n+=arr[z];
            }
                //System.out.print(n+" ");
            y=n;
        }
            if(y==89)
               cnt++;
                // System.out.println(++cnt+" "+i+" "+y);
    }
        System.out.println(cnt);
    }
}
