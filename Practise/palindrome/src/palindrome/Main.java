/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;
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
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            String x=br.readLine();
            arr[i]=Integer.parseInt(x);
        }
        for(int i=0;i<n;i++)
        {
            int c=0;
            long l=(long)arr[i];
            while(c<=1000)
            {
            long a=rev(l);
            if(a==l)
            break;
            else
            {
            long s=(long)(a+l);
            l=s;
             c++;
            }
        }
            System.out.println(c+" "+l);

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


  
