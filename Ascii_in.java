import java.io.*;
public class Ascii_in {
	public static void main(String args[])throws Exception
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int U=0,L=0,S=0,D=0;
		String s;
		System.out.println("enter string");
		s=br.readLine();
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(Character.isUpperCase(ch[i])) U++;
			else if(Character.isLowerCase(ch[i])) L++;
			else if(Character.isDigit(ch[i])) D++;
			else S++;
		}
		System.out.println("Lower case="+L);
		System.out.println("Upper case="+U);
		System.out.println("Digits="+D);
		System.out.println("Symbols="+S);
	    if(L==U&&U==D&&D==S) System.out.println("Equal String");
	    else System.out.println("Not An Equal String");
}
}
