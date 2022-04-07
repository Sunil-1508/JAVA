 import java.io.BufferedReader;
import java.io.InputStreamReader;
public class deserium_num {
public static void main(String args[])throws Exception
{
	int a,d,s=0;
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br =new BufferedReader(isr);
	a=Integer.parseInt(br.readLine());
	int t=a;
	d=(int)Math.log10(a)+1;
	while(a!=0)  
	{
	s+=(int)Math.pow(a%10,d);
	d--;
	a/=10;
	}
	if(t==s) System.out.print("True");
	else System.out.print("False");
}}