class A
{
	 private int x, y;
	A()
	{
		System.out.println("inside A 1st const");
	}
	A(int x, int y)
	{
		System.out.println("inside A 2nd const");
		this.x = x;
		this.y = y;
	}
	void m1()
	{
		System.out.println("inside m1");
		System.out.println("Value of x & y is" + x + y);
	}
}

class B extends A
{
	private int z;
	B(int x,int y,int z)
	{
		super(x,y);
	//	super.x = x;
	//	super.y = y;
		this.z = z;
	}

	void m2()
	{
		System.out.println("inside m2");
		super.m1();
		System.out.println("Value of z is" +z);
	}

};

class SuperConstructorDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		B b = new B(5,6,7);
	//	b.m1();
		b.m2();
	//	A a  = new A(10,20);
	//	a.m1();
//		b.x = 5;
//		b.y = 6;
//		b.z = 7;
//		System.out.println("Value of x is " + b.x);
//		System.out.println("Value of y is " + b.y);
//		System.out.println("Value of z is " + b.z);


//		A a = new A(1,2);
//		System.out.println("Value of x is " + a.x);
//		System.out.println("Value of x is " + a.y);
//		a.showxy();
//		a.m1();
//		a.x = 5;
//		a.y = 6;
	}
}
