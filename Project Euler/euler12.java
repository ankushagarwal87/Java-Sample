import java.io.*;
class euler12
{
public static void main(String asd[])throws IOException
{
byte b[]=new byte[5200];
int l=0,c=0,i,j=0;
int a[][]=new int[100][50];
int x[]=new int[60];
FileInputStream r=new FileInputStream("k.txt");
System.out.println(r.read(b));
for(i=0;i<b.length;i++)
{
if(b[i]==13){c++; System.out.println();j=0;}if(b[i]>47){
a[c][j++]=(b[i]-48);
System.out.print(a[c][j-1]);}
}
for(i=49;i>=0;i--)
{
j=0;
for(c=0;c<100;c++)
{
j+=a[c][i];
}
System.out.println(j);
x[i+3]+=j%10;System.out.println(x[i+3]);
j/=10;
if(x[i+3]>9){x[i+3]-=10;x[i+2]++;}
x[i+2]+=j%10;System.out.println(x[i+2]);
j/=10;
if(x[i+2]>9){x[i+2]-=10;x[i+1]++;}
x[i+1]+=j%10;System.out.println(x[i+1]);
if(x[i+1]>9){x[i+1]-=10;x[i]++;}
}
System.out.println();
for(i=0;i<x.length;i++)
System.out.print(x[i]);


}}