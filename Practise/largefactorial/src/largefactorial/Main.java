/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package largefactorial;
import java.io.*;
import java.util.*;
import java.math.*;
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
     //   int n=(Integer.parseInt(br.readLine()));
       // for(int i=0;i<n;i++)
     /*  {
         String s=br.readLine();
        String[] a=s.split(" ");
         int l=a.length;
          System.out.println(s.indexOf("("));
           System.out.println(s.indexOf(","));
            System.out.println(s.indexOf(")"));
         String[] b=a[l-1].split(",");
         Double d=new Double(s);
         double v=d;
         System.out.println(v+98.0);
         for(int i=0;i<b.length;i++)
         System.out.println(b[i]);
*/         String s=br.readLine();
         int x=Integer.parseInt(s);
         Vector arr=new Vector(10,10);
         //int arr[]=new int[20000];
         arr.add(0,1);
         int y=0;
         for(int i=1;i<=x;i++)
         {
        for(int j=0;j<20000;j++)
             {
               /*  if(arr[j]>9 && j!=0)
                 {
                     arr[j-1]+=arr[j]/10;
                     arr[j]=arr[j]%10;
                 }*/
                 if(y>=j)
                 {
                 arr.add(j,((Integer)arr.elementAt(j)*i));

                //System.out.println(arr[j]);
                 }
                 else
                     j=20000;
                 /* if(arr[j]>9 && j!=0)
                 {
                     arr[j-1]+=arr[j]/10;
                     arr[j]=arr[j]%10;

                 }*/
             }
             for(int j=0;j<=arr.size();j++)
             {
               if((Integer)arr.elementAt(j)>9)
               {
                  
                    System.out.println(arr.get(j)+" "+arr.size());
                   arr.set(j+1,((Integer)arr.elementAt(j+1)+((Integer)arr.elementAt(j)/10)));
                   arr.set(j,(Integer)arr.elementAt(j)%10);
                   //y=Math.max(y,j+1);
                   y=arr.size();
                   System.out.println(arr.elementAt(j));

         }
         }
         }
      //    y=0;
        //  for(int j=0;j<200;j++)
          //  if(arr[j]>0)
            //     y=j;
          for(int j=y;j>=0;j--)
              System.out.print(arr.elementAt(j));
       
     //BigInteger big=new BigInteger(br.readLine());
   /*      BigInteger xy=new BigInteger("1");
        int i=1;
       

       int k=Integer.parseInt(br.readLine());
          BigInteger j=new BigInteger("1");
           BigInteger fact=new BigInteger("1");
  
       //    String s="78";
         //  System.out.println(new BigInteger(s));
for(;i<k;i++)
{
    
    xy=xy.add(j);
    fact=fact.multiply(xy);
    //System.out.println(fact+" "+fact.equals(xy));
}
               System.out.println(fact);

           /*
         Scanner sc=new Scanner(System.in);
         for(int it=0;it<5;it++)
            System.out.println(sc.next());
*/
    }
}

