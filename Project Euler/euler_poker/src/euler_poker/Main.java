/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_poker;
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
        // TODO code application logic herer
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int cnt=0;
for(int i=0;i<1000;i++)
{
    String a[]=new String[10];
    String b=br.readLine();
    a=b.split(" ");
    char d[]=new char[5];
    char e[]=new char[5];
    char f[]=new char[5];
    char g[]=new char[5];
    for(int j=0;j<5;j++)
    {
        d[j]=a[j].charAt(0);
        e[j]=a[j].charAt(1);

    }
     for(int j=5;j<10;j++)
    {
        f[j-5]=a[j].charAt(0);
        g[j-5]=a[j].charAt(1);
    }
    int x[]=new int[5];
    int y[]=new int[5];
//     for(int j=0;j<5;j++)
  //      System.out.println(d[j]+" "+f[j]);
    x=change(d);
    y=change(f);
    x=sort(x);
    y=sort(y);
    //for(int j=0;j<5;j++)
      // System.out.println(x[j]+" "+y[j]);
boolean rf1,rf2,sf1,sf2,fok1,fok2,fh1,fh2,f1,f2,s1,s2,tok1,tok2,tp1,tp2,p1,p2;
rf1=isRoyalFlush(x,e);
rf2=isRoyalFlush(y,g);
boolean flag=false;

if(rf1==true && rf2==true)
{
    for(int j=0;j<5;j++)
        if(x[j]>y[j])
        {
          cnt++;
          flag=true;
          System.out.println(cnt+"rf");
          break;
        }
        else if(x[j]<y[j])
        {
            flag=true;
             System.out.println("player 2"+"rf");
             break;
        }
            
}
if(!flag)
{
 if(rf1==true && rf2==false)
   {
     cnt++;
     flag=true;
     System.out.println(cnt+"rf");
 }
}

if(!flag)
{
    if(rf1==false && rf2==true)
    {
        flag=true;
        System.out.println("player2"+" rf");
    }
}

 if(!flag)
{
    sf1=isStraightFlush(x,e);
    sf2=isStraightFlush(y,g);
    if(sf1==true && sf2==true)
    {
         for(int j=0;j<5;j++)
        if(x[j]>y[j])
        {
          cnt++;
          flag=true;
          System.out.println(cnt+"sf");
          break;
        }
         else if(x[j]<y[j])
        {
              flag=true;
             System.out.println("player 2"+"sf");
             break;
        }
    }

     if(sf1==true && sf2==false)
   {
     cnt++;
     flag=true;
     System.out.println(cnt+"sf");
 }
  if(sf1==false && sf2==true)
    {
        flag=true;
        System.out.println("player2"+" rf");
    }

 }

if(!flag)
{
    int w1[]=new int[2];
    int w2[]=new int[2];
  w1=is4OfKind(x);
w2=is4OfKind(y);
if(w1[0]!=0 && w2[0]!=0)
{
     for(int j=0;j<2;j++)
        if(w1[j]>w2[j])
        {
          cnt++;
          flag=true;
          System.out.println(cnt+"4ok");
          break;
        }
         else if(w1[j]<w2[j])
        {
             flag=true;
             System.out.println("player 2"+"fok");
             break;
        }
}
  if(w1[0]!=0 && w2[0]==0)
   {
     cnt++;
     flag=true;
     System.out.println(cnt+"4ok");
 }
if(w1[0]==0 && w2[0]!=0)
   {

     flag=true;
     System.out.println("playe2 "+"4ok");
}
}

if(!flag)
{
    int w1[]=new int[2];
    int w2[]=new int[2];
 w1=isFullHouse(x);
w2=isFullHouse(y);
if(w1[0]!=0 && w2[0]!=0)
{
    for(int j=0;j<2;j++)
        if(w1[j]>w2[j])
        {
          cnt++;
          flag=true;
          System.out.println(cnt+"fh");
          break;
        }
        else if(w2[j]<w1[j])
        {
             flag=true;
             System.out.println("player 2"+"fh");
             break;
        }
}
  if(w1[0]!=0 && w2[0]==0)
   {
     cnt++;
     flag=true;
     System.out.println(cnt+"fh");
 }
if(w1[0]==0 && w2[0]!=0)
   {

     flag=true;
     System.out.println("playe2 "+"fh");
}
}

if(!flag)
{
 f1=isFlush(e);
f2=isFlush(g);
if(f1==true && f2==true)
{
     for(int j=0;j<5;j++)
        if(x[j]>y[j])
        {
          cnt++;
          flag=true;
          System.out.println(cnt+"f");
          break;
        }
        else if(x[j]<y[j])
        {
             flag=true;
             System.out.println("player 2"+"f");
             break;
        }
}
  if(f1==true && f2==false)
   {
     cnt++;
     flag=true;
     System.out.println(cnt+"f");
 }
if(f1==false && f2==true)
   {

     flag=true;
     System.out.println("player2 "+"f");
}
}

if(!flag)
{
 s1=isStraight(x);
s2=isStraight(y);
if(s1==true && s2==true)
{
     for(int j=0;j<5;j++)
        if(x[j]>y[j])
        {
          cnt++;
          flag=true;
          System.out.println(cnt+"s");
          break;
        }
        else if(x[j]<y[j])
        {
             flag=true;
             System.out.println("player 2"+"s");
             break;
        }
}
  if(s1==true && s2==false)
   {
     cnt++;
     flag=true;
     System.out.println(cnt+"s");
 }
if(s1==false && s2==true)
   {

     flag=true;
     System.out.println("Player2 s");
}
}

if(!flag)
{
    int w1[]=new int[3];
    int w2[]=new int[3];
 w1=is3OfKind(x);
w2=is3OfKind(y);
if(w1[0]!=0 && w2[0]!=0)
{
     for(int j=0;j<3;j++)
        if(w1[j]>w2[j])
        {
          cnt++;
          flag=true;
          System.out.println(cnt+"3ok");
          break;
        }
        else if(w1[j]<w2[j])
        {
             flag=true;
             System.out.println("player 2"+"3ok");
             break;
        }
}
  if(w1[0]!=0 && w2[0]==0)
   {
     cnt++;
     flag=true;
     System.out.println(cnt+"3ok");
 }
if(w1[0]==0 && w2[0]!=0)
   {
      flag=true;
     System.out.println("player2 3ok");
 }
}


if(!flag)
{
     int w1[]=new int[3];
    int w2[]=new int[3];
 w1=isTwoPair(x);
w2=isTwoPair(y);
if(w1[0]!=0 && w2[0]!=0)
{
     for(int j=0;j<3;j++)
        if(w1[j]>w2[j])
        {
          cnt++;
          flag=true;
          System.out.println(cnt+"tp");
          break;
        }
        else if(w1[j]<w2[j])
        {
             flag=true;
             System.out.println("player 2"+"tp");
             break;
        }
}
  if(w1[0]!=0 && w2[0]==0)
   {
     cnt++;
     flag=true;
     System.out.println(cnt+"tp");
 }
if(w1[0]==0 && w2[0]!=0)
   {

     flag=true;
     System.out.println("player2 tp");
 }
}

if(!flag)
{
     int w1[]=new int[4];
    int w2[]=new int[4];
 w1=isPair(x);
w2=isPair(y);
if(w1[0]!=0 && w2[0]!=0)
{
     for(int j=0;j<4;j++)
        if(w1[j]>w2[j])
        {
          cnt++;
          flag=true;
          System.out.println(cnt+"p");
          break;
        }
        else if(w1[j]<w2[j])
        {
             flag=true;
             System.out.println("player 2"+"p");
             break;
        }
}
  if(w1[0]!=0 && w2[0]==0)
   {
     cnt++;
     flag=true;
     System.out.println(cnt+"p");
 }
if(w1[0]==0 && w2[0]!=0)
   {

     flag=true;
     System.out.println("player2 p");
 }
}

if(!flag)
{
    for(int j=0;j<5;j++)
        if(x[j]>y[j])
        {
          cnt++;
          flag=true;
          System.out.println(cnt+"hc");
          break;
        }
         else if(x[j]<y[j])
        {
             flag=true;
             System.out.println("player 2"+"hc");
             break;
        }
}

System.out.println(cnt);

}
    }

    static int[] change(char c[])
    {
int a[]=new int[5];
    for(int j=0;j<5;j++)
    {
        if(c[j]=='T')
            a[j]=10;
        else if(c[j]=='J')
            a[j]=11;
        else if(c[j]=='Q')
            a[j]=12;
        else if(c[j]=='K')
            a[j]=13;
        else if(c[j]=='A')
            a[j]=14;
        else
            a[j]=c[j]-48;
    }
    return a;
    }

    static boolean isRoyalFlush(int x[],char y[])
    {
         if(x[0]==14 && x[1]==13 && x[2]==12 && x[3]==11 && x[4]==10)
         {
             char c=(char)y[0];
             for(int j=1;j<5;j++)
             {
                 if(y[j]!=c)
                     return false;

             }
             return true;
         }
         return false;
    }

    static boolean isStraightFlush(int x[],char y[])
    {
        if(x[1]==x[0]-1 && x[2]==x[1]-1 && x[3]==x[2]-1 && x[4]==x[3]-1)
         {
             char c=(char)y[0];
             for(int j=1;j<5;j++)
             {
                 if(y[j]!=c)
                     return false;

             }
             return true;
         }
         return false;
    }

    static int[] is4OfKind(int x[])
    {
        int a[]=new int[15];
        int z[]=new int[2];
        for(int j=0;j<5;j++)
             a[x[j]]++;
        for(int j=2;j<15;j++)
        {  if(a[j]==4)
                   z[0]=j;
        if(a[j]==1)
            z[1]=j;
        }return z;
    }

    static int[] isFullHouse(int x[])
    {
        int c[]=new int[2];
      int a[]=new int[15];
       for(int j=0;j<5;j++)
             a[x[j]]++;
        for(int j=2;j<15;j++)
             if(a[j]==3)
                 for(int k=2;k<15;k++)
                     if(a[k]==2)
                     {
                         c[0]=j;
                         c[1]=k;
                     }
        return c;
    }

    static boolean isFlush(char y[])
    {
         char c=(char)y[0];
             for(int j=1;j<5;j++)
               if(y[j]!=c)
                     return false;
         return true;
    }

    static boolean isStraight(int x[])
    {
        if(x[1]==x[0]-1 && x[2]==x[1]-1 && x[3]==x[2]-1 && x[4]==x[3]-1)
         return true;
        else
            return false;
    }

    static int[] is3OfKind(int x[])
    {
         int a[]=new int[15];
         int z[]=new int[3];
         for(int j=0;j<5;j++)
             a[x[j]]++;
        for(int j=14;j>1;j--)
        {if(a[j]==3)
                   z[0]=j;
         if(a[j]==1 && z[1]==0)
             z[1]=j;
         if(a[j]==1 && z[1]!=j && z[2]==0)
             z[2]=j;
        }
         return z;
    }

    static  int[] isTwoPair(int x[])
    {
        int a[]=new int[15];
        int z[]=new int[3];
       for(int j=0;j<5;j++)
             a[x[j]]++;
        for(int j=2;j<15;j++)
             if(a[j]==2)
                 for(int k=2;k<15;k++)
                 {   if(a[k]==2 && j!=k)
                     {
                       z[0]=k;
                       z[1]=j;
                       j=15;
                     }
        if(a[k]==1)
        {
            z[2]=k;
        }

                 }
        return z;
    }

    static int[] isPair(int x[])
    {
          int a[]=new int[15];
          int z[]=new int[4];
        for(int j=0;j<5;j++)
             a[x[j]]++;
        for(int j=14;j>1;j--)
        {  if(a[j]==2)
                   z[0]=j;
           if(a[j]==1 && z[1]==0)
               z[1]=j;
           if(a[j]==1 && j!=z[1] && z[2]==0)
               z[2]=j;
           if(a[j]==1 && j!=z[1] && j!=z[2] && z[3]==0)
            z[3]=j;
        }
        return z;
    }

    static int[] sort(int x[])
    {
        int temp;
        for(int j=0;j<5;j++)
        {
            for(int k=j+1;k<5;k++)
            {
                if(x[k]>x[j])
                {
                    temp=x[j];
                    x[j]=x[k];
                    x[k]=temp;
                }
            }
        }
        return x;
    }

}