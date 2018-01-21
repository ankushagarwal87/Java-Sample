/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_squaralspiral;

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
       boolean flag=true;
        int z=3;
        int a,r,c,n;
        int arr[][]=new int[30000][30000];

        while(flag)
        {
         a=z*z;
         r=z-1;
         c=z-1;
         n=z;
         int x=0,y=0;
        while(n>0)
        {
          //   System.out.println(n+" "+x+" "+y);
            if(n%2==1)
            {
                x++;
                if(x%2==1)
                {
                    while(c>=0 && arr[r][c]==0)
                    {
                        arr[r][c]=a;
                     //   System.out.println(arr[r][c]+" "+r+" "+c);
                        a--;
                        c--;
                    }
                    c++;
                    r--;
                 }
                else
                {
                 while(c<z && arr[r][c]==0)
                 {
                     arr[r][c]=a;
                     a--;
                     c++;
                 }
                 c--;
                 r++;
                }
            }
            else
            {
                y++;
                if(y%2==1)
                {
            while(r>=0 && arr[r][c]==0)
                {
                   arr[r][c]=a;
                    a--;
                    r--;
                }
                r++;
                c++;
                }
                else
                {
                    while(r<z && arr[r][c]==0)
                    {
                        arr[r][c]=a;
                        a--;
                        r++;
                    }
                    r--;
                    c--;
                }
            }
            n--;
     //        for(int i=0;i<z;i++)
     //   {
       //     for(int j=0;j<z;j++)
           //     System.out.print(arr[i][j]+" ");
        //    System.out.println();
          

     //   }
             
            //r=n-1;c=n-1;
        }
        /* System.out.println(z);
          for(int i=0;i<z;i++)
        {
           for(int j=0;j<z;j++)
               System.out.print(arr[i][j]+" ");
            System.out.println();
       }*/
        int cnt=0;
        for(int i=0;i<z;i++)
        {
            for(int j=0;j<z;j++)
            {
                if((i==j || (i+j)==(z-1)) && arr[i][j]!=1 && isPrime(arr[i][j]))
                {
                    cnt++;
                   // System.out.println(arr[i][j]);
                }
            }
        }
       double w=((cnt*100)/(2*z-1));
        System.out.println(z+" "+cnt+" "+w);
       if(w<10)
        {
            flag=false;
            System.out.println(z+" "+cnt+" "+w+" "+(2*z-1));
        }
        z=z+2;



        }
      /*  for(int i=0;i<z;i++)
        {
            for(int j=0;j<z;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
*/
    }

    static boolean isPrime(int p)
    {
        for(int i=2;i<=(int)Math.sqrt(p);i++)
        {
            if(p%i==0)
                return false;
        }
        return true;
    }

}
