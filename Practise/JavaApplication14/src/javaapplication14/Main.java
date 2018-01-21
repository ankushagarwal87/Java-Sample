/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//triangle
package javaapplication14;
import java.io.*;
/**
 *
 * @author Ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
       int i,j,k;String s;
      
    int a[][]=new int[15][16];
 InputStreamReader isr=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(isr);
for(i=0;i<15;i++)
{
   s= br.readLine();k=0; 
    for(j=0;j<s.length();j++)
    {
        if(s.charAt(j)!=' ')
         a[i][k]=a[i][k]*10+(s.charAt(j)-48);
        
            else
            k++;
 
    }}k=0;
for(i=1;i<15;i++)
{
    for(j=0;j<=i;j++)
    {
        if(j==0)
            a[i][j]+=a[i-1][j];

        else
        {int y=Math.max(a[i-1][j-1],a[i-1][j]);
y=Math.max(y,a[i-1][j+1]);
a[i][j]+=y;}
                   k=Math.max(k,a[i][j]);
           System.out.print(a[i][j]+" ");
    }System.out.println();
}System.out.println(k);
    }
}

