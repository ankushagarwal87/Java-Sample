/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication9;

/**
 *
 * @author Ankush
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,c;
       long s=0;
        for(i=2;i<=2000000;i++)
        {c=0;
         int k=(int)Math.sqrt(i);
           for(j=2;j<=k;j++)
           {
               if(i%j==0)
               {c=1;
               break;}
          }
         if(c==0)
             s+=i;

        }System.out.println(s);
    }

}
