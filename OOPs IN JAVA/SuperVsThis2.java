
class sample1{
	public sample1()
	{   
		System.out.println("Good morning ");		//							6
		
	}
	public sample1(String name)
	{   this();	//call the default  constructor of sample1							5
		System.out.println("Good morning "+name);
	}
	public sample1 (String s1,String s2)
	{ 	this("Sunil");  //call the single parametarized  constructor of sample1					4
		System.out.println("Good morning "+ s1 +" and "+s2);
	}
}
class sample2 extends sample{
	public sample2()
	{   super("Ramu","Balaji");//call the double parameterized constructor of sample1				3
		System.out.println("\nGood Afternoon ");		//						7
	}
	public sample2(String name)
	{   this();	//call the default constructor of sample2							2
		System.out.println("Good Afternoon "+name);		//						8
	}
	public sample2(String s1,String s2)
	{   this("sunil");//call the single parameterized parent constructor of sample2					1
		System.out.println("Good Afternoon "+ s1 +" and "+s2);	//						9				
	}
}
public class SuperVsThis2 {
	public static void main(String[] args) {
		sample2 s = new sample2("ramu","Balaji");
	}
}

