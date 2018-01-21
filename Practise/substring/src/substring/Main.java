/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package substring;

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
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int t=Integer.parseInt(br.readLine());
        String s[]=new String[t];
        for(int i=0;i<t;i++)
         s[i]=br.readLine();
        for(int i=0;i<t;i++)
        {
            String a[]=s[i].split(" ");
            if(a[0].contains(a[1]))
            System.out.println(1);
            else
            System.out.println(0);
        }

    }
}
