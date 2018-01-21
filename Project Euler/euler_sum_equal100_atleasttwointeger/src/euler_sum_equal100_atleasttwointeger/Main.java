/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_sum_equal100_atleasttwointeger;

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
int x=60000,k=0;
//int cnt=0;
int arr[]=new int[x];
//int ans[][]=new int[100][x];
/*for(int i=1;i<x;i++)
{    int f=0;
    for(int j=2;j<=Math.sqrt(i);j++)
    {
        if(i%j==0)
        {
            f=1;
            break;
        }
    }
    if(f==0)
        arr[k++][0]=i;
}
 * 
 */
 int p=55374;
while(true)
    {
  //  p++;
        for(int i=1;i<=p+1 && p<x;i++)
        {
        //arr[i][0]=i;
            arr[i]=(int)(p/i);
           // System.out.println(arr[i][0]+" "+arr[i][1]);
        }
        long q=0;
//for(int i=1;i<=p;i++)
         q+=permutate(p,arr,1,0,0);
System.out.println(p+" "+q);
   //if(q%1000000==0)
      break;
}
    }
 static long permutate(int x,int b[],int c,int z,long y)
 {
    //int cnt=y;
   // System.out.println(c+" "+z);
    //if(c<1)
      //  return y;
     if(c>x)
         return y;
    if((z+c)>x)
             return y;
     for(int i=0;i<=b[c];i++)
     {

    // System.out.println(i+" "+c+" "+z);
         if((z+c)>x)
             return y;
     //  z=z+b[c][0];
          y=permutate(x,b,c+1,z,y);
         // if((z+b[c][0])>x)
            // return y;
                 z=z+c;
         if(z==x)
         {
             y++;
           System.out.println(x+" "+i+" "+c+" "+z+" saf"+" "+(y));
            // y=cnt;
               //if(y%1000000==0)
                 //            System.out.println(i+" "+c+" "+z+" "+y);
                         return y;
         }
     }
return y;
 }
}
//190569291
//71
//55374
