/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package digitfactorial;

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
int ar[]={1,1,2,6,24,120,720,5040,40320,362880};
        for(int i=10;;i++)
  {
      int n=i,s=0;
      while(n!=0)
      {
          s+=ar[(n%10)];
          n/=10;
          if(s>i)n=0;
      }
      if(s==i) System.out.println(i);
  }

    }

}
