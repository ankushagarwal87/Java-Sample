/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package codejam_gorosport;
import java.io.*;
import java.text.*;

/**
 *
 * @author ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static int c=0;
    static int p[]=new int[100];
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int ans[]=new int[t];
        for(int i=0;i<t;i++)
        {
            int n=Integer.parseInt(br.readLine());
            int arr[]=new int[n];
            int sort[]=new int[n];
            int count=0;
            String s[]=new String[n];
            String str=br.readLine();
            s=str.split(" ");
            for(int j=0;j<n;j++)
            {
                arr[j]=Integer.parseInt(s[j]);
                sort[j]=arr[j];
            }
            for(int j=0;j<(n-1);j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(sort[k]<sort[j])
                    {
                        int temp=sort[k];
                        sort[k]=sort[j];
                        sort[j]=temp;
                    }
                }
            //System.out.println(sort[j]);
            }
            int pos[]=new int[n];
            for(int j=0;j<n;j++)
            {
                if(sort[j]!=arr[j] && p[j]!=1)
                {
                   pos=func(arr,sort,sort[j],arr[j],n);
                   
                }
            }
            if(n!=1)
        ans[i]=c;
            else ans[i]=0;
        c=0;
        
        
        }

        for(int i=0;i<t;i++)
        {

           System.out.println("Case #"+(i+1)+": "+ans[i]+".000000");

        }

    }
  static int[] func(int a[],int b[],int d,int e,int n)
  {
   c=c+2;
   int i;
   for(i=0;i<n;i++)
   {
     if(a[i]==d)
     {
       p[i]=1;

       break;
     }
   }
   if(b[i]==e)
   {
       return p;
   }
   else
       p=func(a,b,b[i],e,n);
       return p;
  }



}

    


