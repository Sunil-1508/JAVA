public class complexAdd {
int real,imag;
	public complexAdd(int x,int y) {
      real=x;
      imag=y;
	}
	public void show()
	{
		System.out.println(real+"+"+imag+"i");
	}
	public void add(complexAdd c1,complexAdd c2)
	{
	real=c1.real+c2.real;
	imag=c1.imag+c2.imag;
	}
	public complexAdd()
	{
		//real=0;
		//imag=0;
	}
	public static void main(String[] args) {
		complexAdd c1 =new complexAdd(10,20);
		complexAdd c2=new complexAdd(30,40);
		complexAdd c3=new complexAdd();
		c3.add(c1,c2);
		c1.show();
		c2.show();
		System.out.print("sum of two complex numbers is: ");
		c3.show();
	}

}
