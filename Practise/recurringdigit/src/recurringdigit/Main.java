/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package recurringdigit;

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
        int j=0;
  for(int i=1;i<=1000;i++)
  {
      double d=(double)100/i;
      
    if((double)(d*i)!=100)
    {
        a[j++]=i;
        System.out.println(i+" "+d);

    }
  }
    }}