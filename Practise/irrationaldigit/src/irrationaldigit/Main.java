/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package irrationaldigit;

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

        int i=0;
        String s[]=new String[1001];
  s[0]="";
        for(int j=0;j<1000;j++)
  {
     
        while(s[j].length()<=1000)
    {
       i++;
        s[j]=s[j]+i;
        if(s[j].length()>1000)
        {
              s[j+1]=s[j].substring(1000);
    
        }

        }

    }
System.out.println(s[0].charAt(0)+" "+s[0].charAt(9)+" "+s[0].charAt(99)+" " +s[0].charAt(999)+" "+s[9].charAt(999)+" "+s[99].charAt(999)+" "+s[999].charAt(999));

    }
}
