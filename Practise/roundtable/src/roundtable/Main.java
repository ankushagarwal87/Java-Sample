/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package roundtable;
import java.io.*;        /**
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
        int c=0;int n=0;
    String s=br.readLine();
        int x=s.indexOf(' ');
        for(int i=0;i<x;i++)
            c=c*10+s.charAt(i)-48;
        for(int i=x+1;i<s.length();i++)
            n=n*10+s.charAt(i)-48;
         System.out.println(c+" "+x+" "+n);

        int d[][]=new int[n][n];
         for(int i=0;i<n;i++)
        {
           s=br.readLine();
            for(int j=0;j<n;j++)
            d[i][j]=s.charAt(2*j)-48;
         }
         /*      x=s.indexOf(' ');
        for(int i=0;i<x;i++)
            c=c*10+s.charAt(i);
        for(int i=x;i<s.length();i++)
            n=n*10+s.charAt(i);
    */
 for(int i=0;i<n;i++)
 {
     for(int j=0;j<n;j++)
     {
//          System.out.print(d[i][j]);
         if(d[i][j]==1)
         d[j][i]=1;
     }
  //    System.out.println();
 }
 String a[]=new String[100];
 a[0]="";
  int t=0;
 for(int k=0;k<n;k++)
 {
     a[t]+=k;
     int i=k;
     for(int j=0;j<n;j++)
     {
         System.out.println(a[t]+" "+a[t].indexOf(String.valueOf(j)));
         if(d[i][j]!=1 && a[t].indexOf(String.valueOf(j))<0)
         {
             
             a[t]+=j;
             i=j;
               j=-1;
         }
         
     }
     System.out.println(a[t]+" "+t);
     if(a[t].length()==n)
         t++;
     a[t]="";
 }
 
 
 
 }
    
}