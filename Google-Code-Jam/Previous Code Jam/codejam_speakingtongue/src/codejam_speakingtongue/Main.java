/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package codejam_speakingtongue;
import java.io.*;
/**
 *
 * @author ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        //System.out.println(Math.floor(Math.log10(11)));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        String ans[]=new String[t];
        char arr[]={'y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','q'};
        for(int i=0;i<t;i++)
        {
            String x=br.readLine();
            ans[i]="";
            for(int j=0;j<x.length();j++)
            {
                if(x.charAt(j)==' ')
                    ans[i]+=' ';
                else
                {
                for(int k=0;k<26;k++)
                {
                    if(arr[k]==x.charAt(j))
                    {
                        int a=97+k;
                        char b=(char)a;
                        ans[i]+=b;
                        break;
                    }
                }
                }
            }
        }
        for(int i=0;i<t;i++)
        {
            System.out.println("Case #"+(i+1)+": "+ans[i]);
        }

}
}