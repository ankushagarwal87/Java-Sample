/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

/**
 *
 * @author ankush
 */
import java.io.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
byte z[]=new byte[4096];
FileInputStream q=new FileInputStream("D:/program/euler/sudoku.txt");
System.out.println(q.read(z));
int s=0,r=0;
int b[][]=new int[9][9];
for(int w=0;w<z.length;w++)
{
    if(z[w]==10)
    {
      s++;
        System.out.println();
    }
     //   else
  // System.out.print(z[w]);
 if(z[w]>47 && z[w]<58 && s>0)
 {
     b[s-1][r++]=z[w]-48;
     System.out.print(b[s-1][r-1]);
 }
    if(r>8)
        r=0;
    if(s>=10)
    {
        int a[][][]=new int[10][10][10];
boolean flag=true;
while(flag)
{
for(int i=0;i<9;i++)
{
for(int j=0;j<9;j++)
{
    if(b[i][j]!=0)
    {
     //  System.out.println(i+" "+j+" "+b[i][j]+" "+a[i][j][b[i][j]]);
        for(int v=1;v<10;v++)
            a[i][j][v]=10;
        a[i][j][b[i][j]]=b[i][j];
     // System.out.println(i+" "+j+" "+b[i][j]+" "+a[i][j][b[i][j]]);
    }
    if(b[i][j]==0)
    {
    for(int m=0;m<9;m++)
{
   if(b[i][m]!=0)
   {
       a[i][j][b[i][m]]=10;
 //  System.out.println(i+" "+j+"  "+b[i][j]+" "+a[i][j][b[i][m]]+" "+m+" "+b[i][m]+"row");
   }
   if(b[m][j]!=0)
   {
       a[i][j][b[m][j]]=10;
 //System.out.println(i+" "+j+" "+b[i][j]+" "+a[i][j][b[m][j]]+" "+m+" "+b[m][j]);
   }
    }
   // System.out.print(b[i][j]+" ");
}
 //  for(int m=1;m<10;m++)
   // System.out.print(a[i][j][m]+" ");
//System.out.println();
}
}
//boolean flag=true;
//int b[][]={{0,0,3,0,2,0,6,0,0},{9,0,0,3,0,5,0,0,1},{0,0,1,8,0,6,4,0,0},{0,0,8,1,0,2,9,0,0},{7,0,0,0,0,0,0,0,8},{0,0,6,7,0,8,2,0,0},{0,0,2,6,0,9,5,0,0},{8,0,0,2,0,3,0,0,9},{0,0,5,0,1,0,3,0,0}};
//while(flag)
//{
for(int i=0;i<9;i++)
{
for(int j=0;j<9;j++)
{
    if(b[i][j]==0)
    {
//System.out.print(b[i][j]+" ");
//System.out.println();
for(int m=0;m<9;m++)
{
   if(b[i][m]!=0)
       a[i][j][b[i][m]]=10;
   if(b[m][j]!=0)
       a[i][j][b[m][j]]=10;
 }
////for(int m=1;m<10;m++)
//System.out.print(a[i][j][m]+" ");
//System.out.println();

        int c=0;
if(i<3)
{
    if(j<3)
        c=1;
    else if(j>2 && j<6)
        c=2;
    else
        c=3;
}
else if(i>2 && i<6)
{
    if(j<3)
        c=4;
    else if(j>2 && j<6)
        c=5;
    else 
        c=6;
}
else
{
    if(j<3)
        c=7;
    else if(j>2 && j<6)
        c=8;
    else c=9;
}
//System.out.println(i+" "+j+" "+c);
        int re[][][]=new int[10][9][9];
        int ce[][][]=new int[10][9][9];
switch(c)
{
    case 1:
            for(int l=1;l<10;l++)
            {
                int cnt=0,row=11,col=11;
                for(int m=0;m<3;m++)
                {
                for(int n=0;n<3;n++)
                {
                if(b[m][n]!=0)
                {
                     for(int ii=0;ii<3;ii++)
                    {
                     for(int jj=0;jj<3;jj++)
                     {
                        a[ii][jj][b[m][n]]=10;
                     }
                    }
                    //a[i][j][b[m][n]]=10;
                a[m][n][b[m][n]]=b[m][n];
               // System.out.println(i+" "+j+" "+m+" "+n+" "+b[m][n]+" "+a[m][n][b[m][n]]+" "+l+ " kfyk");
                }
                if(a[m][n][l]!=10)
                {
                cnt++;
                row=m;
                col=n;
               //System.out.println(cnt+" "+m+" "+n+" "+l+"first");
                }
                 }
                  }
                if(cnt==1)
                {
                ////    System.out.println(cnt+" "+row+" "+col+" "+l);
                    b[row][col]=l;
                   for(int v=1;v<10;v++)
                         a[row][col][v]=10;
                      a[row][col][b[row][col]]=b[row][col];
                }
            }
        break;
         case 2:
         for(int l=1;l<10;l++)
            {
                int cnt=0,row=11,col=11;
                for(int m=0;m<3;m++)
        {
            for(int n=3;n<6;n++)
            {
                if(b[m][n]!=0)
                {
                    for(int ii=0;ii<3;ii++)
                    {
                     for(int jj=3;jj<6;jj++)
                     {
                        a[ii][jj][b[m][n]]=10;
                     }
                    }
                    a[m][n][b[m][n]]=b[m][n];
                }
                if(a[m][n][l]!=10)
                {
                cnt++;
                row=m;
                col=n;
                }

            }
        }
                if(cnt==1)
                {
                   // System.out.println(cnt+" "+row+" "+col+" "+l);
                    b[row][col]=l;
                     for(int v=1;v<10;v++)
                    a[row][col][v]=10;
                     a[row][col][b[row][col]]=b[row][col];
                }
            }
         break;
         case 3:
          for(int l=1;l<10;l++)
            {
                int cnt=0,row=11,col=11;
                for(int m=0;m<3;m++)
        {
            for(int n=6;n<9;n++)
            {
                if(b[m][n]!=0)
                {
                     for(int ii=0;ii<3;ii++)
                    {
                     for(int jj=6;jj<9;jj++)
                     {
                        a[ii][jj][b[m][n]]=10;
                     }
                    }
                    a[m][n][b[m][n]]=b[m][n];
                }
                if(a[m][n][l]!=10)
                {
                cnt++;
                row=m;
                col=n;
                }

            }
        }
                if(cnt==1)
                {
                // System.out.println(cnt+" "+row+" "+col+" "+l);
                    b[row][col]=l;
                    for(int v=1;v<10;v++)
            a[row][col][v]=10;
                     a[row][col][b[row][col]]=b[row][col];
                }
            }
    break;
    case 4:
           for(int l=1;l<10;l++)
            {
                int cnt=0,row=11,col=11;
                for(int m=3;m<6;m++)
                {
                 for(int n=0;n<3;n++)
                 {
                if(b[m][n]!=0)
                {
                     for(int ii=3;ii<6;ii++)
                    {
                     for(int jj=0;jj<3;jj++)
                     {
                        a[ii][jj][b[m][n]]=10;
                     }
                    }
                    a[m][n][b[m][n]]=b[m][n];
                }
                if(a[m][n][l]!=10)
                {
                cnt++;
                row=m;
                col=n;
                }

            }
        }
                if(cnt==1)
                {
                    // System.out.println(cnt+" "+row+" "+col+" "+l);
                    b[row][col]=l;
                    for(int v=1;v<10;v++)
            a[row][col][v]=10;
                     a[row][col][b[row][col]]=b[row][col];
                }
            }
    break;
    case 5:
           for(int l=1;l<10;l++)
            {
                int cnt=0,row=11,col=11;
                for(int m=3;m<6;m++)
        {
            for(int n=3;n<6;n++)
            {
                if(b[m][n]!=0)
                {
                 for(int ii=3;ii<6;ii++)
                    {
                     for(int jj=3;jj<6;jj++)
                     {
                        a[ii][jj][b[m][n]]=10;
                     }
                    }
                a[m][n][b[m][n]]=b[m][n];
                } if(a[m][n][l]!=10)
                {
                cnt++;
                row=m;
                col=n;
                }

            }
        }
                if(cnt==1)
                {
                    // System.out.println(cnt+" "+row+" "+col+" "+l);
                    b[row][col]=l;
                    for(int v=1;v<10;v++)
            a[row][col][v]=10;
                     a[row][col][b[row][col]]=b[row][col];
                }
            }
    break;
    case 6:   for(int l=1;l<10;l++)
            {
                int cnt=0,row=11,col=11;
                for(int m=3;m<6;m++)
        {
            for(int n=6;n<9;n++)
            {
                if(b[m][n]!=0)
                {
                     for(int ii=3;ii<6;ii++)
                    {
                     for(int jj=6;jj<9;jj++)
                     {
                        a[ii][jj][b[m][n]]=10;
                     }
                    }
                    a[m][n][b[m][n]]=b[m][n];
                }
                if(a[m][n][l]!=10)
                {
                cnt++;
                row=m;
                col=n;
                }

            }
        }
                if(cnt==1)
                {
                 //    System.out.println(cnt+" "+row+" "+col+" "+l);
                    b[row][col]=l;
                   for(int v=1;v<10;v++)
            a[row][col][v]=10;
                     a[row][col][b[row][col]]=b[row][col];
                }
            }
    break;
    case 7:   for(int l=1;l<10;l++)
            {
                int cnt=0,row=11,col=11;
                for(int m=6;m<9;m++)
        {
            for(int n=0;n<3;n++)
            {
                if(b[m][n]!=0)
                {
                     for(int ii=6;ii<9;ii++)
                    {
                     for(int jj=0;jj<3;jj++)
                     {
                        a[ii][jj][b[m][n]]=10;
                     }
                    }
                  a[m][n][b[m][n]]=b[m][n];
                }
                if(a[m][n][l]!=10)
                {
                cnt++;
                row=m;
                col=n;
                }

            }
        }
                if(cnt==1)
                {
               //    System.out.println(cnt+" "+row+" "+col+" "+l);
                    b[row][col]=l;
                   for(int v=1;v<10;v++)
                    a[row][col][v]=10;
                     a[row][col][b[row][col]]=b[row][col];
                }
            }
    break;
    case 8:   for(int l=1;l<10;l++)
            {
                int cnt=0,row=11,col=11;
                for(int m=6;m<9;m++)
        {
            for(int n=3;n<6;n++)
            {
                if(b[m][n]!=0)
                {
                     for(int ii=6;ii<9;ii++)
                    {
                     for(int jj=3;jj<6;jj++)
                     {
                        a[ii][jj][b[m][n]]=10;
                     }
                    }
                    a[m][n][b[m][n]]=b[m][n];
                }
                if(a[m][n][l]!=10)
                {
                cnt++;
                row=m;
                col=n;
                }

            }
        }
                if(cnt==1)
                {
                //   System.out.println(cnt+" "+row+" "+col+" "+l);
                    b[row][col]=l;
                    for(int v=1;v<10;v++)
                        a[row][col][v]=10;
                     a[row][col][b[row][col]]=b[row][col];
                }
            }
    break;
    case 9:   for(int l=1;l<10;l++)
            {
                int cnt=0,row=11,col=11;

                for(int m=6;m<9;m++)
        {

            for(int n=6;n<9;n++)
            {
                if(b[m][n]!=0)
                {
                     for(int ii=6;ii<9;ii++)
                    {
                     for(int jj=6;jj<9;jj++)
                     {
                        a[ii][jj][b[m][n]]=10;
                     }
                    }
                    a[m][n][b[m][n]]=b[m][n];
                }
                if(a[m][n][l]!=10)
                {
                cnt++;
                row=m;
                col=n;
             //   re[l][m]++;
                }
             

            }
        }
                if(cnt==1)
                {
             //       System.out.println(cnt+" "+row+" "+col+" "+l);
                    b[row][col]=l;
                    for(int v=1;v<10;v++)
            a[row][col][v]=10;
                     a[row][col][b[row][col]]=b[row][col];
                }
               
                
            }
}
int x=0,y=0;

for(int m=1;m<10;m++)
{
    //System.out.print(a[i][j][m]+" ");
    if(a[i][j][m]==0)
    {
       // System.out.print(m+" ");
        x++;
        y=m;
    }
}
//System.out.println();
if(x==1)
{
    b[i][j]=y;
for(int v=1;v<10;v++)
            a[i][j][v]=10;
                     a[i][j][b[i][j]]=b[i][j];
}
    }
    for(int aa=1;aa<10;aa++)
    {
        int cnt=0,row=11,col=11;
        for(int bb=0;bb<9;bb++)
        {
            for(int cc=0;cc<9;cc++)
            {
                if(a[bb][cc][aa]!=10)
                {
                    cnt++;
                    row=bb;
                    col=cc;
                }
            }
            for(int cc=0;cc<9;cc++)
            {
                if(a[cc][bb][aa]!=10)
                {
                    cnt++;
                    row=cc;
                    col=bb;
                }
            }
        if(cnt==1)
        {
            b[row][col]=aa;
             for(int v=1;v<10;v++)
            a[row][col][v]=10;
                     a[row][col][b[row][col]]=b[row][col];
        }
    }
    }
    System.out.println();
for(int ii=0;ii<9;ii++)
{
for(int jj=0;jj<9;jj++)
{
    System.out.print(b[ii][jj]+" ");
}
System.out.println();
    }
}
}
flag=false;
for(int i=0;i<9;i++)
{
for(int j=0;j<9;j++)
{
    if(b[i][j]==0)
    { flag=true;
    j=9;
    i=9;
}
}
}

}
System.out.println();
for(int i=0;i<9;i++)
{
for(int j=0;j<9;j++)
{
    System.out.print(b[i][j]+" ");
}
System.out.println();
    }
s=0;r=0;
}
}
}
}
 // 901105075




    


