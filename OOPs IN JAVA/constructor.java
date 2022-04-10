
public class constructor {
int x,y;
	public constructor()
	{
		x=100;
	}
	public constructor(int y) {
	x=y;
	}
	public constructor(constructor s)
	{
		x=s.x;
	}
public void show() {
	System.out.println(x);
}
	public static void main(String[] args) {
		constructor c1=new constructor();
		constructor c2=new constructor(200);
		constructor c3=new constructor(c2);
		c1.show();
		c2.show();
		c3.show();
	}

}
