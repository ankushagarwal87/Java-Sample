/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stringgame;
import java.io.*;


/**
 *
 *
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
        int t=Integer.parseInt(br.readLine());
       String str[]=new String[5];
        String substr[][]=new String[5][30];
        int arr[]=new int[5];
        String name[]={"Teddy","Tracy"};
        for(int i=0;i<t;i++)
        {
            str[i]=br.readLine();
            arr[i]=Integer.parseInt(br.readLine());
            for(int j=0;j<arr[i];j++)
                  substr[i][j]=br.readLine();
        }
        for(int i=0;i<t;i++)
        {
             //    System.out.println("jk"+part(str[i],substr[i],arr[i],0)+"fhjf");

             int c=0;
               String x,y;
                int pos=-1;
                for(int j=0;j<arr[i];j++)
                {
                for(int k=j+1;k<arr[i];k++)
                {
                    if(substr[i][j].length()<substr[i][k].length())
                {
                    x=substr[i][j];
                    substr[i][j]=substr[i][k];
                    substr[i][k]=x;
                }
                }
               // System.out.println(substr[i][j]);
                 }



for(int j=0;j<arr[i];j++)
{
    x="";
                y="";
                pos=str[i].indexOf(substr[i][j]);
              if(pos>=0)
              {
                //  System.out.println(pos);
                 
                  if(pos>0)
                  x=str[i].substring(0,pos);
                  y=str[i].substring(pos+substr[i][j].length());
                  str[i]=x.concat(" "+y);
                   System.out.println(substr[i][j]+" "+x+" "+y+" "+str[i]+" "+pos+" "+c+" "+name[c%2]);
               c++;
                   j=0;
              }
}
                if(c%2==0)
                {
                    str[i]="Tracy";
            //        System.out.println("Tracy");
                }
                else
                {
              //      System.out.println("Teddy");
                    str[i]="Teddy";
                }
           

        }

        for(int i=0;i<t;i++)
            System.out.println(str[i]);
    }

    static int part(String abc,String xyz[],int d,int m)
    {
       System.out.println("enter"+m);
       int cnt=0;
        for(int i=0;i<d;i++)
        {
            
        int po=-1;
        String ab="",cd="";
        po=abc.indexOf(xyz[i]);
        if(po>=0)
              {
                //  System.out.println(pos);

                  if(po>0)
        ab=abc.substring(0,po);
                  cd=abc.substring(po+xyz[i].length());
                  abc=ab.concat(" "+cd);
                  System.out.println(xyz[i]+" "+ab+" "+cd+" "+abc+" "+po+" "+m);
        cnt++;
        m+=part(abc,xyz,d,m);
System.out.println(part(abc,xyz,d,m));

        }

    }
           return cnt;

}

}
