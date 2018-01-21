/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lychrel;

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
        for(int i=1;i<=10000;i++)
        {
            int x=i;
            int a[]=new int[60];
             int j=0;
            int c=0;
     while(x!=0)
     {

      a[j++]=x%10;
         x/=10;
     } 
    do
    {
      int b[]=new int[60];
      b=rev(a);
      for(int k=0;k<60;k++)
      {
          a[k]+=b[k];
         if(a[k]>9)
         {
             a[k+1]+=a[k]/10;
                a[k]%=10;
                
         }
      }
      c++;
    }      while(!palin(a) && c<50);
          System.out.println(i+" "+c+"      "+sum);
           if(c==50)
           {
            sum++;
          //   System.out.println(i+" "+sum);
        }
        }
    }
 static int[] rev(int a[])
 {
int j=0;
     int b[]=new int[60];
     for(int i=59;i>=0;i--)
   if(a[i]!=0){ j=i;break;}
for(int i=0;i<=j;i++)
     {
     b[i]=a[j-i];
      //  System.out.println(" "+a[i]+" "+b[i]);
     }
 return b;
 }
    static boolean palin(int x[])
    {
        int f=0;
        int j=0;
          for(int i=59;i>=0;i--)
   if(x[i]!=0){ j=i;break;}
        for(int i=0;i<=j/2;i++)
        {
            if(x[i]!=x[j-i])
            {
                f=1;
                break;
            }
        }
        if(f==0)
            return true;
        else return false;
    }

}

