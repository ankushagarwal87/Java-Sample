/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication25;
//calender
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
int s=0;int k=0;
        for(int i=1900;i<=2000;i++)
        {
int b=0;int n=0;
            if(i%4==0 && i!=1900)
                b++;
int a[]={1,32,60+b,91+b,121+b,152+b,182+b,213+b,244+b,274+b,305+b,335+b,366+b};
            for(int j=1;j<=365+b;j++)
            {
                k++;
                if(j==a[n])
                {
             if(k%7==0 && i!=1900){
                 s++;System.out.println(i+" "+a[n]+" "+j);

             }
n++;}
            }
System.out.println(s);



        }    }}


