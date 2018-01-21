/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modulo;

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
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
       int arr[][]=new int[10][10];
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
                arr[i][j]=Integer.parseInt(br.readLine());
        }

       for(int i=0;i<10;i++)
        {
           int c=0;
        int a[]=new int[42];
           for(int j=0;j<10;j++)
            a[arr[i][j]%42]++;
            for(int j=0;j<42;j++)
                if(a[j]>0)
                    c++;
            System.out.println(c);
       }

    }
}