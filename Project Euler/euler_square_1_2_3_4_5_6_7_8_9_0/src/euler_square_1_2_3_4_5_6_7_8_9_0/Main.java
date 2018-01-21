/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_square_1_2_3_4_5_6_7_8_9_0;
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
        long x=1020304050607080900l;
        System.out.println(x+" "+(long)1389019170*1389019170+" "+(int)Math.sqrt(1929374254627488910L));
        //double b=Math.sqrt(a);
            for(long b=9;b>=0;b--)
            {
                for(long c=9;c>=0;c--)
                {
                    for(long d=9;d>=0;d--)
                    {
                        for(long e=9;e>=0;e--)
                        {
                            for(long f=9;f>=0;f--)
                            {
                                for(long g=9;g>=0;g--)
                                {
                                    for(long h=9;h>=0;h--)
                                    {
                                        for(long i=0;i<10;i++)
                                        {
                                            for(long j=0;j<10;j++)
                                            {

                                               long y=(x+j*10+i*1000+h*100000+g*10000000+f*1000000000+e*(long)Math.pow(10,11)+d*(long)Math.pow(10,13)+c*(long)Math.pow(10,15)+b*(long)Math.pow(10,17));
                                             double p=Math.sqrt(y);
                                             double q=(Math.ceil(Math.sqrt(y)));
                                             double r=(Math.floor((Math.sqrt(y))));
                                             if(p==q && p==r)
                                                 System.out.println("dasdasdas"+b+" "+c+" "+d+" "+e+" "+f+" "+g+ " "+h+" "+i+" "+j+" "+x+" "+y+" "+p+" "+q+" "+r);
                                       System.out.println(b+" "+c+" "+d+" "+e+" "+f+" "+g+ " "+h+" "+i+" "+j+" "+x+" "+y+" "+p+" "+q+" "+r);
//1389019170
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
