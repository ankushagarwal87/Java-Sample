/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package holesintext;
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
        for(int i=0;i<t;i++)
         arr[i]=br.readLine();
 int a[]={1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
 for(int i=0;i<t;i++)
 {
     int sum=0;
     for(int j=0;j<arr[i].length();j++)
     {
         int c=arr[i].charAt(j)-65;
        // System.out.println(c);
         sum+=a[c];
     }
     System.out.println(sum);
 }
    }
}



