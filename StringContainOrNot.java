import java.io.*;
public class StringContainOrNot {
	public static void main(String args[])throws Exception
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int w=0,c=0;
		String s1,s2;
		System.out.println("enter string 1");
		s1=br.readLine(); 
		System.out.println("enter string 2");
		s2=br.readLine(); 
		
		if(s1.contains(s2)) System.out.println("yes");
		else System.out.println("no");

}}
