/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseqprime;

/**
 *
 * @author Ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Main t=new Main();
 int y,z,max=0;
 for(int a=1;a<1000;a++)
 {
     for(int b=1;b<1000;b++)
     {
      int x;

      int n=0;
         do
         {
            
              x=Math.abs(t.prime(n,a,b));
              n++;
         } while(t.isPrime(x));
        if(n>max)
        {
            max=n;y=a;z=b;

          System.out.println(a+" "+b+" "+n);
     }}
 }

  }
int prime(int n,int a,int b)
{
    return (n*n-a*n-b);
}
boolean isPrime(int x)
{
    int flag=0;
    for(int i=2;i<=Math.sqrt(x);i++)
    {
        if(x%i==0)
        { flag=1;
          break;
        }
    }if(flag==0) return true;else return false;
}
}
