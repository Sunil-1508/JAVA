import java.util.Scanner;
public class simpleintrest {
 public static void main(String args[])
 {
	int p,t;
	float r;
	Scanner s=new Scanner(System.in);
	System.out.print("enter the amount");
	p=s.nextInt();
	System.out.print("enter the time in years");
	t=s.nextInt();
	System.out.print("enter the rate of intrest");
	r=s.nextFloat();
	System.out.print("simple intrest="+(p*t*r)/100);
 }
}
