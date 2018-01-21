/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package abundant;

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
        int a[]=new int[50000];
        int k=0;
        long sum=0;
        for(int i=2;i<50000;i++)
        {
            int s=0;
            for(int j=1;j<i;j++)
                if(i%j==0) s+=j;
            if(i<s)
            {
                a[k++]=i;

            }
          int flag=0;

            for(int j=0;j<k;j++)
        {
            for(int l=0;l<k;l++)
            {
                if(i==(a[j]+a[l]))
                {
                    flag=1;
                j=k;
                  l=k;
                }
            }
        }
 if(flag==0)
 {
   sum+=i;
 System.out.println(i);
 }


    }
                System.out.println(sum);

}
}