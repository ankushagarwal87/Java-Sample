/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_right_angle_length;
//import java.math.*;
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
      /*  int tot=0;
        System.out.println(1500000L*1500000L);
        for(long l=3l;l<1500000;l++)
        {
            long a=l/3;
            int cnt=0;
            for(long i=1;i<=a;i++)
            {
                for(long j=i+1;j<=(l-i)/2;j++)
                {
                   // long k=l-i-j;
                    //{
                        if(((long)l*l-(long)2*l*(i+j)+(long)2*i*j)==0)
                        //if(Math.sin(Math.asin(i*1.0/k)+Math.asin((j*1.0/k)))==1)
                        {
                         /*   BigInteger b=new BigInteger(String.valueOf(i));
                            BigInteger c=new BigInteger(String.valueOf(j));
                            BigInteger d=new BigInteger(String.valueOf(k));
                            b=b.multiply(b);
                            c=c.multiply(c);
                            d=d.multiply(d);
                            if((b.add(c).equals(d)))
                            {
                         /cnt++;
                      //   System.out.println(l+" "+i+" "+j+" "+k);
                          if(cnt>1)
                          {
                              //k=l;
                              j=l;i=l;
                              break;
                          }
                      //  }
                        //}
                       // if((i+j+k)>l)
                         //   break;
                    }
                }
            }
            if(cnt==1)
            {
                tot++;
            }  if(l%500==0)
                System.out.println(l+" "+tot);
            
        }
        long x=1500000;
        //long arr[]=new long[x];
        int k=0;
        long y=(x*x)*1L;
       /* for(long i=0;i<=x;i++)
        {
            if(Math.sqrt(i)==Math.floor(Math.sqrt(i)))
            {
              System.out.println(k+" "+i+" "+Math.sqrt(i));
                arr[k++]=i;
            }
        }
        int ans[]=new int[(int)x+1];
for(long i=1;i<x ;i++)
{
    long w=i;
    for(long j=1;j<w;j++)
    {
        long a=i*i-j*j;
        int b=(int)Math.sqrt(a);
        int c=(int)(i+j+b);
        if(c>x)
            break;
        if(Math.sqrt(a)==Math.floor(Math.sqrt(a)))
        {
            ans[c]++;
            w=b;
        //    System.out.println(a+" "+i+" "+j+" "+b+" "+c);
            //break;
        }       
    }
    if(i%10000==0)
   System.out.println(i);
    
}
        int tot=0;
        for(int i=1;i<=(int)x;i++)
        {
            if(ans[i]==1)
                tot++;
            if(i%10000==0)
                System.out.println(tot);
        }*/
int x=1500000;
int arr[]=new int[x+1];
for(int m=2;m<=(int)Math.sqrt(x);m++)
{
    for(int n=1;n<m;n++)
    {
       // System.out.println(m+" "+n);
        if(((m%2==0)||(n%2==0)) && coprime(m,n))
        {
            int y=2*m*m+2*m*n;
            if(y>x)
                break;
            arr[y]++;
            int a=m*m-n*n;
            int b=2*m*n;
            int c=m*m+n*n;
            //System.out.println(a+" "+b+" "+c+" "+y);
        }
    }
}
int s=0;
int ans[]=new int[x+1];
for(int i=1;i<=x;i++)
{
    if(arr[i]==1)
    {
        for(int j=1;j*i<=x;j++)
        {
            ans[j*i]++;
           // System.out.println(i+" "+j*i);
        }
    }
}
for(int i=1;i<=x;i++)
{
    if(ans[i]==1 )
    {
        s++;
        System.out.println(i+" "+s);
    }
}




    }
static boolean coprime(int a,int b)
{
    int c=0;
    while(b!=0)
    {
        c=a%b;
        a=b;
        b=c;
    }
    if(a==1)
        return true;
    else return false;
}
}





// 161667