/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//euler fabnocci
package javaapplication18;

/**
 *
 * @author Ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
static int a[]=new int[3];

    public static void main(String[] args) {
        // TODO code app
            int x[][]=new int[10000][1000];
            x[0][0]=1;x[1][0]=1;
int i=1;

            while(x[i][999]==0)
            { i++;
          x[i]=f(x[i-1],x[i-2]);
       
            
    }
System.out.println(i+1);
    }
static int[]  f(int a[],int b[])
{
      int c[]=new int[1000];
for(int i=0;i<1000;i++)
{    c[i]+=a[i]+b[i];
    if(c[i]>9){
        c[i]-=10;
        c[i+1]++;
        }
    
     }return c;
}
}

           
