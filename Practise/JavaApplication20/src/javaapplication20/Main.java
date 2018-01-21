/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//spoj5 palindrome
package javaapplication20;
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
 char c[]=new char[1000000];
        String s[]=new String[10];
        InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
int t=Integer.parseInt(br.readLine());
for(int i=0;i<t;i++)
    s[i]=br.readLine();
for(int i=0;i<t;i++)
{
    int flag=1;
   c=s[i].toCharArray();
           while(flag!=0)
                {
                 flag=0;
                 c[c.length-1]++;
                 for(int j=c.length-1;j>0;j--)
                                    if(c[j]>57)
                                   {
                             
                                   c[j]-=10;
                                   c[j-1]++;
                                    }
                 for(int j=0;j<c.length/2;j++)
                                       if(c[j]!=c[c.length-j-1])
                                        {
                                   
                                        flag++;
                                        break;
                                          }
                }
                s[i]=String.copyValueOf(c);
                System.out.println(s[i]);
    }

}
}