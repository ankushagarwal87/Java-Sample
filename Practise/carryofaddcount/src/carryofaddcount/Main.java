/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package carryofaddcount;
import java.io.*;
/**
 *
 * @author ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException  {
        // TODO code application logic here
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
       String s=br.readLine();
        while(!(s.equals("0 0")))
        {
            String a[]=s.split(" ");
            int x=Integer.parseInt(a[0]);
            int y=Integer.parseInt(a[1]);
            int max=Math.max(x, y);
           int cnt=0;
            for(int j=0;j<=Math.log10(max);j++)
            {
                int c=x%10+y%10;
                if(c>9)
                    cnt++;
                x/=10;
                y/=10;
            }
          if(cnt==0)
              System.out.println("No carry operation.");
          else if(cnt==1)
              System.out.println("1 carry operation.");
          else
              System.out.println(cnt+" carry operations.");
    s=br.readLine();
        }
    }
}
