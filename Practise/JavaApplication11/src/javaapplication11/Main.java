/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication11;

/**
 *
 * @author Ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
      int n=0,c=0;long i, x=0;
      while(c<=500)
      {
n++;c=0;

    x+=n;
double j=Math.sqrt(x);
for(i=1;i<=j;i++)
{
    if(x%i==0)
        c++;
}
    if((i-1)<j) c=2*c-1;
    else c=2*c;
      }
      System.out.println(x);
      }}