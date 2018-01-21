/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication19;
//spoj3
import java.io.*;
/**
 *
 * @author Ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        int a;
        String x,y;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        x=br.readLine();
        y=br.readLine();
        System.out.print(x.indexOf(y));
    }}
    
