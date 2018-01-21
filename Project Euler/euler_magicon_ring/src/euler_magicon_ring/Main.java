/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_magicon_ring;

/**
 *
 * @author ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long ma=0;
        for(int t=6;t<=40;t++)
        {
            int cnt=0;
                   int sum=t;
            int x=10,y=0,z=0;
        int arr[][]=new int[5][3];
        int n[]=new int[x+1];
        int a[][]=new int[15][3];
        for(int i=1;i<=x;i++)
        {
            y=i;
            for(int j=i+1;j<=x;j++)
            {
                y=i+j;
                if(y<sum)
                {
                    for(int k=j+1;k<=x;k++)
                    {
                        y=i+j+k;
                        if(y==sum)
                        {
                            System.out.println(i+" "+j+" "+k+" "+y+" "+cnt);
                            n[i]++;
                            n[j]++;
                            n[k]++;
                            a[z][0]=i;
                            a[z][1]=j;
                            a[z][2]=k;
                            z++;
                            cnt++;
                        }
                    }
                }
            }
        }
   /*     boolean flag=true;
       for(int w=1;w<=x;w++)
        {
            if(n[w]>1)
                flag=false;
        }
     */  if(cnt>=5)
        {
                 int w[][]=new int[5][3];
                // int brr[][]=new int[5][3];
                  boolean flag=true;
for(int p=0;p<=(cnt-5);p++)
{
      int asd[]=new int[x+1];
      for(int m=0;m<3;m++)
      {
      w[0][m]=a[p][m];
      asd[a[p][m]]++;
      }
     // System.out.println(sum+" "+0+" "+w[0][0]+" "+w[0][1]+" "+w[0][2]);
      for(int q=p+1;q<=(cnt-4);q++)
      {
            int asd2[]=new int[x+1];
          if(q!=p)
          {
           for(int m=0;m<3;m++)
            {
            w[1][m]=a[q][m];
            asd2[a[q][m]]++;
            }
               //  System.out.println(sum+" "+1+" "+w[1][0]+" "+w[1][1]+" "+w[1][2]);
            for(int r=q+1;r<=(cnt-3);r++)
            {
                flag=true;
                  int asd3[]=new int[x+1];
                if(r!=p && r!=q)
                {
                    for(int m=0;m<3;m++)
                    {
                    w[2][m]=a[r][m];
                    asd3[a[r][m]]++;
                    if((asd[a[r][m]]+asd2[a[r][m]]+asd3[a[r][m]])>2)
                    flag=false;
                    }
                  //    System.out.println(sum+" "+2+" "+w[2][0]+" "+w[2][1]+" "+w[2][2]);
                    if(flag)
                    {
                        for(int s=r+1;s<=(cnt-2);s++)
                        {
                            flag=true;
                              int asd4[]=new int[x+1];
                               if(s!=r && s!=p && s!=q)
                            {
                                for(int m=0;m<3;m++)
                                {
                                w[3][m]=a[s][m];
                                asd4[a[s][m]]++;
                                if((asd[a[s][m]]+asd2[a[s][m]]+asd3[a[s][m]]+asd4[a[s][m]])>2)
                                flag=false;
                                }
                           //       System.out.println(sum+" "+3+" "+w[3][0]+" "+w[3][1]+" "+w[3][2]);
                                if(flag)
                                {
                                    for(int u=s+1;u<=(cnt-1);u++)
                                    {
                                          int asd5[]=new int[x+1];
                                        flag=true;
                                        if(u!=p && u!=q && u!=r && u!=s)
                                        {
                                        for(int m=0;m<3;m++)
                                            {
                                            w[4][m]=a[u][m];
                                            asd5[a[u][m]]++;
                                            if((asd[a[u][m]]+asd2[a[u][m]]+asd3[a[u][m]]+asd4[a[u][m]]+asd5[a[u][m]])>2)
                                            flag=false;
                                            }
                                      //        System.out.println(sum+" "+4+" "+w[4][0]+" "+w[4][1]+" "+w[4][2]);
                                            if(flag)
                                            {
                                                int n2[]=new int[x+1];
                                                for(int aa=1;aa<=10;aa++)
                                                {
                                                    int bb=asd[aa]+asd2[aa]+asd3[aa]+asd4[aa]+asd5[aa];
                                                    n2[aa]=bb;
                                                    if(bb==0 || bb>2)
                                                        flag=false;
                                                }
                                                for(int v=0;v<5;v++)
                                                {
                                                    for(int v2=0;v2<3;v2++)
                                                    System.out.print(w[v][v2]+" ");
                                                    System.out.println();
                                                }
                                                System.out.println();
                                                for(int aa=0;aa<5;aa++)
                                                {
                                                    int b1=w[aa][0],b2=w[aa][1],b3=w[aa][2];
                                                    if(n2[b1]==2 && n2[b2]==2 && n2[b3]==2)
                                                    {
                                                        flag=false;
                                                    }
                                                }
                                                if(flag)
                                                {
                                                ma=display(x,arr,n2,w,5,t,cnt,ma);
                                                }
                                            }
                                    }
                                }
                        }
                    }
            }
      }
    }
     }
          }}}}
  //      System.out.println(i+" "+n[i]);
     /*   if(cnt==5)
        {
            display(x,arr,n,a,z,t,cnt);
        }*/
    }
    }
    static int[] check(int b[][],int c,int d,int e[],int f)
    {
        int r[]=new int[3];
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<3;j++)
            {
            if(c==b[i][j])
            {
               // System.out.println(i+" "+j+" "+c);
                r[1]=c;
                b[i][j]=0;
             for(int k=0;k<3;k++)
             {
                 if(e[b[i][k]]==1)
                 {
                     r[0]=b[i][k];
                     b[i][k]=0;
               // System.out.println(i+" "+k+" "+r[0]);
                 }else if(j!=k)
                 {
                 r[2]=b[i][k];
                 b[i][k]=0;
                // System.out.println(i+" "+k+" "+r[2]);
                 }
          }
        }
        }
        }
        return r;
    }

    static long display(int x,int brr[][],int n[],int b[][],int z,int t,int cnt,long max)
    {
        //long max=0;
        int arr[][]=new int[5][3];
        for(int i=1;i<=x;i++)
        {
            if(n[i]==1)
            {
                arr[0][0]=i;
             System.out.println(n[i]+" "+arr[0][0]);
                for(int j=0;j<z;j++)
                {
                    if(i==b[j][0])
                        {
                            arr[0][1]=Math.max(b[j][1],b[j][2]);
                            arr[0][2]=Math.min(b[j][1],b[j][2]);
                            b[j][1]=0;
                            b[j][2]=0;
                            break;
                        }
                    if(i==b[j][1])
                        {
                            arr[0][1]=Math.max(b[j][0],b[j][2]);
                            arr[0][2]=Math.min(b[j][0],b[j][2]);
                            b[j][0]=0;
                            b[j][2]=0;
                            break;
                        }
                    if(i==b[j][2])
                        {
                            arr[0][1]=Math.max(b[j][1],b[j][0]);
                            arr[0][2]=Math.min(b[j][1],b[j][0]);
                            b[j][0]=0;
                            b[j][1]=0;
                            break;
                        }
                  }
        //                 System.out.println(arr[0][0]+" "+arr[0][1]+" "+arr[0][2]);
                break;
               }
            }
    //    n[arr[0][0]]--;n[arr[0][1]]--;n[arr[0][2]]--;
         System.out.println(arr[0][0]+" "+arr[0][1]+" "+arr[0][2]+" "+t+" "+cnt);
         String ans=String.valueOf(arr[0][0])+String.valueOf(arr[0][1])+String.valueOf(arr[0][2]);
       for(int i=1;i<5;i++)
       {
         arr[i]=check(b,arr[i-1][2],5,n,i-1);
         ans+=String.valueOf(arr[i][0])+String.valueOf(arr[i][1])+String.valueOf(arr[i][2]);
         System.out.println(arr[i][0]+" "+arr[i][1]+" "+arr[i][2]+" fhfhfhfhf"+" "+ans+" "+max);
      //           n[arr[i][0]]--;n[arr[i][1]]--;n[arr[i][2]]--;
       }
         long ds=Long.parseLong(ans);
         if(ds>max && ans.length()==16)
             max=ds;
             return max;
    }



    }
/*
 * 1 3 10
 * 2 4 8
 * 1 5 8
 * 3 5 6
 * 68. 6531031914842725
 */