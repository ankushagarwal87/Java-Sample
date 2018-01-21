/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nnnumber;
import java.io.*;
/**
 *Team ID: 7225
 * Ankush Agarwal - Team Creator
ankushagarwal87@gmail.com
 * @author ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int s[]=new int[t];
        for(int i=0;i<t;i++)
            s[i]=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
             int sum=0;
            for(int j=2;j<s[i];j++)
            {
              
         int x=j,y,k;
            int arr[]=new int[s[i]];

              for(k=1;k<s[i];k++)
              {
                
                 x%=s[i];
                System.out.println(s[i]+" "+x+" "+j+" "+k);
                 arr[x]++;
              
                 if(x==1 || arr[x]>1  || x==0)
                     break;
                 x=x*j;
               }
            if((k+1)>=s[i])
            {
                sum++;
                System.out.println("gf"+sum+" "+j);

            }

                  }
            System.out.println(sum);
        }
    }
}

