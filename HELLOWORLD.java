import java.io.*;
public class HELLOWORLD {
	public static void main(String[] args)throws Exception
	{
		int r1,r2,r3,r4,r5;
		 int sum=0;
		 float avg;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
			r1=Integer.parseInt(br.readLine());
			r2=Integer.parseInt(br.readLine());
			r3=Integer.parseInt(br.readLine());
			r4=Integer.parseInt(br.readLine());
			r5=Integer.parseInt(br.readLine());
		
		avg=(r1+r2+r3+r4+r5)/5;
			if(r1>avg)
				System.out.println(r1);
			if(r2>avg)
				System.out.println(r2);
			if(r3>avg)
				System.out.println(r3);
			if(r4>avg)
				System.out.println(r4);
			if(r5>avg)
				System.out.println(r5);

		
	  
	  
	}
}
