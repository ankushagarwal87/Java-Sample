class euler4
{
    public static void main(String asd[])
    {
    	int a[]=new int[10000];
 	int b,c,k,rev,n=0,max;
for(int i=999;i>0;i--)
{
for(int j=999;j>0;j--)
{
c=i*j;
k=c;
rev=0;
while(k!=0)
{
b=k%10;
rev=rev*10+b;
k=k/10;
}
if(rev==c)
a[n++]=c;
}
}
max=a[0];
for(int i=1;i<10000;i++)
{
if(a[i]>max)
max=a[i];
}
System.out.print(max);
}}




C:\jdk1.1.3\bin>javac euler4.java

C:\jdk1.1.3\bin>java euler4
906609