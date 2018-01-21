import java.io.*;
class eulertriangle
{
public static void main(String asd[])throws IOException
{
byte b[]=new byte[15550];
FileInputStream fsr=new FileInputStream("triangle.txt");
System.out.println(fsr.read(b));
int a[][]=new int[1000][1000];
int j=0,k=0;
for(int i=0;i<b.length;i++)
{
if(b[i]>47 && b[i]<58)
a[k][j]=a[k][j]*10+b[i]-48;
if(b[i]==32)
j++;
if(b[i]==13)
{k++;j=0;}

}
for(int i=1;i<=k;i++)
{
for(int l=0;l<=i;l++)
{
if(l==0)
a[i][l]+=a[i-1][l];
else if(i==l)
a[i][l]+=a[i-1][l-1];
else
a[i][l]+=Math.max(a[i-1][l-1],a[i-1][l]);
System.out.print(" "+a[i][l]);}
System.out.println();
}
int temp=a[k][0];
for(int i=1;i<=k;i++)
temp=Math.max(temp,a[k][i]);
System.out.println(" "+temp);
}}