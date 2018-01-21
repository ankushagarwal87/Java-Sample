/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package maxpalidigital;

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

        long sum=0;
        for(int i=1;;i++)
        {
       
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                for(int k=2;k<j;k++)
                {
                    if(j*k==i)
                    {
                   
                      if(func(i,j,k))
                      {
                         
                          sum+=i;
                          System.out.println(i+" "+j+" "+k+" "+sum);
                           j=i;k=i;
                      }
                      break;
                    }
                }
            }
        }
    }
    }
static boolean func(int a,int b,int c)
{
    int flag=0;
    int k[]=new int[10];
    while(a!=0)
    {
        k[a%10]++;
        a/=10;
    }
     while(b!=0)
    {
        k[b%10]++;
        b/=10;
    }
     while(c!=0)
    {
        k[c%10]++;
        c/=10;
    }
    for(int i=1;i<10;i++)
    {  
        if(k[i]!=1) flag=1;
    }
    if(flag==0 && k[0]==0)
        return true;
    else return false;
}
}
