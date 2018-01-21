/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package riled;
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
     String arr[]=new String[t];
     char ar[]=new char[t];
     for(int i=0;i<t;i++)
         arr[i]=br.readLine();
     for(int i=0;i<t;i++)
     {
         int s=0;
         for(int j=0;j<arr[i].length();j++)
         s+=(int)arr[i].charAt(j);
         ar[i]=(char)(s/arr[i].length());

     }
        for(int i=0;i<t;i++)
            System.out.println(ar[i]);
    }
}