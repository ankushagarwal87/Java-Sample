class a {

    public static void main(String[] args) {
       int d3=0,d5=0,d35=0;
       for(int i=1;i<1000;i++)
       {
            if(i%3==0)
                d3+=i;
            if(i%5==0)
                d5+=i;
            if(i%3==0 && i%5==0)
                d35+=i;
         
    }
System.out.print("sum="+(d3+d5-d35));
}
}


//sum=233168