/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_repeatdecimal;
import java.math.*;
/**
 *
 * @author ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
   // BigDecimal a=new BigDecimal("1");
   // BigDecimal b=new BigDecimal("1");
    //    int ans=0;
  //   boolean flag=true;
        for(int i=983;i<984;i++)
        {
                 int arr[]=new int[1000];
                 int k=0;
       //    BigDecimal c=new BigDecimal(String.valueOf(983));
         
          // String s=b.toPlainString();
        //   double s=(double)1/i;
         //  System.out.println(b);
        int x=1,y=1,z=-1;
        int p=10;
        x*=p;
       while(y != 0)
                 {
                     y=x%i;
                     arr[k]=x/i;
                     k++;
                     z=arr[k-1];
                     x=y;
                     x*=p;
                     System.out.println(y+" "+z);
                 }
  //      for(int j=0;j<k;j++)
    //        System.out.print(arr[j]);
     //   System.out.println();
            
        }



          }

}
