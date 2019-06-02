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
        // TODO code application logic here
         //InputStreamReader isr=new InputStreamReader(System.in);
        //BufferedReader br=new BufferedReader(isr);
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
            long m=1;
            for(int j=0;j<n;j++)
             {
                arr[j]=Long.parseLong(xyz[j]);
                //m*=arr[j];
            }

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
        }
        pw.flush();
        pw.close();
        sc.close();
    }

}