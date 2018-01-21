/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_totient_relative_prime;
import java.math.*;
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
   /*     BigInteger i=new BigInteger("2");
        double ans=0;
        int pos=-1;
        BigInteger n=new BigInteger("1000000");
        BigInteger k=new BigInteger("1");
        for(;i.compareTo(n)<=0;i=i.add(k))
        {
             BigInteger j=new BigInteger("1");
             BigInteger cnt=new BigInteger("0");
             BigInteger a=i.divide(new BigInteger("2"));
            for(;j.compareTo(a)<=0;j=j.add(k))
            {
               // System.out.println("DASASD"+" "+i+" "+j+" "+i.gcd(j));
                if((i.gcd(j)).equals(k))
                {
                    cnt=cnt.add(k);
                    //System.out.println(i+" "+j);
                }
            }
             cnt=cnt.add(cnt);
             long x=i.longValue();
             long y=cnt.longValue();
            //  System.out.println(i+" "+cnt+" "+x+" "+y+" "+ans+" "+pos);
             double z=(double)(x*1.0/y);
             if(z>ans)
             {
                 ans=z;
                 pos=i.intValue();
             }
             System.out.println(x+" "+y+" "+z+" "+ans+" "+pos);
        }*/
        int arr[]=new int[10000000];
        int k=0;
        for(int i=2;i<=10000000;i++)
        {     
                if(isPrime(i))
                    arr[k++]=i;
        }

        double ans=0;
        int pos=-1;
        long cnt=0;
        double ans70=(double)(87109.0/79180.0);
        int pos70=-1;
    //    BigInteger p=new BigInteger("0");
        for(int i=2;i<=10000000;i++)
        {
            
            k=0;
            double a=i;
            int x=i;
      //      BigInteger m=new BigInteger(String.valueOf(i));
            if(isPrime(x))
                a=a-1;
            else
            while(arr[k]<=x)
            {
                
          //      BigInteger n=new BigInteger(String.valueOf(arr[k]));
                if(x%arr[k]==0)
                {
                    a=a*(1-(double)1/arr[k]);
                  //  System.out.println(i+" "+arr[k]+" "+k+" "+a+" "+x);
                }
                while(x%arr[k]==0)
                    x/=arr[k];
                k++;
            }
            cnt+=(long)a;
            double ratio=i/a;
            if(ratio>ans)
            {
                ans=ratio;
                pos=i;
            System.out.println("addddddddd"+i+" "+a+" "+ratio+" "+pos+" "+ans70);
        }

 //           if(i%10000==0)
            if(permutate(i,(int)a))
            {
                if(ratio<=ans70)
                {
                   ans70=ratio;
                   pos70=i;
                            System.out.println("answer70"+i+" "+a+ " "+cnt+" "+" "+ans70);
    }
    }
    }
    }
    static boolean isPrime(int a)
    {
        for(int i=2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
                return false;
        }
        return true;
    }

//(m) = m(1 - 1/p1)(1 - 1/p2)(1 - 1/p3)( . . . )(1 - 1/pn)
// 303963552391
    //8319823
    // 9699690 
static boolean permutate(int a,int b)
{
   int x[]=new int[10];
   int y[]=new int[10];
   while(a!=0)
   {
       x[a%10]++;
       a/=10;
   }
   while(b!=0)
   {
       y[b%10]++;
       b/=10;
   }
   for(int i=0;i<10;i++)
   {
       if(x[i]!=y[i])
           return false;
   }
   return true;
}
}