
public class Box {
   int l,b,h;
	public Box() {
	l=1;
	
	b=4;
	h=8;
	}
	public Box(int x,int y,int z)
	{
		l=x;
		b=y;
		h=z;
	}
	public Box(Box b)
	{
		l=b.l;
		h=b.h;
		this.b=b.b;
		
	}
	public void show()
	{
		System.out.println(l*b*h);
	}
	public static void main(String[] args) {
		Box b1= new Box();
		Box b2=new Box(10,20,30);
		Box b3=new Box(b2);
		b1.show();
		b2.show();
		b3.show();

	}

}
