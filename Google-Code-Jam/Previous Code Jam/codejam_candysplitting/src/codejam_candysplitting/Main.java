/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package codejam_candysplitting;
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
        int ans[]=new int[t];
        for(int i=0;i<t;i++)
        {
            int n=Integer.parseInt(br.readLine());
            int a[]=new int[n];
            int b[]=new int[n];
            String s=br.readLine();
            String r[]=new String[n];
            r=s.split(" ");
            
            for(int j=0;j<n;j++)
            {
                a[j]=Integer.parseInt(r[j]);
                b[j]=binary(a[j]);
            }
            int max=0;
            /*
            for(int j=1;j<=n/2;j++)
            {
                for(int g=0;g<n;g++)
                {
                int x=b[g];
               // System.out.println(j);
                for(int k=0;k<n;k++)
                {
                    if(k!=g)
                     x=x^b[k];

                   int y=0,ac=0;
                    for(int l=0;l<n;l++)
                    {
                        if(l!=j)
                        {
                            y=y^b[l];
                            ac+=a[l];
                        }
                    }
                    if(x==y)
                    {
                        max=Math.max(ac, max);
                        System.out.println(ac);
                    }
                    }*/




            }
    }
    
   

    static int cal(int a,int b)
    {
        int d,e,f=0;
        int c=Math.max(a,b);
        while(c!=0)
        {
             d=a%10;
             e=b%10;
            if((d==1 && e==1) || (d==0 && e==0))
                                f=0;
            if((d==1 && e==0) || (d==0 && e==1))
                f=1;
        a/=10;
            b/=10;
        }
        return f;
    }

    static int binary(int a)
    {
       return (Integer.parseInt(Integer.toBinaryString(a)));
    }}
