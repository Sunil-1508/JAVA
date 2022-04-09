import java.io.*;
public class Area_Volume {
int l,b,h;
public Area_Volume(int l,int k) throws Exception //Constructor
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter length,Breadth,Height of the box");
	//l=Integer.parseInt(br.readLine());
	this.l=l;									//this pointer 
	//b=Integer.parseInt(br.readLine());
	b=k;										//parameterized constructor
	h=Integer.parseInt(br.readLine());
}
public int area()
{
	return 2*(l*b+b*h+h*l);
}
public int volume()
{
	return l*b*h;
}
public static void main(String args[])throws Exception
{
	Area_Volume b=new Area_Volume(3,4);
    //b.get();
    System.out.println("Area "+b.area());
    System.out.println("Volume "+b.volume());
   // Area_Volume b2=new Area_Volume(b);copyconstructor
    
}
}
