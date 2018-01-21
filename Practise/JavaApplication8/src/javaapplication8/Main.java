/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication8;

/**
 *
 * @author Ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic he
int c,n=20,i;
do
{
    n++;
    c=0;
    for(i=1;i<=20;i++)
if(n%i!=0)
    break;
    else c++;
}while(c!=20);
System.out.println(n);
    }}

