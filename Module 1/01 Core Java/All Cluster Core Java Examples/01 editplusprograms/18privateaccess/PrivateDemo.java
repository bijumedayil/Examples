class Box
{
	int w;
	int h;
	int d;

	Box(int x,int y, int z)
	{
		w = x;
		h = y;
		d = z;
	}
	int volume()
	{
		int l = 0;
		l = w*h*d;
		return l;
	}
};

class Test
{
	private int x = 5;

	private Test(int a)
	{
		x = a;
	}

	void fun()
	{
		System.out.println("Value of x in is " + x);
	}
	
	private void m1()
	{
		System.out.println("inside m1");
	}

	void m2()
	{
		m1();
		System.out.println("inside m2");
	}

}

class PrivateDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Test t1;
		t1 = new Test(5);
		t1.fun();
		t1.m2();
		
//		System.out.println("Value of a frrom t1 is " + a);
	//	System.out.println("Value of x in t1 is " + t1.x);
	//	t1.x = 5;
		

		Test t2;
		t2 = new Test(10);
		t2.fun();
		t2.m2();
//		System.out.println("Value of a frrom t2 is " + a);
//		System.out.println("Value of x in t2 is " + t2.x);
//		t2.x = 10;
//		System.out.println("Value of x in t2 is " + t2.x);



	}
}
