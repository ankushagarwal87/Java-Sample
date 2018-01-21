/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication12;

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
        int a[]=new int[500];
        a[0]=1;
        int i,j,s=0;
        for(i=0;i<1000;i++)
        {
            for(j=0;j<a.length;j++)
             a[j]*=2;
            for(j=0;j<a.length;j++)
               if(a[j]>9)
               {
                   a[j]=a[j]-10;
                   a[j+1]+=1;
               }
            for(j=0;j<a.length;j++)
                System.out.print(a[j]);
            System.out.println();
        }
        System.out.println(a.length);
        for(j=0;j<a.length;j++) s+=a[j];
    System.out.println(s);
    }

}
