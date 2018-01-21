#include <stdio.h>


int main(void) {
int i=0,j=0,n=0,a=0,b=0,c=0,d=0,x=0,y=0,sum=0,min=0;
scanf("%d",&n);
scanf("%d %d %d %d",&a,&b,&c,&d);
for(i=0;i<=(n/b);i++)
{
if((n-i*b)%d==0)
{
x=(n-i*b)/d;
sum=i*a+x*c;
if(sum<min)
min=sum;
printf("%d %d %d\n",i,x,min);
}
}
return 0;
}