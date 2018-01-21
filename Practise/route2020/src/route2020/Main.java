/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package route2020;

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
        long a[][]=new long[21][21];
        a[20][20]=0;

        for(int i=0;i<20;i++)
        {
            a[i][20]=1;a[20][i]=1;
        }
        for(int i=19;i>=0;i--)
        {
            for(int j=19;j>=0;j--)
                a[i][j]=a[i+1][j]+a[i][j+1];
        
        }System.out.println(" "+a[0][0]+" "+(int)a[0][0]);
    }

}
