/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package coloringcolarablegraphs;
import java.io.*;


/**
 *
 * @author ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int t=Integer.parseInt(br.readLine());
        int arr[][]=new int[t][503];
        int x[][][]=new int[t][10000][2];
        for(int i=0;i<t;i++)
        {
            String s=br.readLine();
            String a[]=new String[2];
            a=s.split(" ");
             arr[i][0]=Integer.parseInt(a[0]);
             arr[i][1]=Integer.parseInt(a[1]);
//            int x[][]=new int[m][2];
            for(int j=0;j<arr[i][1];j++)
            {
              s=br.readLine();
              a=s.split(" ");
            x[i][j][0]=Integer.parseInt(a[0]);
            x[i][j][1]=Integer.parseInt(a[1]);
            }
        }
         for(int i=0;i<t;i++)
         {
             int n=arr[i][0];
             int m=arr[i][1];
            int z[]=new int[n+1];
            int c=1;
            for(int j=1;j<=n;j++)
            {
                if(z[j]==0)
                {     z[j]=c;
                 for(int k=j+1;k<=n;k++)
                {
                  if(k!=j && f(x,j,k,m,i) && z[k]==0)
                    {
                    int sum=0;
                     // System.out.println(j+" "+k);
                       for(int l=1;l<=n;l++)
                    {
                        if(l!=j && l!=k && z[l]==c)
                        {
                            if(!f(x,l,k,m,i)){
                                sum++;
                                break;
                            }
                        }
                       }
                    if(sum==0 && z[k]==0 )
                    {
                     // System.out.println("ugk"+j+" "+k);
                    z[k]=c;
                    }
                    }
                 }
                c++;
            }
            }
            for(int j=1;j<=n;j++)
                //arr[i][j]=z[j];
                System.out.print(z[j]+" ");
            System.out.println();

        }/*
        for(int i=0;i<t;i++)
        {
            for(int j=1;arr[i][j]>0;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }*/
    }

   static boolean f(int x[][][],int a,int b,int m,int i)
   {
                for(int k=0;k<m;k++)
                {
                  if(x[i][k][0]==a && x[i][k][1]==b)
                   return false;
                  if(x[i][k][1]==a && x[i][k][0]==b)
                      return false;
         }
                return true;
   }

}
