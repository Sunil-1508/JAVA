/*2.1)
Write a Java program to select all the prime numbers within the range of 1to100.*/
import java.io.*;
public class prime {
public static void main(String args[])throws Exception {
	InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader b= new BufferedReader(isr);
   int i,j,c=0,s,e;
   s=Integer.parseInt(b.readLine());
   e=Integer.parseInt(b.readLine());
   for(i=s;i<=e;i++)
   {
	   for(j=2;j<=Math.sqrt(i);j++) {
		if(i%j==0) { c++; break;}
	   }
	   if(c==0) System.out.print(i+" ");
	   c=0;
   }
}
}
