/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nextsmallestpalindrome;

/**
 *
 * @author ankush
 */

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
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        int t=Integer.parseInt(br.readLine());
       int arr[]=new int[t];
       for(int i=0;i<t;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
       for(int i=0;i<t;i++)
        {
           for(int j=arr[i]+1;;j++)
           {
        if(j==rev(j))
        {
            arr[i]=j;
            break;
        }
       }
           System.out.println(arr[i]);
    }

    }
     static long rev(long p)
    {
        long x=0;
        while(p!=0)
        {
            int w=(int)p%10;
            x=x*10+w;
            p/=10;
        }
        return x;
    }

}
