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
	int x;
	int y;

	Test(int a, int b)
	{
		x = a;
		y = b;
	}

	void fun()
	{
		System.out.println("Value of x is " + x);
		System.out.println("Value of y is " + y);
	}
}

class NullDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int a = 0;
		Box b  = null ;
		Test t = null;
		System.out.println("Value of b is " + b);
		b = new Box(5,6,7);
		System.out.println("Value of b is " + b);
		System.out.println("Value of w in b is " + b.w);
		System.out.println("Welcome!");
		System.out.println("End of main"); 
		
	/*	b = new Box(1,2,3);
		if (b != null)
		{
		System.out.println("Value of b is " + b);
		System.out.println("Value of w in b is " + b.w);
		} 
		Test t = null;
		System.out.println("Value of t is " + t);
		System.out.println("Value of x in t is " + t.x);
	
		System.out.println("Welcome!");
		System.out.println("End of main"); */

	}
}
