/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package codejam_recylednumber;
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
        //System.out.println(Math.floor(Math.log10(11)));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int ans[]=new int[t];
        for(int i=0;i<t;i++)
        {
            String x=br.readLine();
            String r[]=new String[2];
            r=x.split(" ");
            int a=Integer.parseInt(r[0]);
            int b=Integer.parseInt(r[1]);
            int count=0;
            for(int j=a;j<b;j++)
            {
                int p=j/10;
                int m=j%10;
                int q=(int)(Math.floor(Math.log10(j)))+1;
                int pos[]=new int[q];
                int z=0;
                int f=0;
                for(int k=1;k<q;k++)
                {
                    f=0;
                     int s=m*(int)(Math.pow(10.0,(q-1)*1.0))+p;
                     pos[z++]=s;
                     int n=(int)(Math.floor(Math.log10(s)))+1;
                    if(s>j && s<=b && n==q)
                    {
                        for(int l=0;l<(z-1);l++)
                        {
                            if(s==pos[l])
                                f++;
                        }
                        if(f==0)
                        {   count++;
                    //  System.out.println(j+" "+s+" "+count+" "+p+" "+q+" "+m);
                     }
                       // else
                       //     System.out.println(j+" "+s+" "+count+" "+p+" "+q+" "+m+"gjkhgjhgjhgjhgjhgjhyj");
                    }

                    m=s%10;
                    p=s/10;

                }
            }
            ans[i]=count;
        }
        for(int i=0;i<t;i++)
        {
            System.out.println("Case #"+(i+1)+": "+ans[i]);
        }
    }
}