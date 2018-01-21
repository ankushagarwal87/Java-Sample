/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package milestone;
import java.io.*;
/**
 *Team ID: 7225
 * Ankush Agarwal - Team Creator
ankushagarwal87@gmail.com
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
        int arr[][][]=new int[t][10000][2];
        int n[]=new int[t];
        for(int i=0;i<t;i++)
        {
        System.out.println();
           n[i]=Integer.parseInt(br.readLine());
           for(int j=0;j<n[i];j++)
        {
            String s=br.readLine();
            String a[]=new String[2];
            a=s.split(" ");
            arr[i][j][0]=Integer.parseInt(a[0]);
            arr[i][j][1]=Integer.parseInt(a[1]);
        }
    }
        for(int i=0;i<t;i++)
        {
           double slope[][]=new double[n[i]][n[i]];
            int m[]=new int[180];
            int m2[]=new int[90];
            for(int j=0;j<n[i];j++)
            {
                for(int k=j+1;k<n[i];k++)
                {
                    if(arr[i][k][0]-arr[i][j][0]!=0)
                    {
                         slope[j][k]=(double)(arr[i][k][1]-arr[i][j][1])/(arr[i][k][0]-arr[i][j][0]);
                          double z=slope[j][k];
                         z=Math.toDegrees(Math.atan(z));
                        if(z<0)
                            z+=90;
                         m[(int)z]++;
                         //System.out.println(j+" "+k+" "+slope[j][k]+ " "+z);
                    }
                    else
                    {
                        m[90]++;
                    }
               }
            }
            int flag[]=new int[n[i]];
             for(int j=0;j<n[i];j++)
            {
                 int cnt=1;
               for(int y=0;y<180 && flag[j]!=1;y++)
            {
                int pos=0;
                 int max=0;
                for(int k=0;k<180;k++)
            {
             if(m[k]>max)
             {   max=m[k];
                 pos=k;
            }
            }
            for(int k=j+1;k<n[i];k++)
            {
                if(flag[k]!=1)
                {
               double z=slope[j][k];
                z=Math.toDegrees(Math.atan(z));
                if(z<0)
                    z+=90;
                if(max==m[(int)z])
                {
                    cnt++;
                    flag[j]=1;flag[k]=1;
                    System.out.println(y+ " "+j+" "+k+" "+max+" "+cnt);
                }
            }
            }
            m[pos]=0;
               }
                 if(cnt>1 && flag[j]==1)
                 System.out.println(cnt);
             }
                

            }
    }
}
