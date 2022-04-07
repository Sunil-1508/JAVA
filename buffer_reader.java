import java.io.*;
public class buffer_reader {
public static void main(String args[])throws Exception
{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader b=new BufferedReader(isr);
	int r1,r2,i1,i2;
	r1=Integer.parseInt(b.readLine());
	i1=Integer.parseInt(b.readLine());
	System.out.println((r1)+"+"+(i1)+"i");
	r2=Integer.parseInt(b.readLine());
	i2=Integer.parseInt(b.readLine());
	System.out.println((r2)+"+"+(i2)+"i");
	System.out.println("sum="+(r1+r2)+"+"+(i1+i2)+"i");
}
}
