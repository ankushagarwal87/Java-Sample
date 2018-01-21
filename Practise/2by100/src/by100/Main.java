/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package by100;

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
int a[]=new int[1000];int s=0;
for(int i=2;i<=100;i++)
  a[i]=i;
for(int i=2;i<=4;i++)
{
    for(int j=2;j<=100;j++)
    {int f=0;
        for(int k=2;k<1000;k++)
        {
            if(a[k]==i*j)
            {
    System.out.println(a[k]);
                f=1;
                 s++;
                 break;
            }
        }
        if(f==0)
    a[100*i+j]=i*j;
    }
}
    System.out.println(s);
    }
}



