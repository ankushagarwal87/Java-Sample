/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package codechef_double_string;
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
        int t =Integer.parseInt(br.readLine());
        long arr[] = new long[t];
        for(int i=0;i<t;i++)
        {
                long n =Long.parseLong(br.readLine());
                if (n%2==0)
                    arr[i] =n;
                else
                  arr[i] =n-1;
        }
        for(int i=0;i<t;i++)
        System.out.println(arr[i]);



        }
        
    }


