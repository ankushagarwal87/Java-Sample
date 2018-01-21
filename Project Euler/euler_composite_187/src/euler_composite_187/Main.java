/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_composite_187;

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
        int n=100000000;
     int arr[]=new int[100000];
        int k=0;
        int cnt=0;
       for(int i=2;i<=Math.sqrt(n);i++)
        {
            int f=0;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    f=1;
                    break;
                }
            }
             if(f==0)
             {
                    arr[k++]=i;
                  // System.out.println(i+" "+arr[k-1]);
        }
        }
        cnt=k;
        for(int i=4;i<=n;i++)
        {
            int a=(int)Math.sqrt(i);
            int b=0;
            int c=i;
            for(int j=0;j<k && arr[j]<=a;j++)
           {
                while(arr[j]!=0 && c%arr[j]==0)
               {
                   c/=arr[j];
                   b++;
           //       a=c;
                   if(b>1)
                   {
                       j=i;
                       break;
                   }

               }
             
            }
             if(b==1)
             {
                 cnt++;
            //  System.out.println(i+" "+b+" "+a+" "+c+" "+cnt);
             }
            if(i%10000000==0)
                System.out.println(i+" "+cnt);
        }
    }

}
//17427258