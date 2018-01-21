/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package positionfinder;
import java.io.*;
/**Team ID: 7225
 *Ankush Agarwal
 * @author ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
      int sum[][]=new int[200][2];
      int arr[][][]=new int[100][200][200];
      int x[][]=new int[200][40000];
      //int ans[][][]=new int[200][40000][2];
      System.out.println();
       for(int i=0;i<t;i++)
        {
            String s=br.readLine();
            if(!s.equals(""))
                        {
            String a[]=new String[2];
            a=s.split(" ");
             int r=Integer.parseInt(a[0]);
            int q=Integer.parseInt(a[1]);
           // int arr[][]=new int[r][r];
            for(int j=0;j<r;j++)
            {
                s=br.readLine();
                a=s.split(" ");
                for(int k=0;k<r;k++)
                {
                arr[i][j][k]=Integer.parseInt(a[k]);
            }
            }
            sum[i][0]=q;
            sum[i][1]=r;
            for(int j=0;j<q;j++)
            x[i][j]=Integer.parseInt(br.readLine());
            System.out.println();
                        }
                        }
            for(int i=0;i<t;i++)
            {

            for(int j=0;j<sum[i][0];j++)
            {
int f=0;
               for(int k=0;k<sum[i][1];k++)
               {
                   for(int l=0;l<sum[i][1];l++)
                   {
                       if(arr[i][k][l]==x[i][j])
                       {
                           f=1;
                         System.out.println((k+1)+" "+(l+1));
                         k=sum[i][1];
                         break;
                       }
                   }
               }
if(f==0)
    System.out.println(-1);
            }
            System.out.println();
       }
       }
     
    }


