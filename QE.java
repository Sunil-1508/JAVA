import java.io.*;
public class QE {
public static void main(String args[])throws Exception
{
	int a,b,c;
	double d,r1,r2;
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br =new BufferedReader(isr);
	a=Integer.parseInt(br.readLine());
	b=Integer.parseInt(br.readLine());
	c=Integer.parseInt(br.readLine());
	d=b*b-(4*a*c);
	if(d<0) {
		double real=-b/(2*a);
		double imaginary=Math.sqrt(-d)/(2*a);
		
		System.out.println("imaginary roots");
		System.out.printf("r1=%.2f+%.2fi\nr2=%.2f-%.2fi",real,imaginary,real,imaginary);
	}
	else if(d==0) {
		System.out.println("Equal roots");
		r1=-b/(2*a);
		r2=r1;
		System.out.println("r1="+r1+" "+"r2="+r2);
	}
	else {
		System.out.println("Distinct roots");
		r1=(-b+Math.sqrt(d))/(2*a);
		r2=(-b-Math.sqrt(d))/(2*a);
		System.out.println("r1="+r1+" "+"r2="+r2);
	}
}
}
