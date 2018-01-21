/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package totient;

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
      int n=1000000;
      float z,y=0,max=0;
      for(int i=2;i<n;i++)
      {
          int s=1;
          z=(float)i/2;
          for(int j=2;j<=z;j++)
          {
              int flag=0;
              for(int k=2;k<=Math.sqrt(i)+1;k++)
              {
                  if(i%k==0)
                  {
                      if(j%k==0)
                      {
                          flag=1;
                          break;
                      }
                  }
              }
              if(flag==0)
              {
              s++;
           //  System.out.println(i+" "+j+" "+s+" "+max);
              }
      }
          y=(float)i/(2*s);
          if(y>max)
          {
              max=y;
           System.out.println("         "+i+" "+s+" "+y+" "+max);
          }
          }
    }

}
