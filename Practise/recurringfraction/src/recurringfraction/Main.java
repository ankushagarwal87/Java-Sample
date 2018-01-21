/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package recurringfraction;

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
        double d;
        

        for(int i=2;i<=1000;i++)
        {
            int x,k=1,y=10;
            if(i>100)
            {
                y=1000;
                k=3;

            }
            else if(i>10)
            {
                y=100;
                k=2;
            }
            int a[]=new int[100];
            d=(double)y/i;
            x=y/i;
            
            int c=0;
          //  a[k++]=x;
            while(d!=x && a[k-1]!=x && k<99)
            {
               // System.out.println(i+" "+y+" "+d+" "+x);
a[k++]=x;
                y=y-i*x;
                y*=10;
                d=(double)y/i;
            x=y/i;
            }
            a[k++]=x;
            String s="";
            for(int j=0;j<100;j++)
             s+=a[j];
            int w=0;
         // System.out.println(i+" "+s);
             for(int j=1;j<s.length();j++)
             {
                 for(int m=j+1;m<s.length();m++)
                 {
                  if(s.charAt(j)==(s.charAt(m)) && s.charAt(j)!='0')
                  {
                      if((m-j+m<s.length())&&((s.substring(j, m)).equals(s.substring(m,m-j+m))) && (s.substring(j,m)).length() > w)
                      {
                          w=(s.substring(j,m)).length();
                          System.out.println(i+" "+s+" "+s.substring(j, m)+" "+s.substring(m,m-j+m)+" "+w);
                          j=s.length();
                          break;

                      }
                  }
                 }
             }
        }

    }
    
    static void f(int a[],int b,int c)
    {
        int s=0;
        for(int i=2;i<100;i++)
        {
            for(int j=4;j<100;j++)
            {
                if(a[i]==a[j])
                {
                    
                }
            }
        }
    }

}
