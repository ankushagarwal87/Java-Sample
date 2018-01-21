/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_amicable_proper_divisor_95;

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
        int a=1000001;
int arr[]=new int[a];
int x=0,y=0;
for(int i=1;i<a;i++)
{
    int s=1;
    if(arr[i]==0)
    {
        for(int j=2;j<=Math.sqrt(i);j++)
        {
            if(i%j==0)
            {
                s=s+j+i/j;
                if((i/j)==j)
                    s-=j;
            }
        }
        arr[i]=s;
       // System.out.println(i+" "+s);
    }
}
int max=0;
int ans=0;
int re[]=new int[a];
for(int i=1;i<a;i++)
{
   // int b=i;

    int c=arr[i];
    int cnt=1;
    re[i]=1;
   while(c<a && re[c]==0 && c!=i)
   {
       //System.out.println(i+" "+c);
         re[c]=1;
       c=arr[c];
       cnt++;

   }
//System.out.println(i+" "+cnt);
    if(c==i && cnt>max)
    {
        ans=i;
        max=cnt;
        System.out.println(i+" "+cnt+" "+max+" "+ans);
    }
}

System.out.println(max+" "+ans);
    }

}
//14316