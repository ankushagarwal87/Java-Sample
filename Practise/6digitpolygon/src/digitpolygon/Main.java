/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package digitpolygon;

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
        int a[][]=new int[6][100];
        int b=0,c=0,d=0,e=0,f=0,g=0,o,p,q,r,s,t,u,v,w,x,y,z;
        for(int i=1;i<200;i++)
        {
            if(i*(i+1)/2>999 && i*(i+1)/2<10000)
                a[0][b++]=i*(i+1)/2;
            if(i*i>999 && i*i<10000)
                a[1][c++]=i*i;
            if(i*(3*i-1)/2>999 && i*(3*i-1)/2<10000)
                a[2][d++]=i*(3*i-1)/2;
            if(i*(2*i-1)>999 && i*(2*i-1)<10000)
                a[3][e++]=i*(2*i-1);
            if(i*(5*i-3)/2>999 && i*(5*i-3)/2<10000)
                a[4][f++]=i*(5*i-3)/2;
            if(i*(3*i-2)>999 && i*(3*i-2)<10000)
                a[5][g++]=i*(3*i-2);
        }
        int arr[]=new int[6];
     /*    for(int i=0;i<6;i++)
         {
             for(int j=0;j<200;j++)
             {
                 System.out.println(i+" "+j+" "+a[[])
             }
         }*/
        int brr[]=new int[6];
        for(int i=0;i<g;i++)
        {
            p=0;
            arr[0]=(int)Math.floor(a[5][i]/100);
            brr[0]=a[5][i]%100;

                                    //System.out.println(i+" "+arr[0]+ " "+arr[1]);
            if(arr[0]>9 && brr[0]>9)
            {
            for(int j=0;j<f;j++)
            {
                if(a[5][i]!=a[4][j])
                {
                    arr[1]=(int)Math.floor(a[4][j]/100);
                    brr[1]=a[4][j]%100;
                   // System.out.println(i+" "+j+" "+a[0][i]+" "+a[1][j]+" "+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
                 if(arr[1]>9 && brr[1]>9)
                    {
                    for(int k=0;k<e;k++)
                    {
                        if(a[3][k]!=a[5][i] && a[3][k]!=a[4][j])
                        {
                            arr[2]=(int)Math.floor(a[3][k]/100);
                            brr[2]=a[3][k]%100;
                          //  System.out.println(i+" "+j+" "+k+" "+a[0][i]+" "+a[1][j]+" "+a[2][k]+" "+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+a[5]);
                            if(arr[2]>9 && brr[2]>9)
                            {
                            for(int l=0;l<d;l++)
                            {
                                arr[3]=(int)Math.floor(a[2][l]/100);
                                    brr[3]=a[2][l]%100;
                                //for(int as=0;as<8;as++)
                                 //   System.out.println(i+" "+j+" "+k+" "+l+" "+as+" "+arr[as]);
                                    if(a[2][l]!=a[5][i] && a[2][l]!=a[4][j] && a[2][l]!=a[3][k] && arr[3]>9 && brr[3]>9 )
                                {
                                    
                               //     System.out.println(i+" "+j+" "+k+" "+l+" "+a[0][i]+" "+a[1][j]+" "+a[2][k]+" "+a[3][l]);
                                 //  for(int as=0;as<8;as++)
                                   // System.out.println(i+" "+j+" "+k+" "+l+" "+as+" "+arr[as]+"thrd");
                                   for(int m=0;m<c;m++)
                                    {
                                        arr[4]=(int)Math.floor(a[1][m]/100);
                                            brr[4]=a[1][m]%100;
                                        if(a[1][m]!=a[5][i] && a[1][m]!=a[4][j] && a[1][m]!=a[3][k] && a[1][m]!=a[2][l] && arr[4]>9 && brr[4]>9 )
                                        {
                                            
                                        //  System.out.println(i+" "+j+" "+k+" "+l+" "+m+" "+a[0][i]+" "+a[1][j]+" "+a[2][k]+" "+a[3][l]+" "+a[4][m]);
                                    //      for(int as=0;as<10;as++)
                                   // System.out.println(arr[as]+"frth");

                                            for(int n=0;n<b;n++)
                                            {
                                                arr[5]=(int)Math.floor(a[0][n]/100);
                                                    brr[5]=a[0][n]%100;
                              //                      for(int as=0;as<6;as++)
                                //    System.out.println(i+" "+j+" "+k+" "+l+" "+m+" "+n+" "+as+" "+arr[as]+" "+brr[as]);
                                                if(a[0][n]!=a[5][i] && a[0][n]!=a[4][j] && a[0][n]!=a[3][k] && a[0][n]!=a[2][l] && a[0][n]!=a[1][m] && arr[5]>9 && brr[5]>9 && digit(arr,6,brr))
                                                {
                                                    
                                                    System.out.println("                    "+i+" "+j+" "+k+" "+l+" "+m+" "+n+" "+a[5][i]+" "+a[4][j]+" "+a[3][k]+" "+a[2][l]+" "+a[1][m]+" "+a[0][n]+"final" );
                                   //             for(int as=0;as<12;as++)
                                    //System.out.println(arr[as]+"ffth");

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
            }
            }
        }
    }
static boolean digit(int p[],int y,int q[])
{
    int x[]=new int[6];
    int z[]=new int[6];
   for(int i=0;i<y;i++)
   {
       x[i]=p[i];
       z[i]=q[i];
   }
    int c=0;
 for(int i=0;i<y;i++)
 {
//System.out.println(x[i]+"frst");
     for(int j=0;j<y-1;j++)
    {
     if(x[j]>x[j+1])
     {

         c=x[j];
         x[j]=x[j+1];
         x[j+1]=c;
     }
if(z[j]>z[j+1])
     {

         c=z[j];
         z[j]=z[j+1];
         z[j+1]=c;
     }
     }
 }
    for(int i=0;i<y;i++)
    {
   //     System.out.println(x[i]+" "+x[i+1]+"secnd");
        if(x[i]!=z[i])
            return false;
    }
    return true;
}
}