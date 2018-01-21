/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package primecombination;

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

        int a[]=new int[5];
        int flag=0,b=0,c=0,d=0,e=0,s=(7+19+ 97+ 3727+451177);
        for(int i=3;i<s/5;i=i+2)
        {
            if(isPrime(i))
            {
                a[0]=i;
              //  System.out.println("frst"+" "+i);
                for(int j=i+2;j<s/4;j++)
                {
                    if((a[0]+4*j)<s)
                    {
                        if(isPrime(j))
                    {
                        a[1]=j;
                 //     System.out.println("sec"+" "+j);
                        if(comb(a))
                        {
                   //         System.out.println(a[0]+" "+a[1]+"ffth");
                            b=1;
                            for(int k=j+2;k<s/3;k++)
                            {
                                if((a[0]+a[1]+3*k)<s)
                                {
                                    if(isPrime(k))
                                {
                                    a[2]=k;
                     //               System.out.println("sxth"+" "+k);
                                    if(comb(a))
                                    {
                                   //     System.out.println(a[0]+" "+a[1]+" "+a[2]+"snth");
                                        c=1;
                                        for(int l=k+2;l<s/2;l++)
                                        {
                                            if((a[0]+a[1]+a[2]+2*l)<s)
                                            {
                                                if(isPrime(l))
                                           {
                                                 a[3]=l;
                                               //System.out.println("eight"+" "+l);
                                                if(comb(a))
                                                 {
                                                       System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+"nine");
                                                        d=1;
                                                         for(int m=l+2;m<s;m++)
                                                            {
                                                                   if((a[0]+a[1]+a[2]+a[3]+m)<s)
                                                                   {
                                                                       if(isPrime(m))
                                                                   {
                                                                         a[4]=m;
                                                                //       System.out.println("tnth"+" "+m);
                                                                        if(comb(a))
                                                                        {
                                                                                 System.out.println("                            "+a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]+" "+"final"+" "+s);
                                                                                    e=1;
                                                                                    flag=1;
                                                                                    if((a[0]+a[1]+a[2]+a[3]+a[4])<s)
                                                                                    {
                                                                                        s=(a[0]+a[1]+a[2]+a[3]+a[4]);
                                                                                        System.out.println("                                                 "+s);
                                                                                    }
                                                 }
                                                                       }
                                            }else
                                                break;

                                        }
                                    }
                        }
                    }else
                        break;
                }
            }
        }
    }else break;
                            }
        }
    }
            }else break;
                }
        }
    }}
   static boolean isPrime(long a)
    {
        boolean q=true;
        for(long j=2;j<=(long)Math.sqrt(a);j++)
        {
            if(a%j==0)
            {
                q=false;
                break;
            }
        }
        return q;
    }
   static boolean comb(int x[])
   {
       for(int i=0;i<5;i++)
       {
           int p=(int)Math.log10(x[i]);
           for(int j=0;j<5;j++)
           {
               int q=(int)Math.log10(x[j]);
             //  System.out.println(x[i]+" "+x[j]+"thrd"+" "+p+" "+q);
               if((x[i]!=0 && x[j]!=0 && x[i]!=x[j]) && (!isPrime((long)(x[i]*Math.pow(10,q+1))+x[j]) || !isPrime((long)((x[j]*Math.pow(10,p+1))+x[i]))))
               {
               // System.out.println(x[i]+" "+x[j]+"frth");
                   return false;
               }
           }

      }
       return true;
   }
}
