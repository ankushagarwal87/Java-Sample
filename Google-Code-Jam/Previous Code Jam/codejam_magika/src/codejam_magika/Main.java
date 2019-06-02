/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package codejam_magika;
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
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int a[]=new int[t];
        String asd[]=new String[t];
        for(int i=0;i<t;i++)
        {
            asd[i]="";
            String x=br.readLine();
           String r[]=new String[400];
            r=x.split(" ");
            int c=Integer.parseInt(r[0]);
            String com[]=new String[c];
            for(int j=0;j<c;j++)
                com[j]=r[j+1];
            int d=Integer.parseInt(r[c+1]);
            String opp[]=new String[d];
            for(int j=0;j<d;j++)
                opp[j]=r[c+j+1+1];
            int n=Integer.parseInt(r[c+d+2]);
            String abc=r[c+d+3];
        //    char we[]=abc.toCharArray();
          //  String ans="";
            String xyz[]=new String[n];
            int pos=0;
           xyz[pos++]=String.valueOf(abc.charAt(0));
            for(int j=1;j<abc.length();j=j+1)
            {
                  char p=xyz[pos-1].charAt(0);
                  char q=abc.charAt(j);
                  int cnt=0;
               for(int k=0;k<c;k++)
               {
                 if((com[k].charAt(0)==p && com[k].charAt(1)==q) || (com[k].charAt(0)==q && com[k].charAt(1)==p))
                 {
                     cnt=1;
                     xyz[pos-1]=String.valueOf(com[k].charAt(2));
                    break;
                 }
              }
                  if(cnt==0)
                  {
                   xyz[pos++]=String.valueOf(q);
                  }
                 
                   //ans=ans+String.valueOf(p)+String.valueOf(q);
                for(int k=0;k<d;k++)
               {
                    cnt=0;
                 for(int l=0;l<pos;l++)
                 {
                     if((xyz[l].equals(String.valueOf(opp[k].charAt(0)))))
                             for(int m=0;m<pos;m++)
                             {
                             if(xyz[m].equals(String.valueOf(opp[k].charAt(1))))
                    cnt=1;
                 }
                 }
                 if(cnt==1)
                 {
                     for(int l=0;l<pos;l++)
                         xyz[l]="";
                     pos=0;
                     if(j<abc.length()-1)
                     {
                         j++;
                    xyz[pos++]=String.valueOf(abc.charAt(j));
                     }
                    break;
                 }
              }
               //  for(int k=0;k<pos;k++)
             //  System.out.println(j+" "+xyz[k]);
            }
for(int k=0;k<pos;k++)
    asd[i]+=xyz[k];
       }
        for(int i=0;i<t;i++)
        {
            System.out.print("Case #"+(i+1)+": [");
            if(asd[i].length()>0)
            {
            for(int j=0;j<asd[i].length()-1;j++)
            {
              System.out.print(asd[i].charAt(j)+", ");
            }
            System.out.print(asd[i].charAt(asd[i].length()-1)+"]");
            }
            else
                System.out.print("]");
            System.out.println();
            //System.out.println((12&5));
        }
    }
}
