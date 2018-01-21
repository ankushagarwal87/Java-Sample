/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication5;

/**
 *
 * @author Ankush
 */
import java.io.*;
class Main
{public static void main(String asd[])throws IOException
{

int c=0;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int a[]= new int[100];
System.out.println("INPUT:");
String s;
do
{

a[c]=Integer.parseInt(br.readLine());
c++;
}while(a[c-1]!=42);
for(int i=0;i<c-1;i++)
System.out.println(a[i]);}


}