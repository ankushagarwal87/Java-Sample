/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_primesquare_primecube_power4_sum;

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
        long x=50000000L;
        int cnt=0,k=0;
        int z=(int)Math.sqrt(x);
     int a=(int)Math.pow(x,1.0/2);
     int b=(int)Math.pow(x,1.0/3);
     int c=(int)Math.pow(x,1.0/4);
     int arr[]=new int[z];
              int res[]=new int[1200000];
       for(int i=2;i<=a;i++)
       {
           int y=0;
           for(int j=2;j<=Math.sqrt(i);j++)
           {
               if(i%j==0)
               {
                   y=1;
                   break;
               }
           }
           if(y==0)
               arr[k++]=i;
       }
       System.out.println(k+" "+arr[k-1]+" "+arr[k-1]*arr[k-1]+" "+Math.pow(x,1.0/2)+" "+Math.pow(x,1.0/3)+" "+Math.pow(x,1.0/4));
      for(int i=0;i<k;i++)
       {
           long sum=0L;
           //System.out.println("first"+" "+i+" "+sum);
           for(int j=0;j<k && arr[j]<=b;j++)
           {
           sum=(long)(arr[i]*arr[i]+(arr[j]*arr[j]*arr[j]));
             //  System.out.println("Second"+" "+i+" "+j+" "+sum);
               if(sum>=x)
                   break;
               for(int w=0;w<k && arr[w]<=c;w++)
               {
                 long q=(long)Math.pow(arr[w],4);
                  q=q+sum;
               // System.out.println("third"+" "+i+" "+j+" "+w+" "+sum);
                   if(q<=x && !present(res,(int)q,cnt))
                   {
                       res[cnt]=(int)q;
                       cnt++;
                    // System.out.println(arr[i]+" "+arr[j]+" "+arr[w]+" "+q+" "+cnt);
                   }
                   else if(q>=x)
                       break;
               }
           }
           if(i%100==0)
       System.out.println(i+" "+sum+" "+cnt);
       }
        System.out.println(cnt);
    }
    static boolean present(int a[],int b,int c)
    {
        for(int i=0;i<c;i++)
       {
            if(a[i]==b)
               return true;
       }
        return false;
    }

}
//907 50000552 863069  907 50000552 1139575   1097343
//. 1097343

