/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication13;

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
   int a[]=new int[1000];
   a[0]=1;
   int i,j;
   long s=0;
           for(i=1;i<=100;i++)
           {

               for(j=0;j<1000;j++)
               
                   a[j]*=i;
                 

                 for(j=0;j<999;j++)
                   if(a[j]>9)
                   {
                              a[j+1]+=a[j]/10;
                                 a[j]%=10;
                   }

               }
   for(j=0;j<1000;j++)
   s+=a[j];
System.out.println(s);
   }       
}
