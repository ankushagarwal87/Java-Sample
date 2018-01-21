/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_radical_prime_factor_product;

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
        int x=100000;
        //int y=(int)Math.sqrt(x);
        int arr[]=new int[x];
        int k=0;
        for(int i=1;i<=x;i++)
        {
            int a=0;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    a=1;
                    break;
                }
            }
            if(a==0)
            arr[k++]=i;
        }
        int ans[]=new int[x+1];
      //  System.out.println(k+" "+arr[k-1]);
        for(int i=1;i<=x;i++)
        {
            int z=0;
            int q=i;
            ans[i]=1;
            //int p=(int)Math.sqrt(i);
            while(z<k && arr[z]<=q)
            {
                if(q%arr[z]==0)
                {
                    q=q/arr[z];
                    ans[i]=ans[i]*arr[z];
                }
                z++;
            }
            System.out.println(i+" "+z+" "+ans[i]);
        }
        int res[]=new int[x+1];
        for(int i=1;i<=x;i++)
          res[i]=ans[i];
for(int i=1;i<=x/10;i++)
{
    for(int j=i+1;j<=x;j++)
    {
        if(ans[j]<ans[i])
        {
          // res[i]=j;
            int temp=ans[i];
            ans[i]=ans[j];
            ans[j]=temp;
           //res[j]=i;
        }
    }
    System.out.println(i+" "+res[i]+" "+ans[i]);
}
        for(int i=1;i<=x;i++)
            if(res[i]==ans[x/10])
                System.out.println(i);
    }
}
//21417