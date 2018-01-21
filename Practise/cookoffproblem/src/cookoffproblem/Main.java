/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cookoffproblem;

/**
 *
import java.io.*; * @author ankush
 */
import java.io.*;
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[][]=new int[250][250];
        int a[]=new int[250];
        int b[]=new int[250];
        int min[]=new int[250];
        int max[]=new int[250];
         for(int i=0;i<x;i++)
        {
        a[i]=sc.nextInt();
       b[i]=sc.nextInt();
       min[i]=sc.nextInt();
        max[i]=sc.nextInt();
       for(int j=0;j<a[i];j++)
        {
        arr[i][j]=sc.nextInt();
        }
        }
       
    }

}
