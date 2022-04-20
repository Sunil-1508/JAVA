
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Number{
	BufferedReader b=new BufferedReader(new InputStreamReader(System.in)); 
    int n;
	public void GetNo()throws Exception {
		System.out.print("enter number : ");
		n=Integer.parseInt(b.readLine());
		}
	public void show ()
	{
		System.out.println("decimal ="+n);
	}
}
class Hexa1 extends Number{
	
	public void show()
	{     super.show();
		System.out.println("Hexa number ="+Integer.toHexString(n));
	}
}
class Octal1 extends Number{
	
	public void show()
	{     super.show();
		System.out.println("Octal number ="+Integer.toOctalString(n));
	}
}

public class DMD1 {
	public static  void display(Number n)throws Exception
	{
		if(n instanceof Hexa1)
		{
		 System.out.println("Hexa class instance");	
		}
		if(n instanceof Octal1)
		{
			System.out.println("Octal class instance");
		}
		n.GetNo();
		n.show();
	}
	public static void main(String[] args)throws Exception {
	display(new Hexa1());
	System.out.println("\n");
	display(new Octal1());
	
	}
}

