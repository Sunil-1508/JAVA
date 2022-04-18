class  AA
{
	public void show()
	{
		System.out.println("parent show method");
	}
	public void diaplay()
	{
		System.out.println("parent display method");
		
	}
}
class  BB extends AA
{
	public void show()
	{ super.show();
		System.out.println("Child show method");
	}
	public void msg()
	{
		System.out.println("child msg method");
	}
	
}
public class Method_overriding {
	public static void main(String args[]) {
	BB b= new BB();
	b.show();
	}
}