/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package millionprime;

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
 int a[]=new int[20];//7830457
 a[0]=1;
 for(int i=1;i<=7830457;i++)
 {
     for(int j=10;j>=0;j--)
     {
            if(a[j]>9)
         {
             a[j]-=10;
             a[j+1]++;
         }
         a[j]*=2;
         if(a[j]>9)
         {
             a[j]-=10;
             a[j+1]++;
         }
        }
  }
 
  for(int j=10;j>=0;j--)
  {
   a[j]*=28433;
   for(int k=j;k<j+6;k++)
   {
       a[k+1]+=a[k]/10;
       a[k]%=10;

   }
  }
  for(int j=10;j>=0;j--)
  {
   System.out.println(a[j]);
  }
    }
}