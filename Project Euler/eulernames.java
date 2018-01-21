import java .io.*;
class eulerfile
{public static void main(String asd[])throws IOException
{
long total=0;
byte c[]=new byte[50000];
int j=0;int m;
String s[]=new String[19041];
FileInputStream k=new FileInputStream("names.txt");
System.out.println(k.read(c));

for(int i=0;i<c.length;i++)
{

if(c[i]==44)
j++;
else
s[j]+=(char)c[i];

}
for(int i=0;i<=j;i++)
{ 
for(m=i;m<=j;m++)
{
if(s[i].compareTo(s[m])>0)
{
String temp=s[i];
s[i]=s[m];
s[m]=temp;
}
}
int n=5;int sum=0;
while(s[i].charAt(n)!=34)
{
sum+=s[i].charAt(n)-64;
n++;
}
total+=sum*(i+1);
if(i==937)
System.out.println(sum*(i+1));
}
System.out.println(total);
}}
