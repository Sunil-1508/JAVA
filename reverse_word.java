import java.io.*;
	import java.io.InputStreamReader;
	public class reverse_word{
			public static void main(String args[])throws Exception
			{
				InputStreamReader isr=new InputStreamReader(System.in);
				BufferedReader br=new BufferedReader(isr);
				int S=0,k=0;
				String s,s2="";
				char t;
				System.out.println("enter string");
				s=br.readLine();
				StringBuffer b=new StringBuffer(s);
				System.out.println(b);
				b.append(" kumar");
				String b2="sun is to hot";
				String words[]=b2.split(" ");
				System.out.println(words[3]);
					
					
				
				
				
}}

