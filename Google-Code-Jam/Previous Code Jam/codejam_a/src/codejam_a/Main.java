/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package codejam_a;
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
          Scanner sc = new Scanner(new FileReader("input.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

        int t=Integer.parseInt(sc.nextLine());
        int ans[]=new int[t];
        int res[][][]=new int[t][50][50];
        int mn[][]=new int[t][2];
        for(int i=0;i<t;i++)
        {
            String s=sc.nextLine();
            String abc[]=new String[3];
            abc=s.split(" ");
             int r=Integer.parseInt(abc[0]);
              int c=Integer.parseInt(abc[1]);
              mn[i][0]=r;
              mn[i][1]=c;
              int arr[][]=new int[r][c];
              for(int j=0;j<r;j++)
              {
                  s=sc.nextLine();
                  for(int k=0;k<c;k++)
                  {
                      if(s.charAt(k)=='#')
                          arr[j][k]=1;
                      else
                          arr[j][k]=0;
                  }
              }
              for(int j=0;j<(r-1);j++)
              {
                  for(int k=0;k<(c-1);k++)
                  {
                      if(arr[j][k]==1 && arr[j][k+1]==1 && arr[j+1][k]==1 && arr[j+1][k+1]==1)
                      {
                          arr[j][k]=2;
                          arr[j][k+1]=3;
                          arr[j+1][k]=4;
                          arr[j+1][k+1]=5;
                          
                      }
                  }
              }
              
              for(int j=0;j<r;j++)
              {
                  for(int k=0;k<c;k++)
                  {
                      res[i][j][k]=arr[j][k];
                   //   System.out.print(arr[j][k]);
                      if(arr[j][k]==1)
                      {
                          ans[i]=1;
                          j=r;
                          break;
                      }  
                  }
                 // System.out.println();
              }
        }

        for(int i=0;i<t;i++)
        {
            pw.println("Case #"+(i+1)+":");
            if(ans[i]!=1)
            {
            for(int j=0;j<mn[i][0];j++)
            {
                for(int k=0;k<mn[i][1];k++)
                {
                    if(res[i][j][k]==0)
                    pw.print(".");
                    else if(res[i][j][k]==2)
                        pw.print("/");
                    else if(res[i][j][k]==3)
                        pw.print("\\");
                    else if(res[i][j][k]==4)
                        pw.print("\\");
                    else if(res[i][j][k]==5)
                        pw.print("/");

                }
                pw.println();
            }
        }
            else
            pw.println("Impossible");
        }
        pw.flush();
          pw.close();
        sc.close();
}
}