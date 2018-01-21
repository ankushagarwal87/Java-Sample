class euler4
{
    public static void main(String asd[])
    {
    	int a[]=new int[100000];
 	int b,c,k,rev=0,n=0,max;
for(int i=999;i>0;i--)
{
for(int j=999;j>0;j--)
{
c=i*j;
k=c;
while(k!=0)
{
b=k%10;
k=k/10;
rev=rev*10+b;
}
if(rev==c)
a[n++]=c;
}
}
max=a[1];
for(int i=1;i<100000;i++)
{
if(a[i]>max)
max=a[i];
}
System.out.print(max);
}}