/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package codejam_pseudomoniium;
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
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int T=Integer.parseInt(br.readLine());
        int ans[]=new int[T];
        for(int i=0;i<T;i++)
        {
            int n=Integer.parseInt(br.readLine());
            int c[]=new int[500];
            int s[]=new int[500];
            int t[]=new int[500];
            for(int j=0;j<n;j++)
            {
                String a=br.readLine();
                String abc[]=new String[3];
                abc=a.split(" ");
                c[j]=Integer.parseInt(abc[0]);
                 s[j]=Integer.parseInt(abc[1]);
                  t[j]=Integer.parseInt(abc[2]);
            }
           int m=Integer.parseInt(br.readLine());
            for(int j=0;j<m;j++)
            {
                String a=br.readLine();
                String abc[]=new String[3];
                abc=a.split(" ");
                c[n+j]=Integer.parseInt(abc[0]);
                 s[n+j]=Integer.parseInt(abc[1]);
                  t[n+j]=Integer.parseInt(abc[2]);
            }
           int x=n,y=0,z=1,tc=n,pos=0;
           int arr[]=new int[n+m];
           while(z>0 && tc>0 && tc<=(n+m) && pos>=0)
           {
               int max=0;
               pos=-1;
               for(int j=0;j<x;j++)
               {
                   if(t[j]>max && arr[j]!=1)
                   {
                       max=t[j];
                       pos=j;
                   }
               }
               if(max==0)
               {
                   for(int j=0;j<x;j++)
               {
                   if(s[j]>max && arr[j]!=1)
                   {
                       max=s[j];
                       pos=j;
                   }
               }
               }
               if(pos>=0)
               {
               y+=s[pos];
               x+=c[pos];
               z+=t[pos];
               z--;
               arr[pos]=1;
               tc+=c[pos];
              
           //System.out.println(i+" "+pos+" "+x+" "+y+" "+z+" "+tc);
          }
tc--;
//System.out.println(i+" "+pos+" "+x+" "+y+" "+z+" "+tc);
           }
           ans[i]=y;

        }
        for(int i=0;i<T;i++)
        {
            System.out.println("Case #"+(i+1)+": "+ans[i]);
        }
    }

}
/*
3 3 6 0 2 5
3 4 7 9 2 5
4 0 4 6 1 3
4 3 4 13 1 2
4 2 4 19 0 1
5 1 9 7 1 8
6 0 5 0 1 4
6 1 5 7 1 3
6 2 6 12 0 3
 *
 *
 0 0 2 10 10 2
1 0 2 10 10 2
1 1 3 20 19 2
2 0 2 10 10 2
2 1 3 20 19 2
2 2 4 30 28 2
3 3 6 0 2 6
3 4 7 9 2 6
3 0 8 16 1 6
3 2 8 20 0 5
4 0 4 6 1 4
4 3 4 13 1 3
4 2 4 19 0 2
5 1 9 7 1 9
5 5 10 7 1 9
5 2 11 16 0 9
 *
 *
 *
 * 0 0 2 10 10 1
0 -1 2 10 10 0
1 0 2 10 10 1
1 1 3 20 19 1
1 -1 3 20 19 0
2 0 2 10 10 1
2 1 3 20 19 1
2 2 4 30 28 1
2 -1 4 30 28 0
3 2 4 9 1 3
3 3 5 18 0 3
4 0 7 6 2 6
4 1 8 9 3 6
4 2 8 17 2 5
4 4 9 23 1 5
4 5 10 27 0 5
5 1 5 7 1 4
5 2 5 14 0 3
6 0 3 6 2 2
6 1 4 15 1 2
6 3 4 22 0 1
7 1 4 0 1 3
7 3 5 2 1 3
7 4 5 5 1 2
7 2 6 14 0 2
8 5 8 7 1 7
8 4 8 16 0 6
9 1 6 2 1 5
9 4 6 6 1 4
9 0 6 13 0 3
10 6 7 1 2 6
10 0 8 2 2 6
10 2 9 8 1 6
10 4 10 13 0 6
 *
 *
 *
 *
 * 0 0 2 10 10 1
0 -1 2 10 10 0
1 0 2 10 10 1
1 1 3 20 19 1
1 -1 3 20 19 0
2 0 2 10 10 1
2 1 3 20 19 1
2 2 4 30 28 1
2 -1 4 30 28 0
3 2 4 9 1 3
3 3 5 18 0 3
4 0 7 6 2 6
4 1 8 9 3 6
4 2 8 17 2 5
4 4 9 23 1 5
4 5 10 27 0 5
5 1 5 7 1 4
5 2 5 14 0 3
6 0 3 6 2 2
6 1 4 15 1 2
6 3 4 22 0 1
7 1 4 0 1 3
7 3 5 2 1 3
7 4 5 5 1 2
7 2 6 14 0 2
8 5 8 7 1 7
8 4 8 16 0 6
9 1 6 2 1 5
9 4 6 6 1 4
9 0 6 13 0 3
10 6 7 1 2 6
10 0 8 2 2 6
10 2 9 8 1 6
10 4 10 13 0 6
 *
 *
 *
 * 97 4 38 3 2 37
97 3 38 16 2 36
97 7 38 36 2 35
97 12 39 45 2 35
97 13 39 49 2 34
97 14 40 64 2 34
97 23 41 73 2 34
97 25 41 83 2 33
97 19 41 103 1 32
97 20 41 123 0 31
98 4 14 12 3 13
98 0 15 28 3 13
98 6 16 33 3 13
98 8 16 44 3 12
98 9 17 54 3 12
98 11 18 73 2 12
98 17 18 79 2 11
98 13 18 96 1 10
98 3 19 111 0 10
99 14 58 1 2 57
99 0 59 9 2 57
99 8 59 10 2 56
99 15 59 24 2 55
99 20 59 25 2 54
99 23 59 40 2 53
99 24 60 43 2 53
99 29 60 58 2 52
99 31 61 72 2 52
99 32 62 74 2 52
99 37 62 84 2 51
99 40 63 96 2 51
99 45 64 105 2 51
99 50 65 125 2 51
99 62 65 143 2 50
99 7 65 163 1 49
99 12 66 183 0 49
 */