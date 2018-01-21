/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication16;
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
        int m=0,s=0,n=0,t,len=0,k,i,c,j,z=0;
        int x[]=new int[100];
        int a[]=new int[100000];
                InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
k=Integer.parseInt(br.readLine());
while(k!=0)
{
    a[len]=k;
k=Integer.parseInt(br.readLine());

len++;

}
for(i=0;i<len;i++)
{c=2;z=0;
 while(z!=1){
 k=a[i]*c;j=0;x[j]=k%10;z=0;m=0;n=0;k/=10;
  while(k!=0)
         {
     
      x[++j]=k%10;
k/=10;
  if(x[j]!=x[j-1]) z++;
      }
 if(z==1)
 {
     for(k=0;k<=j;k++)
     {
       if(x[k]==x[k+1]){s=x[k];m++;  }
       else break;
     }System.out.println(a[i]*c+" :"+(j-k)+" "+x[k+1]+" "+(m+1)+" "+s);


    }c++; }}

}}
