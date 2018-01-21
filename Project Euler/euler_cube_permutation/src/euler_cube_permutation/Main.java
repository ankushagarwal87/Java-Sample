/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_cube_permutation;

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
        long a=345;
        boolean flag=true;
        while(flag)
        {
            a++;
            long x=(long)(a*a*a);
            int arr[]=new int[11];
           arr=digit(x);
           //System.out.println(a+" "+x);
            int p=arr[10];
                    int q=p;
                      long b=a;
                      int arr2[]=new int[11];
                    while(q==p && flag)
                    {
                        b++;
                        long y=(long)(b*b*b);
                        arr2=digit(y);
                        q=arr2[10];
                        if(q==p && check(arr2,arr))
                        {
                            System.out.println(a+" "+b+" "+Math.log10(a));
                            int r=q;
                            long c=b;
                            int arr3[]=new int[11];
                            while(r==q && flag)
                            {
                                c++;
                                y=(long)(c*c*c);
                                arr3=digit(y);
                                r=arr3[10];
                                if(r==q && check(arr3,arr))
                                {
                                  //  flag=false;
                                    System.out.println(a+" "+b+" "+c+" "+x);
                                    int s=r;
                            long d=c;
                            int arr4[]=new int[11];
                            while(s==r && flag)
                            {
                                d++;
                                y=(long)(d*d*d);
                                arr4=digit(y);
                                s=arr4[10];
                                if(r==s && check(arr4,arr))
                                {
                                  //  flag=false;
                                    System.out.println(a+" "+b+" "+c+" "+d+" "+x);
                                    int t=s;
                            long e=d;
                            int arr5[]=new int[11];
                            while(t==s && flag)
                            {
                                e++;
                                y=(long)(e*e*e);
                                arr5=digit(y);
                                t=arr5[10];
                                if(t==s && check(arr5,arr))
                                {
                                    flag=false;
                                    System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+x);

                                }
                            }
                                }
                            }
                                }
                            }
                        }
                      //  System.out.println(a+" "+x+" "+b+" "+p+" "+q);
                    }
        }
    }
    static int[] digit(long x)
    {
         int ar[]=new int[11];

            while(x!=0)
            {
                
                int s=(int)(x%10);
             //  System.out.print(s+" ");
                ar[s]++;
               //ar[10]=ar[10]+ar[s];
                 x/=10;
            }
         for(int i=0;i<10;i++)
             ar[10]+=ar[i];
         return ar;
    }

    static boolean check(int f[],int br[])
    {
       int chk=0;
       for(int i=0;i<11;i++)
       {
       if(f[i]!=br[i])
       {
           chk++;
          break;
       }
    }
     if(chk==0)
           return true;
     else
         return false;
    }
}
