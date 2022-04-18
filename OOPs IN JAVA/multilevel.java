
class A {
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
 class B extends A{
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
class C extends B {
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
public class multilevel{
	public static void main(String[] args) {
		C obj=new C();
		obj.setX(10);
		System.out.println(obj.getX());
		obj.setY(20);
		System.out.println(obj.getY());
		obj.setZ(30);
		System.out.println(obj.getZ());
		
	}}
	
		