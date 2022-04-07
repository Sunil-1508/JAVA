
public class bufferString_functions {
	public static void main(String args[])throws Exception
	{
		StringBuffer s1=new StringBuffer();
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		s1.append("abcdefghijklmnopq");
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		StringBuffer s2=new StringBuffer("Welcome");

		

}}
