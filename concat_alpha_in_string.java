	import java.io.BufferedReader;
import java.io.InputStreamReader;
public class concat_alpha_in_string {
		public static void main(String args[])throws Exception
		{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			int S=0;
			String s,s2="";
			System.out.println("enter string");
			s=br.readLine();
			char ch[]=s.toCharArray();
			for(int i=0;i<s.length();i++) {
				if(Character.isLetter(ch[i])) s2=s2+ch[i];
				if(Character.isDigit(ch[i])) S=S+Integer.parseInt(ch[i]+"");//or sum =sum+ (ch[i]-48)
				
}
			System.out.println("concat of letters in string is "+s2);
			System.out.println("sum of digits in string is "+S);
		}}
