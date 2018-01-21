/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package possiblenoof100;

/**
 *
 * @author ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int s=0;int n=10;
        int a[]=new int[100];
      for(int i=1;i<100;i++)
          a[i]=(int)Math.floor(n/i);
    Main o=new Main();
        for(int i=n-1;i>0;i--)
      {
        for(int k=1;k<=a[i];k++)
        {
        s=i*k;
        if(s==n)
            System.out.println(i+" "+k+" "+s);
        else
        {
      /*   for(int j=1;j<n;j++)
          {
        if((s+j)<=n && j<i)
        {
            System.out.println(i+" "+k+" "+j);
        */   o.func(s,i-1,a,i,k,n);
        /*}
        else
            break;
          }*/
          }
      }
        }
    }
 void func(int c,int j,int a[],int i,int k,int n)
 {
     int z=c;int y=0;
     for(int x=0;x<=a[j];x++)
     {
         y=j;
       
         if((z+j)<=n  && x>0)
             z=z+j;
         if(z==n)
         {
             System.out.println(i+" "+k+" "+j+" "+x+" "+z);
             break;
         }
         else
         {
             y=j-1;
              if(z<=n && y>0)
          {       System.out.println(z);
             func(z,y,a,i,k,n);
         }
     }
          // if(((c+j)-z)>0) x=a[j]+1;
 }
 }

}
