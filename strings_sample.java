import java.io.*;
public class strings_sample {
public static void main(String args[])throws Exception
{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	int v=0,c=0;
	String s;
	System.out.println("enter string");
	s=br.readLine();
	char ch[]=s.toCharArray();
	for(int i=0;i<s.length();i++)
	{
	if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
	v++;
	else c++;}
	System.out.print("vowles="+v+"\n"+"cosonents="+c);
	
	
	
	
}}
