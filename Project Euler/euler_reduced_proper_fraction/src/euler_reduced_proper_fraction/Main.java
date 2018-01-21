/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_reduced_proper_fraction;
import java.math.*;
/**
 *
 * @author ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int d=1000000,k=0,num=0;
     //   double arr[][]=new double[9999999][2];
     double x=3/7d,y=2/5d;
     System.out.println(x+" "+y);
     double ans=0;
     //BigInteger c=new BigInteger("1");
        for(int i=d;i>0;i--)
        {
            //BigInteger a=new BigInteger(String.valueOf(i));
            for(int j=i*2/5;j<i;j++)
            {
                //BigInteger b=new BigInteger(String.valueOf(j));
                double z=(double)j/i;
                if(z>y && z<x && gcd(i,j)==1)
                {
                    //arr[k][0]=j;
                   // arr[k][1]=1;
                    //arr[k][1]=(double)(j*1.0/i);
                        y=z;
                        num=j;
                        System.out.println(i+" "+j+" "+y+" "+num);
                                        //k++;
                    //System.out.println(i+" "+j+" "+z+" "+k);
                }
                if(z>=x)
                    break;
            }
                //System.out.println(i+" "+k);
       }
    }

    static int gcd(int x,int y)
    {
        int z=0;
        while(y!=0)
        {
            z=x%y;
            x=y;
            y=z;
        }
        return x;
}
}