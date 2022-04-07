/*WriteaJavaprogramtoFindthesumofalleventermsintheFibonaccisequenceup
To the given range N.*/
import java.io.*;
public class Even_sum_in_Fib {
	public static void main(String args[])throws Exception {
		InputStreamReader isr= new InputStreamReader(System.in);
	    BufferedReader br= new BufferedReader(isr);
	   int N,a=0,c=0,b=1,s=0,t,i;
	   N=Integer.parseInt(br.readLine());
	   for(i=0;i<N;i++) {
		   a=a+b;
		  //if(a>N) break;
		   if(a%2==0) {
			   s+=a;
		   }
		   t=a;
		   a=b;
		   b=t;
	   }
	   System.out.print("sum="+s);
}
}