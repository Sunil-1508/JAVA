import java.io.*;

class number{
	BufferedReader b=new BufferedReader(new InputStreamReader(System.in)); 
    int n;
	public void GetNo()throws Exception {
		System.out.println("enter number ");
		n=Integer.parseInt(b.readLine());
		}
	public void show ()
	{
		System.out.println("decimal ="+n);
	}
}
class Hexa extends number{
	
	public void show()
	{     super.show();
		System.out.println("Hexa number ="+Integer.toHexString(n));
	}
}
class Octal extends number{
	
	public void show()
	{     super.show();
		System.out.println("Octal number ="+Integer.toOctalString(n));
	}
}
public class SuperDemo {
	public static void main(String[] args)throws Exception {
	Hexa obj1=new Hexa();
	obj1.GetNo();
	obj1.show();
	Octal obj2=new Octal();
	obj2.GetNo();
	obj2.show();
	
	}
}
