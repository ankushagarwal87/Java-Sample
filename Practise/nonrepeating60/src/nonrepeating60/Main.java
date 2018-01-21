/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nonrepeating60;

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
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=1;
            for(int j=1;j<=i;j++)
                a[i]=a[i]*j;
        }
int sum=0;
        for(int i=1;i<=1000000;i++)
        {
            int flag=0;
        int arr[]=new int[100];
        int k=0,z,x=i;
        arr[k++]=x;
   while(flag==0)
   {
x=fact(x,a);
flag=present(arr,x,k);
if(flag==0)
{
arr[k++]=x;
//System.out.print(x+"   ");
   }
   }
        if(k>=60)
        {
            sum++;
        System.out.println(i+" "+k+" "+sum);
        }
        }
    }
static int fact(int i,int a[])
{
    int y,z=0,x=i;

            while(x!=0)
            {
                y=x%10;
                z+=a[y];
                x/=10;
}
    return z;
}
static int present(int w[],int c,int l)
{
    for(int i=0;i<=l;i++)
    {
        if(w[i]==c)
         return 1;
    }
    return 0;

}
}


