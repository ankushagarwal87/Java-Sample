/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pandigitalconcat;

/**
 *
 * @author Ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int z=0;
        for(int i=1;;i++)
        {
            int a[]=new int[10];
           int flag=0;
            int j;
            int t;
              String y="";
            for(j=1;flag==0;j++)
            {
                int x=i*j;
                  y+=String.valueOf(x);
                while(x!=0)
                {
                    
                    a[x%10]++;
                //   System.out.println(i+" "+j+" "+x%10+" "+a[x%10]+" "+flag);
                      x/=10;
                }
                 int k=0;
               
                for(int l=1;l<10;l++)
                {
                    if(a[0]==0 && a[l]==1)
                    {
                   //      System.out.println(i+" "+j+" "+a[l]);
                        k++;
                    }
                    if(a[l]>1 || a[0]>0)
                    {
                        flag=1;
                 //        System.out.println(i+" "+j+" "+a[l]);
                        
                    }
                  
                }
                  if(k==9)
                  {
                  t=Integer.valueOf(y);
                      flag=1;
                    z=Math.max(z,t);
                      System.out.println(i+" "+j+" "+y+" "+z+" "+t);
                  }
            }//932718654
          

        }
    }

}
