
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class season {
public static void main(String args[])throws Exception
{
	int a;
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br =new BufferedReader(isr);
	a=Integer.parseInt(br.readLine());
	if(a>=3 && a<=5) System.out.println("Summer");
	else if(a>=6 && a<=9) System.out.println("Rainy");
	else if((a==1)||(a==2)||(a>=10 && a<=12)) System.out.println("winter");
	else System.out.println("Invalid Month :)");
}}