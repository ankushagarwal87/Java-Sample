class euler14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
      int n=0,c=0;long i, x=0;
      while(c<=500)
      {
n++;c=0;

    x+=n;

for(i=1;i<=x/2;i++)
{
    if(x%i==0)
        c++;
}
      }
      System.out.println(x);
      }}