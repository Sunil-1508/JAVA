import java.io.BufferedReader;
import java.io.InputStreamReader;
public class rainbow {
public static void main(String args[])throws Exception
{
	char a;
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br =new BufferedReader(isr);
	a=(char)(br.read());
	switch(a)
	{
	case 'r': System.out.println("Red"); break;
	case 'b': System.out.println("Blue"); break;
	case 'g': System.out.println("Green"); break;
	case 'i': System.out.println("Indigo"); break;
	case 'v': System.out.println("Violet"); break;
	case 'y': System.out.println("Yellow"); break;
	case 'o': System.out.println("Orange"); break;
	}

}	
}