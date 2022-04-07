
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class sum_of_num {
public static void main(String args[])throws Exception {
	InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader b= new BufferedReader(isr);
   int i,x[],e[],o[],n,k=0,j=0;
   n=Integer.parseInt(b.readLine());
   x=new int[n];
   e=new int[n];
   o=new int[n];
   System.out.println("enter the "+n+"elements");
   for(i=0;i<n;i++)
   {
	   x[i]=Integer.parseInt(b.readLine());
	   if(x[i]%2==0) { e[j]=x[i]; j++;}
	   else { o[k]=x[i]; k++;}
	   
   }
   System.out.println("elements in the  array is ");
   for(int ele1:x) 
	   System.out.println(ele1);
   System.out.println("elements in the even array is ");
   for(int ele2:e) 
	   if(ele2!=0) System.out.println(ele2);
   System.out.println("elements in the odd array is ");
   for(int ele3:o) 
	  if(ele3!=0) System.out.println(ele3);
 
   
}}
