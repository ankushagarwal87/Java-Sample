/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package anagram;
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
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int t=Integer.parseInt(br.readLine());
        String s[]=new String[t];
        for(int i=0;i<t;i++)
         s[i]=br.readLine();
        for(int i=0;i<t;i++)
        {
            String a[]=s[i].split(" ");
             int p[]=new int[26];
             int q[]=new int[26];
             if(a[0].length()!=a[1].length())
             {
                 System.out.println("NO");
                 continue;
             }
            for(int j=0;j<a[0].length();j++)
            {
             p[(a[0].charAt(j)-97)]++;
            }
            for(int j=0;j<a[1].length();j++)
            {
             q[(a[1].charAt(j)-97)]++;
            }
             int f=0;
             for(int j=0;j<26;j++)
            {
              if(p[j]!=q[j])
              {
                  f=1;
                  System.out.println("NO");
                  break;
              }
            }
             if(f==0)
             System.out.println("YES");
        }

    }

}
