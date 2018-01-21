/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package combinationcook2;
import java.io.*;
import java.math.*;
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
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        String s[]=new String[t];
        for(int i=0;i<t;i++)
            s[i]=br.readLine();
        for(int i=0;i<t;i++)
        {
            String a[]=new String[2];
            a=s[i].split(" ");
            long n=Long.parseLong(a[0]);
            long c=Long.parseLong(a[1]);

        }
    }

}
