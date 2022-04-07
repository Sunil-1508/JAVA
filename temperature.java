import java.io.*;
public class temperature {
public static void main(String args[])throws Exception
		{InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		float c;
		c=Float.parseFloat(br.readLine());
		if(c<0)System.out.println("Freezing wether");
		if(c>0&&c<=10)System.out.println("Very cold wether");
		if(c>10&&c<=20)System.out.println("Cold wether");
		if(c>20&&c<=30)System.out.println("Normal in Temp");
		if(c>30&&c<=40)System.out.println("It's hot");
		if(c>40)System.out.println("Very hot");
	
		}
}
