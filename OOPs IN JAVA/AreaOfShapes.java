class areaShape {
	public void get()
	{	
	}
    public void area()
    {
    }
}
class square extends areaShape{
	int s;
	public  square(int s)
	{
		this.s=s;
	}
	public void area()
	{ 
		System.out.println("area of square is "+s*s);
	}
}
class rectangle  extends areaShape{
	int l,b;
	public  rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public  void area()
	{ 
		System.out.println("area of rectangle is "+l*b); 
	}}
class triangle extends areaShape{
		int b,h ;
		public  triangle( int b,int h)
		{
			this.b=b;
			this.h=h;
		}
	 public void area()
		{ 
			System.out.println("area of triangle is "+0.5*b*h);
		}
		}
public class AreaOfShapes {

	public static void main(String[] args) {
		areaShape a1=new square(5);
		a1.area();
		areaShape a2=new rectangle(20,3);
		a2.area();
		areaShape a3=new triangle(2,4);
		a3.area();

	}
}
