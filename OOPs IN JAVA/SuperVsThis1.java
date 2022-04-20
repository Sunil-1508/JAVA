
class sample{
	public sample()
	{   
		System.out.println("Good morning ");
	}
	public sample(String name)
	{   this();	//call the default constructor
		System.out.println("Good morning "+name);
	}
	public sample (String s1,String s2)
	{ 	this("Sunil");  //call the single parametarised constructor
		System.out.println("Good morning "+ s1 +" and "+s2);
	}
}
public class SuperVsThis1 {
	public static void main(String[] args) {
		sample s = new sample("ramu","Balaji");
	}
}
