class euler2
{
    public static void main(String asd[])
    {
        int a=1,b=2,sum=0,c;
        if(a%2==0) sum+=a;
        if(b%2==0) sum+=b;
        c=a+b;
        while(c<4000000)
        { 
System.out.println(c);  
 if (c%2==0)
 sum+=c;
        a=b;
	b=c;
	c=a+b;
    }
        System.out.print("sum="+sum);
    }
}


//sum=4613732