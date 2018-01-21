/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_bouncy_number;

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
        double a=99;
        boolean flag=true;
        int x=100;
        int cnt=0;

        while(flag)
        {
            if(!digit(x))
            {
                cnt++;
               // System.out.println(x+" "+digit(x)+" "+cnt);
            }
            double y=cnt*100.0/x;
            if(y==a)
            {
                flag=false;
                System.out.println(x+" "+cnt+" "+y);
            }
            x++;
       }
           //System.out.println(i+" "+digit(i)+" "+(++cnt));
       }

    static boolean digit(int a)
    {
        int b=a;
        int c=(int)Math.log10(a)+1;
        int d=c;
        int arr[]=new int[c+1];
        while(b!=0)
        {
            int x=b%10;
            b/=10;
             arr[c]=x;
              c--;
        }
        /*
        for(int i=0;i<10;i++)
            for(int j=1;j<=3;j++)
            System.out.println(i+" "+j+" "+arr[i][j]);
    */
        int pos=0;
        for(int i=1;i<d;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                pos=i;
                break;
            }
        }
        int x=0;
   //     if(pos==-1)
     //       return false;
        if(pos!=-1 && arr[pos]>arr[pos+1])
            x=1;
        else
            x=2;
        for(int i=pos;i<d;i++)
        {
        if(x==1 && arr[i]<arr[i+1])
            return false;
        else if(x==2 && arr[i]>arr[i+1])
            return false;
        }
        return true;
    }
}
