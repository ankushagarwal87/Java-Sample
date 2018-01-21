/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package spoj2;
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
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
  int t,i,j,k;
  int m[]=new int[10];
  int n[]=new int[10];
  String s[]=new String[10];
  t=Integer.parseInt(br.readLine());
  for(i=0;i<t;i++)
      s[i]=br.readLine();
for(i=0;i<t;i++)
{
     j=s[i].indexOf(' ');


  for(k=0;k<j;k++)
      m[i]=m[i]*10+s[i].charAt(k)-48;
  for(k=j+1;k<s[i].length();k++)
      n[i]=n[i]*10+s[i].charAt(k)-48;
  if(n[i]-m[i]<=100000)
  {
   
      for(k=m[i];k<=n[i];k++)
      {int c=0;
          for(j=2;j<=Math.sqrt(k);j++)
              if(k%j==0) {c++;break;}
       if(c==0 && k!=1)
           ;
      }
  }else
     
  System.out.println();
  }
 }
    }

