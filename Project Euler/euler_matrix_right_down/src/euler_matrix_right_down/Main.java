/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_matrix_right_down;
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
        int p=5;
        int q=2*p-1;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[][]=new int[p][p];
        for(int i=0;i<p;i++)
        {
            String s=br.readLine();
            String sd[]=new String[p];
            sd=s.split(" ");
           // System.out.println(s);
            for(int j=0;j<p;j++)
            {
               // System.out.print(sd[j]+" ");
               arr[i][j]=Integer.parseInt(sd[j]);
               //System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int res[][]=new int[q][p];
        int r=0,c=0;
        for(int i=0;i<p;i++)
        {
           for(int j=0;j<p;j++)
           {
               res[r+j][c]=arr[j][i];
           }
           r++;
           c++;
        }
        for(int i=0;i<q;i++)
        {
            for(int j=0;j<p;j++)
                System.out.print(res[i][j]+" ");
            System.out.println();
        }
        int ans[][]=new int[q][p];
        ans[0][0]=res[0][0];
        int x=0;
        for(int i=1;i<q;i++)
        {
            for(int j=0;j<p;j++)
            {
                if(j==0)
                    ans[i][j]=ans[i-1][j]+res[i][j];
                 else
                     ans[i][j]=res[i][j]+Math.min(ans[i-1][j-1],ans[i-1][j]);
                if(i==j)
                      ans[i][j]=ans[i][j]+ans[i-1][j-1];
            }
          /* if(i<p)
                x++;
            else x--;
            if(x>0)
            ans[i][x]=ans[i][x]+ans[i-1][x-1];
   */     }
         for(int i=0;i<q;i++)
        {
            for(int j=0;j<p;j++)
                System.out.print(ans[i][j]+" ");
            System.out.println();
        }
    }
}
