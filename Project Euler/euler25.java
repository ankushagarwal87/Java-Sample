 class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int i,c=2;
    int a[]=new int[3];a[0]=1;
    int b[]=new int[3];b[0]=1;
    int f[]=new int[3];
    while(f[2]==0)
    {c++; 
         for(i=0;i<3;i++)
         {

             f[i]=a[i]+b[i];
              if(f[i]>9) { f[i+1]++;
              f[i]-=10;}
            
    
    a[i]=b[i];b[i]=f[i];
     

    }
    }
    System.out.println(c);

    }

}