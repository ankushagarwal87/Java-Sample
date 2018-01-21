/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_pascal_203;

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
        long arr[][]=new long[52][52];
        arr[0][0]=1;arr[1][0]=1;arr[1][1]=1;
        long max=0;
        long re[]=new long[2500];
        int k=0;
        for(int i=2;i<51;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0 || i==j)
                arr[i][j]=1;
                else
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
max=Math.max(max,arr[i][j]);
       //   System.out.print(arr[i][j]+" ");
                //check(arr[i][j]);
            }
         // System.out.println();
        }
        System.out.println(max);
        long a[]=new long[51*51];
        int y=0;
        for(int i=0;i<51;i++)
        {
            for(int j=0;j<=i;j++)
            {
                int f=0;
                for(int l=0;l<y;l++)
                {
                    if(arr[i][j]==a[l])
                    {
                        f=1;
                        break;
                    }
                }
                if(f==0)
                {
                   //System.out.println(y+" "+arr[i][j]);
                    a[y++]=(long)arr[i][j];
                }
            }
        }
        int z[]=check(max);
        for(int i=0;z[i]>0;i++)
        {
            k=i;
            //System.out.println(z[i]+" "+i);
        }
        long sum=0;
        for(int i=0;i<y;i++)
        {
               int cnt=0;
                for(int l=0;l<=k && (z[l]*z[l])<=a[i];l++)
                {
                    long g=z[l]*z[l];
                  if(a[i]%g==0)
                  {
                     System.out.print(a[i]+"ads");
                     cnt=1;
                     break;
                  }
               }
                if(cnt==0)
                    sum+=a[i];
             
         System.out.println(i+" "+a[i]+"\t"+sum);
       }
        System.out.println(sum);
    }

    static int[] check(long x)
    {
        int y=(int)Math.sqrt(x);
        int res[]=new int[y];
        int k=0;
        for(int i=2;i<=Math.sqrt(x);i++)
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
                res[k++]=i;
            }
        }
        return res;
    }
}
//34029210557338    32167674211305