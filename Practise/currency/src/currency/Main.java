/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package currency;

/**
 *
 * @author Ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int a[]={1,2,5,10,20,50,100,200};
       int i=200;
       int SUM=0;
int b[]=new int[8];
           for(int j=0;j<8;j++)
           { int x=0;
               int y=1;
               while(x<=i)
               {
                   x=a[j]*y;y++;
               }
               b[j]=y;
           }
 for(int c=0;c<=b[7];c++)
 {
      for(int d=0;d<=b[6];d++)
      {
           for(int e=0;e<=b[5];e++)
           {
                for(int f=0;f<=b[4];f++)
                {
                   for(int p=0;p<=b[3];p++)
                    {
                        for(int q=0;q<=b[2];q++)
                        {
                             for(int r=0;r<=b[1];r++)
                                {
                                    for(int s=0;s<=b[0];s++)
                                     {
                                        int x=a[7]*c+a[6]*d+a[5]*e+a[4]*f+a[3]*p+a[2]*q+a[1]*r+a[0]*s;
                                         if(x==i)
                                            {SUM++;
                                                System.out.println(c+" "+d+" "+e+" "+f+" "+p+" "+q+" "+r+" "+s+" "+i);
                                         System.out.println(SUM);
                                         }

                                      }
                                 }
                            }
                        }
                   }
                }
             }
 }

    }}