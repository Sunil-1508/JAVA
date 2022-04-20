//Three uses of final Keyword 
final class A4{
		
		 public void show()
		{
			System.out.println(" Class A show method");
		}
	}
	class B4 extends A4{//The type B4 cannot subclass the final class A4
		public B4()
		{
			System.out.println(" Class B constructor");
		}
	}
	class C4 {
		final void show(int x)
		{ 	 
			System.out.println(" Class C show method");
		}
	}
	class D4 extends C4 {
		public void show(int x)//Cannot override the final method from C4
		{ 	 
			System.out.println(" Class D show method");
		}
	}
public class Final {
	public static void main(String[] args) {
		
	final float pi=3.14f;
		 float pi=x;//Duplicate local variable pi (pi is a final variable)
	B4 b=new B4();
	C4 c=new C4();
		
	
	

}}
