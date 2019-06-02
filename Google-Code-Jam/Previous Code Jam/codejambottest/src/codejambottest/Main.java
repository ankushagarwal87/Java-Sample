/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package codejambottest;
import java.io.*;
import java.util.*;
/**
 *
 * @author ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        Scanner c=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int a[]=new int[t];
        for(int i=0;i<t;i++)
        {
            String x=br.readLine();
            //int p=x.charAt(0);
            //int o[]=new int[p];
            //int b[]=new int[p];
            int z=0;
            String r[]=new String[400];
            r=x.split(" ");
            int p=Integer.parseInt(r[0]);
            int o[]=new int[p];
            int b[]=new int[p];
            for(int j=1;j<r.length;j=j+2)
            {
                if(r[j].equals("O"))
                {
                    o[z]=Integer.parseInt(r[j+1]);
                    b[z]=0;
                }
                if(r[j].equals("B"))
                {
                    b[z]=Integer.parseInt(r[j+1]);
                    o[z]=0;
                }
                z++;
            }/*
            for(int j=2;j<x.length();j=j+4)
            {
                if(x.charAt(j)=='O')
                {
                    o[z]=(x.charAt(j+2))-48;
                    b[z]=0;
                }
                if(x.charAt(j)=='B')
                {
                    b[z]=(x.charAt(j+2))-48;
                    o[z]=0;
                }
                z++;
            }*/
         //   for(int j=0;j<z;j++)
           //   System.out.print("ASS"+o[j]+" "+b[j]);
            int time=0,ow=1,bw=1,ot=0,bt=0,op=0,bp=0,pos=0;
     boolean flag=true;
     while(pos<z)
     {
         if(o[pos]!=0 && o[pos]==ow)
         {
         op++;
         ot++;
         ow=o[pos];
         pos++;
         time++;
         if(bw<max(pos,b))
                     bw++;
         if(max(pos,b)!=0 && bw>max(pos,b))
             bw--;
           bt++;
         }
         else if(o[pos]!=0 && o[pos]<ow)
         {
           time++;
           ow--;
           ot++;
           bt++;
            if(bw<max(pos,b))
                     bw++;
           if(max(pos,b)!=0 && bw>max(pos,b))
               bw--;
         }
         else if(b[pos]!=0 && b[pos]==bw)
         {
          bp++;
         bt++;
         bw=b[pos];
         pos++;
         ot++;
         if(ow<max(pos,o))
                    ow++;
         if(max(pos,o)!=0 && ow>max(pos,o))
             ow--;

               time++;
         }
         else if(b[pos]!=0 && b[pos]<bw)
             {
             time++;
             bw--;
             ot++;
             bt++;
              if(ow<max(pos,o))
                    ow++;
             if(max(pos,o)!=0 && ow>max(pos,o))
                 ow--;
             }
         else
         {
         time++;
         if(ow<max(pos,o))
                     ow++;
         if(max(pos,o)!=0 && ow>max(pos,o))
             ow--;
       if(bw<max(pos,b))
                    bw++;
         if(max(pos,b)!=0 && bw>max(pos,b))
             bw--;
         ot++;
         bt++;
         }
        // System.out.println(time+" "+ot+" "+bt+" "+ow+" "+bw+" "+pos);
         a[i]=time;
     }
   }
        for(int i=0;i<t;i++)
            System.out.println("Case #"+(i+1)+": "+a[i]);
    }

    static int max(int pos,int a[])
    {
        for(int i=pos;i<a.length;i++)
        {
            if(a[i]>0)
                return a[i];
        }
        return 0;
    }

    static int way(int pos,int a[])
    {
        for(int i=pos+1;i<a.length;i++)
        {
            if(a[i]>0 && a[i]>=a[pos])
                return 1;
            else
                return 0;
        }
        return 1;
    }
}
