/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hardwarestore;
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
        String s[]=new String[t];
        String n[]=new String[t];
        for(int i=0;i<t;i++)
        {
            n[i]=br.readLine();
            s[i]=br.readLine();
        }
        for(int i=0;i<t;i++)
        {
            String a[]=s[i].split(" ");
            int x=Integer.parseInt(a[0])*100+Integer.parseInt(a[1])*10+Integer.parseInt(a[2]);
          //  System.out.println(x);
           int y=0;
            for(int j=9;j>=0;j--)
            {
                for(int k=9;k>=0;k--)
                {
                     y=j*10000+x*10+k;
                    if(y%(Integer.parseInt(n[i]))==0)
                    {
                        j=-1;
                        break;
                    }
                }
            }
           if(y/10000 !=0)
           System.out.println(y/10000+" "+y%10+" "+y/Integer.parseInt(n[i]));
           else
               System.out.println(0);
        }

    }

}
