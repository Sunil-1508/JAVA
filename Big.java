import java.io.*;
public class Big {
public static void main(String args[])throws Exception{
	InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader br= new BufferedReader(isr);
    int a,b;
    a=Integer.parseInt(br.readLine());
    b=Integer.parseInt(br.readLine());
    if(a>b) System.out.println(a+" is big");
    else System.out.println(b+" is big");
}
}
