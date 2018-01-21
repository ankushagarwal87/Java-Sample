/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_diophantine_chakravala;

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
        for(int i=67;i<68;i++)
        {
            if(Math.sqrt(i)==Math.ceil(Math.sqrt(i)))
                System.out.println(i);
            else
            {
                long a=(int)Math.sqrt(i)+1;
                long b=1;
                long k=a*a-b*b*i;
                long w=Math.abs(k);
                long x,y,z,m;
                 System.out.println(i+" "+a+" "+b+" "+k);
                while(k!=1)
                {
                    long p=1,q=Long.MAX_VALUE,n;m=(w-a)/b;
                   while(true)
                    {
                        
                        if(m>0 && (p*w-a)%b==0 && Math.abs(m*m-i)<q)
                        {
                            q=Math.abs(m*m-i);
                             System.out.println("aasadads"+i+" "+p+"  "+m+" "+q);
                            
                        }
                        else if(m>0)
                            break;
                          p++;
                          if((p*w-a)%b==0)
                          {
                              m=(p*w-a)/b;
                          }
                        System.out.println(i+" "+p+"  "+m);
                     }
                   m=((p-1)*w-a)/b;
                  long f=a,g=b;
                   a=(a*m+i*b)/w;
                    b=(f+b*m)/w;
                    k=(m*m-i)/k;
                    w=Math.abs(k);
                System.out.println(i+" "+a+" "+b+" "+k+" "+m);
                   }
                System.out.println("hkkhk"+i+" "+a+" "+b+" "+k);
            }
        }
    }

}
