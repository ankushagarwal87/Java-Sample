/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package overlap;
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
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int t=Integer.parseInt(br.readLine());
        String arr[]=new String[t];
        int c[]=new int[t];
        int d[]=new int[t];
        int e[]=new int[t];
        int f[]=new int[t];
       for(int i=0;i<t;i++)
        {
           String s=br.readLine();
            String a[]=new String[4];
            a=s.split(" ");
            int x1=Integer.parseInt(a[0]);
            int y1=Integer.parseInt(a[1]);
            int x2=Integer.parseInt(a[2]);
            int y2=Integer.parseInt(a[3]);
             s=br.readLine();
             a=s.split(" ");
            int p1=Integer.parseInt(a[0]);
            int q1=Integer.parseInt(a[1]);
            int p2=Integer.parseInt(a[2]);
            int q2=Integer.parseInt(a[3]);
            if(p1>=x1)
            c[i]=p1;
            else
                c[i]=x1;
            if(q1>=y1)
            d[i]=q1;
            else
                d[i]=y1;
            if(p2<=x2)
            e[i]=p2;
            else
                e[i]=x2;
            if(q2<=y2)
            f[i]=q2;
            else
                f[i]=y2;


        }
        for(int i=0;i<t;i++)
        {
            if(c[i]<=e[i] && d[i]<=f[i])
System.out.println(c[i]+" "+d[i]+" "+e[i]+" "+f[i]);
            else
                System.out.println("No Overlap");
        }
    }

}
