import java.io.*;
public class word_number {
public static void main(String args[])throws Exception
{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	int w=0,c=0;
	String s;
	System.out.println("enter string");
	s=br.readLine();
	char ch[]=s.toCharArray();
	for(int i=0;i<s.length();i++)
	{c++;
		if(ch[i]==' ') { w++;
		
		System.out.println(w+" "+(c-1));
		c=0;}	
	}
	System.out.println(w+1+" "+(c));
}
}
//String w[]=s.split(' ');