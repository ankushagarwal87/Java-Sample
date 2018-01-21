/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package morningcommute;
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
       int t=sc.nextInt();
       int xyz[]=new int[t];
       for(int i=0;i<t;i++)
       {
           int n=sc.nextInt();
           int arr[][]=new int[n][3];
           for(int j=0;j<n;j++)
           {
           arr[j][0]=sc.nextInt();
           arr[j][1]=sc.nextInt();
           arr[j][2]=sc.nextInt();
           }
           int sum=0;
           sum=arr[0][0]+arr[0][1];

           for(int j=1;j<n;j++)
           {
               int k=arr[j][0];
               while(k<sum)
                   k+=arr[j][2];
               sum=arr[j][1]+k;

           }
           xyz[i]=sum;
           //System.out.println(sum);
       }
       for(int i=0;i<t;i++)
            System.out.println(xyz[i]);

    }

}
