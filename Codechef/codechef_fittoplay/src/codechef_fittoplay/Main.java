/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package codechef_fittoplay;
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
     
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int t =Integer.parseInt(br.readLine());
        int ans[]=new int[t];
        for(int i=0;i<t;i++)
        {
            int n=Integer.parseInt(br.readLine());
            int arr[]=new int[n];
            String s[]=new String[n];
            String str =br.readLine();
            s=str.split(" ");
            int max=0;
            for(int j=0;j<n;j++)
            {
             arr[j]=Integer.parseInt(s[j]);
                for(int k=0;k<j;k++)
                {
                    if((arr[j]-arr[k])>max)
                     max=arr[j]-arr[k];
                }
            }
            ans[i]=max;

        }
        for(int i=0;i<t;i++)
        {
            if(ans[i] == 0)
                System.out.println("UNFIT");
            else
                System.out.println(ans[i]);
        }
    }

}
