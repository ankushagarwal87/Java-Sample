/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_high_baseexponent_number;
import java.math.*;
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
double x=0.0;
int pos=-1;
        for(int i=0;i<1000;i++)
        {
        String s=br.readLine();
        String sd[]=new String[2];
        sd=s.split(",");
       // System.out.println(sd[0]+" "+sd[1]);
        int a=Integer.parseInt(sd[0]);
        int b=Integer.parseInt(sd[1]);
       //System.out.println(a+" "+b);
        double c=Math.log(a)*b;
       // System.out.println(i+" "+a+" "+b+" "+c);
        if(c>x)
        {
            x=c;
            pos=i;
            System.out.println(a+" "+b+" "+c+" "+pos);
        }
    }
    }
}
