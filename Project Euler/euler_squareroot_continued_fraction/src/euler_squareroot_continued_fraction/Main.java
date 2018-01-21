/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_squareroot_continued_fraction;
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
        int cnt=0;
        for(int p=2;p<10;p++)
        {
            double a=Math.sqrt(p);
            double i=p;
            //if(Math.sqrt()==Math.floor(Math.sqrt(a)))
            //double i=Math.E;
           // i=i*i;
         //   System.out.println(i);
             //double a=Math.E;
            if(Math.ceil(a)==a)
                System.out.println(a);
            else
            {
                double arr[][]=new double[250][3];
                int k=0;
              boolean flag=true;
                arr[k][0]=(int)Math.floor(a);
               arr[k][1]=(int)Math.floor(a);
               arr[k][2]=i-arr[k][0]*arr[k][0];
                //System.out.println(arr[k][0]+" "+arr[k][1]+" "+arr[k][2]);
               k++;
               while(flag)
               {
               arr[k][0]=(int)((a+arr[k-1][1])/(arr[k-1][2]));
            //   System.out.println(arr[k][0]+" "+(a+arr[k-1][1])+" "+arr[k-1][2]+ " "+((a+arr[k-1][1])/arr[k-1][2]));
               arr[k][1]=((arr[k][0]*arr[k-1][2])-arr[k-1][1]);
               arr[k][2]=(i-arr[k][1]*arr[k][1])/arr[k-1][2];
               System.out.println(k+" "+arr[k][0]+" "+arr[k][1]+" "+arr[k][2]);
               
               k++;
               if(check(arr,k) || k>105)
                   flag=false;
               }
             System.out.println(a+" "+i+" "+(k-2));
               for(int j=0;j<k-1;j++)
               {
                   System.out.println(j+" "+arr[j][0]+" "+arr[j][1]+" "+arr[j][2]);
               }
               System.out.println();
             /*     if(k%2==1)
                 cnt++;
               arr[0][0]=2;
               for(int m=0;m<=33;m++)
               {
                   arr[3*m+1][0]=1;
                   arr[3*m+2][0]=(m+1)*2;
                   arr[3*m+3][0]=1;
               }
               convergent100(arr);
         */   }
        }
        System.out.println(cnt);
    }

    static boolean check(double x[][],int p)
    {
        for(int i=0;i<p-1;i++)
        {
         for(int j=i+1;j<p;j++)
         {
             if(x[i][0]==x[j][0] && x[i][1]==x[j][1] && x[i][2]==x[j][2])
                 return true;
         }
        }

    return false;
}

    static void convergent100(double s[][])
    {
        BigInteger n,d,p,q;
        q=new BigInteger("1");
        int y=99;
         n=new BigInteger(String.valueOf((int)s[y-1][0]));
             d=new BigInteger(String.valueOf((int)s[y][0]));
         for(int i=y-2;i>=0;i--)
        {
            p=(n.multiply(d)).add(q);
          //  System.out.println(i+" "+n+" "+d+" "+p+" "+q);
            n=new BigInteger(String.valueOf((int)s[i][0]));
            q=d;
            d=p;
                        System.out.println(i+" "+n+" "+d+" "+p+" "+q);

       }
             System.out.println((n.multiply(d).add(q))+" "+d);
            n=(n.multiply(d)).add(q);
            BigInteger c=new BigInteger("0");
            BigInteger b=new BigInteger("2");
            BigInteger g=n.gcd(d);
            System.out.println(g);
          
             String w=n.toString();
            System.out.println(w);
             int len=w.length();
int sum=0;
             for(int i=0;i<len;i++)
             {
          sum=sum+w.charAt(i)-48;
          System.out.print(sum+" ");
             }
    }
}