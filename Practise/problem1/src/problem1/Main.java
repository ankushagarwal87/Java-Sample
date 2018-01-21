/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package problem1;
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
        int brr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            String x=br.readLine();
            String s[]=x.split(" ");
            arr[i]=Integer.parseInt(s[0]);
            brr[i]=Integer.parseInt(s[1]);
        }
        for(int i=0;i<n;i++)
        {
            int a=rev(arr[i]);
            int b=rev(brr[i]);
            int c=a+b;
            int sum=rev(c);
            System.out.println(sum);
        }


    }

  static int rev(int p)
    {
        int x=0;
        while(p!=0)
        {
            int w=p%10;
            x=x*10+w;
            p/=10;
        }
        return x;
    }



}
