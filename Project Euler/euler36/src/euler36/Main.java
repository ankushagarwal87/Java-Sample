/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;

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
        int sum=0;
        Main t=new Main();
        for(int i=1;i<1000000;i++)
        {
            if(i==t.f(i,10))
           {
               int b[]=new int[50];
                   long l=0;
               b=f(i);
               for(int j=b.length-1;j>=0;j--)
                   {
                   l=(l*10+b[j]);
          
               }
             if(l==t.f(i,2)){sum+=i;
             System.out.println(i+" "+l);
             }}}
        System.out.println(sum);}


    long f(int x,int y)
    {

     long n=0;while(x!=0)
            {
              n=n*10+x%y;
              x/=y;

             }
     return n;
    }
static int[] f(int x)
{int j=0;
    int a[]=new int[32];
    while(x!=0)
    {
        a[j++]=x%2;
        x/=2;

    }return a;
}

}