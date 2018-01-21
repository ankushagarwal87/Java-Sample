/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_matrix_top_right_left_down__83;
import java.io.*;
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
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=80;
        int arr[][]=new int[x][x];
        int xyz[][]=new int[x][x];
        for(int i=0;i<x;i++)
        {
            String s=br.readLine();
            String a[]=new String[x];
            a=s.split(",");
            for(int j=0;j<x;j++)
                arr[i][j]=Integer.parseInt(a[j]);
       }
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<x;j++)
                xyz[i][j]=arr[j][i];
        }
        int res[][]=new int[x][x];
      res[0][0]=xyz[0][0];
    for(int i=0;i<x;i++)
        {
             if(i==0)
            for(int j=1;j<x;j++)
                 res[i][j]=xyz[i][j]+res[i][j-1];
             else
             {
                 for(int j=0;j<x;j++)
                     res[i][j]=res[i-1][j]+xyz[i][j];
             }
        }
boolean flag=true;
                 while(flag)
{
                      flag=false;
                      for(int i=0;i<x;i++)
                      {
                    
                 //res[i][0]=xyz[i][0]+res[i-1][0];
                 for(int j=0;j<x;j++)
                 {
                     if(i>0 && res[i][j]>(res[i-1][j]+xyz[i][j] ))
                     {
                         res[i][j]=res[i-1][j]+xyz[i][j];
                         flag=true;
                     }
                     else if(j<(x-1) && res[i][j]>(res[i][j+1]+xyz[i][j]))
                    {
                        res[i][j]=res[i][j+1]+xyz[i][j];
                        flag=true;
                     }
                     else if(j>0 && res[i][j]>(res[i][j-1]+xyz[i][j]))
                     {
                         res[i][j]=res[i][j-1]+xyz[i][j];
                         flag=true;
                     }
                     else if(i<(x-1) && res[i][j]>(res[i+1][j]+xyz[i][j]))
                     {
                         res[i][j]=res[i+1][j]+xyz[i][j];
                        flag=true;
                     }
                }

}
                      
                     /* if(res[i-i][j]<res[i][j-1])
                     res[i][j]=xyz[i][j]+res[i-1][j];
                     else
                         res[i][j]=xyz[i][j]+res[i][j-1];*/
             }
        /*
         int min=res[x-1][0];
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<x;j++)
            {
                if(i==(x-1) && res[i][j]<min)
                min=res[i][j];

                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
       System.out.println(min);*/
     
     
             for(int i=0;i<x;i++)
            {
                for(int j=0;j<x;j++)
                System.out.print(res[i][j]+" ");
                System.out.println();
            }
        }
    }


// 425185 