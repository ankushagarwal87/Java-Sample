/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codejam_perfectharmony;
import java.io.*;
import java.util.*;
import java.math.*;
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
         InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        Scanner sc = new Scanner(new FileReader("input.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

        int t=Integer.parseInt(sc.nextLine());
        long ans[]=new long[t];
        for(int i=0;i<t;i++)
        {
            String s=sc.nextLine();
            String abc[]=new String[3];
            abc=s.split(" ");
            int n=Integer.parseInt(abc[0]);
              long a=Long.parseLong(abc[1]);
                long b=Long.parseLong(abc[2]);
            long arr[]=new long[n];
            s=sc.nextLine();
            String xyz[]=new String[n];
            xyz=s.split(" ");
            //long min=Long.parseLong(xyz[0]),max=0;
            for(int j=0;j<n;j++)
             {
                arr[j]=Long.parseLong(xyz[j]);
                //m*=arr[j];
               // min=Math.min(min,arr[j]);
                //max=Math.max(max,arr[j]);
            }
/*
            for(long j=a;j<=b;j++)
            {
                int cnt=0;
                for(int k=0;k<n;k++)
                {
                    if((arr[k]%j==0) || (j%arr[k]==0))
                    {
                        cnt++;
                      //  System.out.println(j+" "+arr[k]);
                       
                    }
                    else
                    {
                      break;
                    }
                }
                if(cnt==n)
                {  ans[i]=j;
                   // System.out.println(j);
                   break;
                }
        }
        }
        for(int i=0;i<t;i++)
        {
          
            pw.print("Case #"+(i+1)+": ");
            if(ans[i]==0)
                pw.print("NO");
            else
                pw.print(ans[i]);
              pw.println();
        }*/
for(long j=a;j<=b;j++)
{
           boolean c=mul(arr,n,j);
           if(c==true)
           {
               System.out.println(j+" "+i+" "+c);
               break;
           }
           else
               System.out.println(j+" "+i+" "+"NO");
}
}
         //  pw.flush();
              // pw.close();
        sc.close();

    }

    static boolean mul(long a[],int n,long p)
    {
       BigInteger i=new BigInteger("1");
       long x=1;
      for(int j=0;j<n;j++)
       {    
       
           BigInteger k=new BigInteger(String.valueOf(a[j]));
           i=i.multiply(k);
          long y=Math.max(x,a[j]);
          long z=Math.min(x,a[j]);
          while(z!=0)
          {
              long t=y%z;
              y=z;
              z=t;
         }
            x=y;
        }
       BigInteger s=new BigInteger(String.valueOf(x));
       i=i.divide(s);
        long q=i.longValue();
       System.out.println(i+" "+x+" "+s);
       if(x==p && q==p)
           return true;
              else
     return false;
    }
}

