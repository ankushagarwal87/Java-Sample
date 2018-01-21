/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package productdivisor;
import java.io.*;
/**
 *
 * @author Ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
         long b=1;
            for(int j=2;j<=a[i]/2;j++)
            {
                if(a[i]%j==0)
                {
                  b*=j;
                   
                  b%=10000;
                    }
        }
         if(b!=0)
          System.out.println(a[i]+" "+b);
         else
               System.out.println(a[i]+ " 0000");
        }
}
}