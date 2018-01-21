/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pairingchef;
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
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     //Scanner sc=new Scanner(System.in);
    // int t=sc.nextInt();
     int t=Integer.parseInt(br.readLine());
            String s[]=new String[t];
        //    int n[]=new int[t];
            int m[]=new int[t];
           // int arr[][][]=new int[t][10000][2];
            //int xyz[][]=new int[t][1000];
                int res[][]=new int[t][10000];
     for(int p=0;p<t;p++)
     {
s[p]="";   
String y=br.readLine();
String z[]=y.split(" ");
int n=Integer.parseInt(z[0]);
 m[p]=Integer.parseInt(z[1]);
//System.out.println("DSA"+n[p]+" "+m[p]);
        //m[p]=sc.nextInt();
        int arr[][]=new int[m[p]][2];
        int xyz[]=new int[n];
        for(int i=0;i<m[p];i++)
        {
             y=br.readLine();
 z=y.split(" ");
arr[i][0]=Integer.parseInt(z[0]);
arr[i][1]=Integer.parseInt(z[1]);
//System.out.println("adssa"+arr[p][i][0]+" "+arr[p][i][1]);
            //arr[p][i][0]=sc.nextInt();
           // arr[p][i][1]=sc.nextInt();
         }
     
           // System.out.println("d");
      
                for(int d=0;d<n;d++)
                  xyz[d]=0;
        for(int i=m[p]-1;i>=0;i--)
        {
                if(xyz[arr[i][0]]==0 && xyz[arr[i][1]]==0 )
                {
                  //  Integer x=new Integer(i);
                    //String a=x.toString();
                    //s[p]=s[p].concat(a);
                    xyz[arr[i][0]]=1;
                    xyz[arr[i][1]]=1;
                   // System.out.print(s[p]);
                    res[p][i]=1;
                }
        }
            }
//System.out.println();
            for(int p=0;p<t;p++)
            {
         /*    for(int i=s[p].length()-1;i>0;i--)
                 System.out.print(s[p].charAt(i)+" ");
             System.out.print(s[p].charAt(0));
        System.out.println();*/
        for(int i=0;i<m[p];i++)
            if(res[p][i]==1)
                System.out.print(i+" ");
        System.out.println();
    }
}
}