/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package codechefrecipe;
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
 
        // TODO code application logic here
   public static void main(String asd[])throws IOException
{
int arr[][]=new int[100][50];
int n=1,x;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
Scanner c=new Scanner(System.in);
x=c.nextInt();
for(int i=0;i<x;i++)
{
arr[i][0]=c.nextInt();
 
for(int j=1;j<=arr[i][0];j++)
    arr[i][j]=c.nextInt();
}

for(int i=0;i<x;i++)
{
    int min=arr[i][1];
    for(int j=2;j<=arr[i][0];j++)
        min=Math.min(min,arr[i][j]);
   
    int cnt=0;
    for(int j=1;j<=arr[i][0];j++)
            if(arr[i][j] % min ==0)
                            cnt++;
             
            
    if(cnt==arr[i][0])
    {
        for(int j=1;j<=arr[i][0];j++)
            arr[i][j]/=min;
    }
        for(int j=1;j<=arr[i][0];j++)
            System.out.print(arr[i][j]+" ");
  System.out.println();
}


    }

}
