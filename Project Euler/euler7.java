 class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int a=1,n=0,c,i;
        do
        {
             a++;
            c=0;
for(i=2;i<a;i++)
    if(a%i==0) c++;
            if(c==0) n++;

        }while(n!=10001);

System.out.print(a);


 // TODO code application logic here
    }

}