class A1 {
	int x;
	public void setX(int p)
	{
		x=p;
	}
    public int getX()
    {
    	return x;
    }
}
 class B1 extends A1{
	int y;
	public void setY(int p)
	{
		y=p;
	}
    public int getY()
    {
    	return y;
    }
}
class C1 extends A1 {
	int z;
	public void setZ(int p)
	{
		z=p;
	}
    public int getZ()
    {
    	return z;
    }
}
public class hierarical {

	public static void main(String[] args) {
		B1 b=new B1();
		b.setX(100);
		System.out.println(b.getX());
		b.setY(200);
		System.out.println(b.getY());

		C1 c=new C1();
		c.setX(10);
		System.out.println(c.getX());
		c.setZ(30);
		System.out.println(c.getZ());
			

	}

}
