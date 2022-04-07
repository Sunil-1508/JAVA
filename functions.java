
public class functions {
	public void display()
	{
		System.out.println("hello good morning!");
	}
	public  static int show(int a)
	{
		return a*a;
		
	}
	public static void main(String args[])
	{
		functions obj=new functions();
		obj.display();
		int s=show(10);
		System.out.println("a*a="+s);
	}

}
