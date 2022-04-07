
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class prime_between {
public static void main(String args[])throws Exception
{
	int a,c=0,i,j;
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br =new BufferedReader(isr);
	a=Integer.parseInt(br.readLine());
	for(i=2;i<=a;i++)
	{c=0;
			for( j=2;j*j<=a;j++)
		{
	         if(i%j==0) { c=1;	 break;}	
		}if(c==0) { System.out.print(i+" "); }
			}
	
	}
}