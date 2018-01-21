/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//amphicable
package javaapplication15;

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
        int i,j,c,k,sum=0;
                for(i=2;i<10000;i++)
                {c=0;k=0;

                    for(j=1;j<=i/2;j++)
                    if(i%j==0)
                        c+=j;
                 for(j=1;j<=c/2;j++)
                     if(c%j==0) k+=j;
                 if(k==i && i!=c)
                 {System.out.println(i+" "+c);
sum+=i;}
                    }System.out.println(sum);
                }
    

}
