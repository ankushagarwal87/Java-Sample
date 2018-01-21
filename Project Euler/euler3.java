class euler3
{
    public static void main(String asd[])
    {
    	long n=600851475143L;
    	long c=2;
        while(n!=1)
        {
        	if(n%c==0)
{ System.out.println(c);
        	 n=n/c;}
                else 
               c++;
}
System.out.println(c);
}}


//C:\jdk1.1.3\bin>javac -deprecation euler3.java

//C:\jdk1.1.3\bin>java euler3
//6857