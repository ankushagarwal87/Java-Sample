/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_dice_game_peter_colin;

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
        int x[]=new int[37];
        int y[]=new int[37];
        int p=0,q=0;
        for(int a=1;a<=4;a++)
        {
            for(int b=1;b<=4;b++)
            {
                for(int c=1;c<=4;c++)
                {
                    for(int d=1;d<=4;d++)
                    {
                        for(int e=1;e<=4;e++)
                        {
                            for(int f=1;f<=4;f++)
                            {
                                for(int g=1;g<=4;g++)
                                {
                                    for(int h=1;h<=4;h++)
                                    {
                                        for(int i=1;i<=4;i++)
                                        {
                                            p++;
                                            int z=a+b+c+d+e+f+g+h+i;
                                            x[z]++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

         for(int a=1;a<=6;a++)
        {
            for(int b=1;b<=6;b++)
            {
                for(int c=1;c<=6;c++)
                {
                    for(int d=1;d<=6;d++)
                    {
                        for(int e=1;e<=6;e++)
                        {
                            for(int f=1;f<=6;f++)
                            {
                                q++;
                                 int z=a+b+c+d+e+f;
                                 y[z]++;
                            }
                        }
                    }
                }
            }
         }
        double a[]=new double[37];
        double c[]=new double[37];
        double ans=0.0;
        for(int i=9;i<=36;i++)
        {
          a[i]=(x[i]*1.0)/p;
         int b=0;
         for(int j=6;j<i;j++)
            b+=y[j];
          c[i]=(b*1.0)/q;
          double d=1.0;
       //  for(int j=9;j<i;j++)
         //  d=d*(1-a[j]);
          ans=ans+(d*a[i]*c[i]);
          System.out.println(i+" "+a[i]+" "+b+" "+c[i]+" "+d+" "+d*a[i]*c[i]+" "+ans);

         }

        }



    }


//.5731441