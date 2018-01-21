/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package polygon;

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
       long a[]=new long[100000];
       long b[]=new long[100000];
       long c[]=new long[100000];
       long t=0l;
       for(int i=1;i<100000;i++)
       {
        a[i]=(long)(i*(i+1)/2);
       }
        for(int i=1;i<100000;i++)
       b[i]=(long)i*(3*i-1)/2;
        for(int i=1;i<100000;i++)
           c[i]=(long)(i*(2*i-1));
      for(int i=1;i<50000;i++)
      {
   
for(int j=i;j<100000;j++)
 if(c[i]==b[j])
   {
           System.out.println(c[i]+" "+i+" "+b[j]+" "+j);
              //for(int k=j;k<1000000;k++)
                //  if(a[k]==b[j])
                 //     System.out.println(a[k]+" "+k);7906276   1533776805 27693 15315337768053776805 31977

              }

      
    
}}
}