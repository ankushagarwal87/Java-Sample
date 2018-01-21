package javaapplication10;


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
       int w;
       int k,j,x=0;
       char c[]=new char[10];
int p[]=new int[1000];
int d[]=new int[1000];

InputStreamReader i=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(i);
       w=Integer.parseInt(br.readLine());
       for(j=0;j<w;j++)
       {
           br.read(c);
           for(k=0;k<c.length;k++)
           {
        System.out.println(c[k]);

           if(c[k]>9 || c[k]<0) x=k;
           }
           for(k=0;k<x;k++)
           {
               p[j]=p[j]*10+c[k];
                  System.out.println(c[j]);
           }

           for(k=x+1;k<c.length;k++)
               d[j]=d[j]*10+c[k];
       }






    }



}
