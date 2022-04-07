import java.io.*;
public class BestHero {
public static void main(String args[])throws Exception
{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	int h1,a1,f1,h2,a2,f2,s1,s2;
	String hero1,hero2;
	System.out.println("enter hero 1 details");
	hero1=br.readLine();
	h1=Integer.parseInt(br.readLine());
	a1=Integer.parseInt(br.readLine());
	f1=Integer.parseInt(br.readLine());
	s1=(h1*10)+(a1*5)+(f1*(-5));
	System.out.println("enter hero 2 details");
	hero2=br.readLine();
	h2=Integer.parseInt(br.readLine());
	a2=Integer.parseInt(br.readLine());
	f2=Integer.parseInt(br.readLine());
	s2=(h2*10)+(a2*5)+(f2*(-5));
	if(s1>s2) System.out.println(hero1+" is best With score "+s1);
	else System.out.println(hero2+" is best With score "+s2);
}
}
