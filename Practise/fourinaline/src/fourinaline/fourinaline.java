/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fourinaline;
import java.io.*;
import java.util.*;
/**
 *
 * @author ankush
 */
class fourinaline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String as=br.readLine();
        Scanner sc = new Scanner(new FileReader(as));
      //  PrintWriter pw = new PrintWriter(new FileWriter("fourinaline.out"));
        String a=sc.nextLine();
      int ans=0,f=0;
     //   System.out.println(a.length());

            int c=0;
             int arr[][]=new int[4][a.length()];
             int d=a.length();
            while(!(a.equals("")))
            {
            String b[]=new String[a.length()];
            b=a.split(",");
            d=b.length;
            for(int i=0;i<b.length;i++)
            {
                arr[c][i]=Integer.parseInt(b[i]);
                if(arr[c][i]==0)
                    ans=3;
                //System.out.print(arr[c][i]);
            }

            //System.out.println(" "+c+" "+b.length+" "+f);
           if(sc.hasNextLine())
            a=sc.nextLine();
           else a="";
            c++;
            f++;

            if(f>3)
            {
                for(int i=0;i<4;i++)
               {
                for(int j=0;j<=b.length-4;j++)
                {
                   // System.out.print(arr[i][j]+" ");
                    if(arr[i][j]!=0 && arr[i][j]==arr[i][j+1] && arr[i][j]==arr[i][j+2] && arr[i][j]==arr[i][j+3])
                    {
                       // System.out.println(c+" "+f+" "+i+" "+j+" "+arr[i][j]+"row");
                        ans=arr[i][j];
                    }
                   if(i==0 && arr[i][j]!=0 && arr[i][j]==arr[i+1][j+1] && arr[i][j]==arr[i+2][j+2] && arr[i][j]==arr[i+3][j+3])
                    {
                       // System.out.println(c+" "+f+" "+i+" "+j+" "+arr[i][j]+"diag");
                        ans=arr[i][j];
                    }
                }
               //  System.out.println();
               }
              for(int i=0;i<1;i++)
              {
                for(int j=0;j<b.length;j++)
                {
                    if(arr[i][j]!=0 && arr[i][j]==arr[i+1][j] && arr[i][j]==arr[i+2][j] && arr[i][j]==arr[i+3][j])
                    {
                       // System.out.println(c+" "+f+" "+i+" "+j+" "+arr[i][j]+"col");
                        ans=arr[i][j];
                    }
                }
              }
               c--;
            }

            for(int i=0;i<3;i++)
            {
                for(int j=0;j<b.length;j++)
                    arr[i][j]=arr[i+1][j];
            }

        }
             if(f<4)
             {
                 for(int i=0;i<4;i++)
               {
                for(int j=0;j<=d-4;j++)
                {
                 //  System.out.print(arr[i][j]+" ");
                    if(arr[i][j]!=0 && arr[i][j]==arr[i][j+1] && arr[i][j]==arr[i][j+2] && arr[i][j]==arr[i][j+3])
                    {
                      //  System.out.println(c+" "+f+" "+i+" "+j+" "+arr[i][j]+"row");
                        ans=arr[i][j];
                    }
                    }
                 }
                 }
             if(ans==0)
                 System.out.println("draw");
             else if(ans==1)
                 System.out.println("1");
             else if(ans==2)
                 System.out.println("2");
             else if(ans==3)
                 System.out.println("play");
      //  pw.flush();
       // pw.close();
        sc.close();

    }

}
