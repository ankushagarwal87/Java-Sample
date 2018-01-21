/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pentadiff;

/**
 *
 * @author ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long a[]=new long[1000000];

      for(int i=1;i<5000;i++)

      {

     a[i]=i*(3*i-1)/2;
//System.out.println(i+" "+a[i]);
      }

      for(int i=1;i<5000;i++)

  {

     for(int j=i+1;j<5000;j++)

         {

               for(int k=1;k<j;k++)

           {

      if((a[j]-a[k])==a[i])

       {

     // System.out.println(a[j]+" "+a[k]+" "+a[i]+" "+j+" "+k+" "+i);

               for(int l=j;l<5000;l++)

                      {

                    if((a[j]+a[k])==a[l])
                    {
                           System.out.println("\t"+a[k]+" "+a[j]+" "+a[l]+" "+a[i]);
                    //else if(a[l]>(a[j]+a[k]))
                      //  k=j=25000;
                        break;
                    }
                      }
      break;

       }

    }



    }


   }


    }

}
