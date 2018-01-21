import java.io.*;
class euler11
{
public static void main(String asd[])throws IOException
{
byte b[]=new byte[1220];
int c=0,i,rmax=0,cmax=0,rdmax=0,cdmax=0;
int a[][]=new int[20][20];
FileInputStream j=new FileInputStream("a.txt");
System.out.println(j.read(b));
for(i=0;i<b.length-1;i+=3)
{if(b[i]==10) i++;
a[c/20][c%20]=(b[i]-48)*10+(b[i+1]-48);
System.out.print(a[c/20][c%20]+" ");c++;if(c%20==0) System.out.println();
}
for(i=0;i<20;i++)
{
for(c=0;c<17;c++)
{
rmax=Math.max(rmax,a[i][c]*a[i][c+1]*a[i][c+2]*a[i][c+3]);
cmax=Math.max(cmax,a[c][i]*a[c+1][i]*a[c+2][i]*a[c+3][i]);
if(i<17)
rdmax=Math.max(rdmax,a[i][c]*a[i+1][c+1]*a[i+2][c+2]*a[i+3][c+3]);
if(i>2)
cdmax=Math.max(cdmax,a[i][c]*a[i-1][c+1]*a[i-2][c+2]*a[i-3][c+3]);
}
System.out.println(rmax+" "+cmax+" "+rdmax+" "+cdmax);}
}}