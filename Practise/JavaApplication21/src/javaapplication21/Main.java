/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//spoj6
package javaapplication21;
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
        String s[]= new String[1000];
        char c[]=new char[1001];
        char x[]=new char[500];
        char y[]=new char[500];
        int z[]=new int[1000];
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int t=Integer.parseInt(br.readLine());
for(int i=0;i<t;i++)
    s[i]=br.readLine();
    for(int i=0;i<t;i++)
    {int k=0;
     c=s[i].toCharArray();
     for(int j=0;j<c.length;j++)
     if(c[j]<48 ||c[j]>57) {
         k=j;
         break;
     }
    for(int j=0;j<k;j++)
        x[j]=c[k-j-1];
     for(int j=0;j<c.length-k;j++)
         y[j]=c[c.length-j-1];
     if(c[k]=='+')
     {

int j=0;
         for( j=0;j<k && j<c.length-k-1;j++)
         {
             z[j]+=(x[j]-48+y[j]-48);
           if(z[j]>9)
           {
               z[j]-=10;
               z[j+1]++;
            }
         }
         for(int n=j;n<k;n++)
             z[n]=x[n]-48;
for(int n=j;n<c.length-k-1;n++)
    z[n]=y[n]-48;

for(int n=z.length-1;n>=0;n--)
    if(z[n]>0)
    {
        j=n;
        break;

    }


 System.out.print("               ");
      for(int n=k-1;n>=0;n--)
          System.out.print(x[n]);
System.out.println();
System.out.print("                 ");
System.out.print(c[k]);
for(int n=c.length-1;n>k;n--)
          System.out.print(y[n-k]);


     }

     }



    }



    

}
