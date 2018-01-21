/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package circularprime;

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
int c=0;
        for(int i=2;i<=1000000;i++)
        {
            int a[]=new int[14];
              
int y=i;
            int j=0;
            while(y!=0)
            {
                a[j++]=y%10;
                y/=10;
             
            }
         for(int k=0;k<j;k++)
             a[j+k]=a[k];

         
    int s=0;
            for(int k=0;k<j;k++)
            {
                int x=0;
               for(int l=j+k-1;l>=k;l--)
                     x=x*10+a[l];
                      
            
                            if(isPrime(x))
     s++;

                else break;
         }
            if(s==j)
            {
                System.out.println(i);
                c++;
            }

        }System.out.println(c);
    }
 static boolean isPrime(int n)
 {
     int flag=0;
     for(int k=2;k<=Math.sqrt(n);k++)
     if(n%k==0)
        {
     flag=1;break;
           }
   if(flag==0) return true ;else return false;
 }}
