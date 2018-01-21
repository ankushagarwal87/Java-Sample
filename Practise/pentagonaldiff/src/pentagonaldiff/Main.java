/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pentagonaldiff;

/**
 *
 * @author Ankush
 */

public class Main 
{

    
/**
     * @param args the command line arguments
     */
    
public static void main(String[] args) 
{
      
  // TODO code application logic here
   
     long a[]=new long[100000];
  
      for(int i=1;i<10000;i++)
  
      {
       
     a[i]=(long)i*(3*i-1)/2;
//  System.out.println(i+" "+a[i]);
      }
  
      for(int i=1;i<=10000;i++)
      
  {
       
     for(int j=i+1;j<=10000;j++)
   
         {
 
               for(int k=1;k<j;k++)
     
           {
              
      if(a[j]==(a[k]+a[i]))
             
       {
                
      System.out.println(a[i]+" "+a[k]+" "+a[j]);
        
               for(int l=1;l<j;l++)
  
                      {
        
                    if((a[k]-a[i])==a[l])
     
                           System.out.println("\t"+a[k]+" "+a[i]+" "+a[l]+" "+a[j]);
  
                      }
             
       }
        
    }


    
    }
    
 
   }

}

}