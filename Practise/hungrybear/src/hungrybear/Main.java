/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hungrybear;
import java.io.*;
import java.util.*;
/**
 *
 * @author ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here

        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int k=sc.nextInt();
        int arr[][]=new int[r][c];

        for(int i=0;i<r;i++)
        {
             String s=sc.next();
            for(int j=0;j<c;j++)
            {
                if(s.charAt(j)=='H')
                    arr[i][j]=1;
                else
                    arr[i][j]=0;
            }
               
        }
        int t=sc.nextInt();
        int ab[][]=new int[t][2];
        for(int i=0;i<t;i++)
        {
            for(int j=0;j<2;j++)
                ab[i][j]=sc.nextInt();
        }



   //     int res[]=new int[t];
     //  for(int a=0;a<t;a++)
       // {
int cnt=0;
int ans[][][][]=new int[r+1][c+1][r+1][c+1];
     for(int x=1;x<=r;x++)
            {
                for(int y=1;y<=c;y++)
                {

                   // if(x*y>=k)
                    
                        for(int i=0;i<=(r-x);i++)
                        {
                            for(int j=0;j<=(c-y);j++)
                            {
                              //  int sum=0;
                            //    if(x==1 && y==1)
                              //  ans[x][y][i][j]=arr[i][j];
                             /*   if(j+y<c)
                                    ans[x][y][i][j]+=ans[x][y-1][i][j+1];
                                if(i+x<r)
                                    ans[x][y][i][j]+=ans[x-1][y][i+1][j];
                               */ for(int u=i;u<(i+x);u++)
                                {
                                  // ans[x][y][i][j]+=ans[x][u][i][j];
                                    for(int v=j;v<(j+y);v++)
                                    {
                                        if(x==1 && y==1)
                                         ans[x][y][i][j]=arr[i][j];
                                        else
                                            if(u<r && v<c)
                                        ans[x][y][i][j]+=arr[u][v];
                                  //       System.out.println(x+" "+y+" "+i+" "+j+" "+(u)+" "+(v)+" "+arr[u][v]);
                                    }
                                }
                                    //ans[x][y][i][j]-=arr[i][j];
                         //       System.out.println(x+" "+y+" "+i+" "+j+" "+ans[x][y][i][j]);
                             //   if(ans[x][y][i][j]>=k)
                               //     cnt++;

                         /*
                                for(int p=i;p<(x+i);p++)
                                {
                                    for(int q=j;q<(y+j);q++)
                                    {
                                        if(arr[p][q]==1 && p<=r && q<=c)
                                        {
                                            sum++;
                                         //   System.out.println(a+" "+i+" "+j+" "+x+" "+y+" "+p+" "+q);
                                            if(sum>=k)
                                {
                                    cnt++;
                                   p=x+i;
                                   q=y+j;
                                //   System.out.println(" "+i+" "+j+" "+x+" "+y);
                                }
                                        }
                                    }
                                }
                             //   ans[x][y][i][j]=sum;
                                //  System.out.println(a+" "+x+" "+y+" "+i+" "+j+" "+sum);
                        */    }
                        }
                    }
                }
           

/*for(int a=0;a<t;a++)
{
       int cnt=0;
    for(int x=ab[a][0];x>0;x--)
            {
                for(int y=ab[a][1];y>0;y--)
                {
                    if(x*y>=k)
                    {
                        for(int i=0;i<=(r-x);i++)
                        {
                            for(int j=0;j<=(c-y);j++)
                            {
                                if(ans[x][y][i][j]>=k)
                                    cnt++;
                            }
                        }
                     }
                 }
             }
*/
         //   res[a]=cnt;
          //

        for(int a=0;a<t;a++)
        {
            cnt=0;
            for(int x=ab[a][0];x>0;x--)
            {
                for(int y=ab[a][1];y>0;y--)
                {

                    if(x*y>=k)
                    {
                        for(int i=0;i<=(r-x);i++)
                        {
                            for(int j=0;j<=(c-y);j++)
                            {
                                if(ans[x][y][i][j]>=k && i<r && j<c)
                                {
                                    cnt++;
                                  //  System.out.println(a+" "+x+" "+y+" "+i+" "+j+" "+ans[x][y][i][j]+" "+cnt);
                                }
                            }
                        }
                    }
                 
                }
            }
               System.out.println(cnt);
        }

    }
}