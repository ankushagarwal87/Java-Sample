/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_concatenate_five_prime;

/**
 *
 * @author ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int arr[]=new int[30000];
        int k=0;
        for(int j=2;j<300000;j++)
        {
            if(isPrime(j))
            {
                arr[k++]=j;
             }
        }
int sum=500000;
        for(int i=0;i<k;i++)
        {
       //     int cnt=0;
            if(arr[i]<sum)
            for(int j=i+1;j<k;j++)
            {
             int x=concat(arr[i],arr[j]);
             if((arr[i]+arr[j])<sum)
             {
             if(isPrime(x) && isPrime(concat(arr[j],arr[i])))
             {
                // System.out.println(arr[i]+" "+arr[j]);
                 for(int a=j+1;a<k;a++) {
 if((arr[i]+arr[j]+arr[a])<sum)
 {
                     if(isPrime(concat(arr[i],arr[a]))&& isPrime(concat(arr[a],arr[i])) && isPrime(concat(arr[j],arr[a])) && isPrime(concat(arr[a],arr[j]))  )
                     {
                                  //    System.out.println(arr[i]+" "+arr[j]+" "+arr[a]);
                                      for(int b=a+1;b<k;b++)
                                      {
                                          if((arr[i]+arr[j]+arr[a]+arr[b])<sum)
                                          {
                                              if(isPrime(concat(arr[i],arr[b]))&& isPrime(concat(arr[b],arr[i])) && isPrime(concat(arr[j],arr[b])) && isPrime(concat(arr[b],arr[j])) && isPrime(concat(arr[a],arr[b])) && isPrime(concat(arr[b],arr[a])))
                     {
                                     // System.out.println(arr[i]+" "+arr[j]+" "+arr[a]+" "+arr[b]);
                                        for(int c=b+1;c<k;c++)
                                      {
                                           if((arr[i]+arr[j]+arr[a]+arr[b]+arr[c])<sum)
                                           {
                                          if(isPrime(concat(arr[i],arr[c]))&& isPrime(concat(arr[c],arr[i])) && isPrime(concat(arr[j],arr[c])) && isPrime(concat(arr[c],arr[j])) && isPrime(concat(arr[a],arr[c])) && isPrime(concat(arr[c],arr[a])) && isPrime(concat(arr[b],arr[c])) && isPrime(concat(arr[c],arr[b])))
                     {
                                      int temp=arr[i]+arr[j]+arr[a]+arr[b]+arr[c];
                                              System.out.println(arr[i]+" "+arr[j]+" "+arr[a]+" "+arr[b]+" "+arr[c]+" "+sum+" "+temp);
                                      sum=Math.min(sum,temp);
                                      }
                                           }
                                          else
                                              break;
                     }
                                      }
                     }
                                          else break;
                 }
             }
            }
 else break;
                 }
        }
    }
             else break;
            }
    }
    }
    static boolean isPrime(int x)
    {
        for(int i=2;i<=Math.sqrt(x);i++)
        {
            if(x%i==0)
                return false;
        }
        return true;
    }


    static int concat(int x,int y)
    {
        int p=0;
        int a=y;
         while(a!=0)
                {
                 p++;
                 a/=10;
                }
               return (x*(int)Math.pow(10.0,p)+y);
    }
}
