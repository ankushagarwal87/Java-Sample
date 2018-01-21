/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package euler_origin_lie_in_triangle;
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
        // TODO code application logic here
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int res=0;
    for(int i=0;i<1000;i++)
    {
        String s=br.readLine();
        String a[]=new String[6];
        a=s.split(",");
        int arr[][]=new int[4][2];
        for(int j=0;j<3;j++)
        {
            arr[j][0]=Integer.parseInt(a[2*j]);
            arr[j][1]=Integer.parseInt(a[2*j+1]);
        }
         arr[3][0]=Integer.parseInt(a[0]);
            arr[3][1]=Integer.parseInt(a[1]);
        double m[]=new double[3];
        double y[]=new double[3];
        for(int j=0;j<3;j++)
            m[j]=slope(arr[j][0],arr[j][1],arr[j+1][0],arr[j+1][1]);
        for(int j=0;j<3;j++)
            y[j]=intercept(arr[j][0],arr[j][1],m[j]);
        int cnt=0;
        for(int j=0;j<3;j++)
        {
            if(y[j]>0 && ((arr[j][0]>0 && arr[j+1][0]<0) || (arr[j][0]<0 && arr[j+1][0]>0)))
            cnt++;
            //System.out.println(j+" "+arr[j][0]+" "+arr[j][1]+" "+m[j]+" "+y[j]+" "+cnt);
        }
        if(cnt==1)
            System.out.println("lie"+" "+(++res));
    }
    }

static double slope(int a,int b,int c,int d)
{
    return ((double)(d-b)/(c-a));
}
static double intercept(int a,int b,double c)
{
    return (double)(b*1.0-c*a);
}
}
