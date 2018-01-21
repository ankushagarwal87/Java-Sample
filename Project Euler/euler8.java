import java.io.*;
 class euler8 {

   
    public static void main(String[] args)throws IOException {
byte b[]=new byte[1038];
int k,i;
FileInputStream j=new FileInputStream("a.txt");
System.out.println(j.read(b));
k=(b[0]-48)*(b[1]-48)*(b[2]-48)*(b[3]-48)*(b[4]-48);
for(i=1;i<b.length-4;i++)
{
if(b[i]>47 && b[i+1]>47 && b[i+2]>47 && b[i+3]>47 && b[i+4]>47){
int l=(b[i]-48)*(b[i+1]-48)*(b[i+2]-48)*(b[i+3]-48)*(b[i+4]-48);
if(l>k)
{k=l;System.out.println(i+" "+k+" "+(b[i+0]-48)+" "+(b[i+1]-48)+" "+(b[i+2]-48)+" "+(b[i+3]-48)+" "+(b[i+4]-48));}
}}
System.out.println(k+" "+i);
}}