class Box
{
	int w;
	int h;
	int d;

	Box(int x, int y, int z)
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
	int x,y;

	Test(int p, int q)
	{
		x = p;
		y = q;
	}

	void m1()
	{
		System.out.println("Value of x & y is " + x + y);
	}

};

class  CallByReferenceDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
	/*	Box b1 = null;
		int i = 10;
		int j = 20;
		int k = 30;
		b = new Box (i,j,k);
		System.out.println("Value of b is " + b);
		System.out.println("Value of w in b is " + b.w);
		System.out.println("Value of h in b is " + b.h);
		System.out.println("Value of d in b is " + b.d);
		
		b1 = m1(b);
		System.out.println("Value of b is " + b);
		
		System.out.println("Value of w in b is " + b.w);
		System.out.println("Value of h in b is " + b.h);
		System.out.println("Value of d in b is " + b.d);

		System.out.println("Value of w in b1 is++++ " + b1.w);
		System.out.println("Value of h in b1 is++++ " + b1.h);
		System.out.println("Value of d in b1 is++++ " + b1.d);*/
		
		Box b = null;
		b = m3();
		System.out.println("Value of b is " + b);
		System.out.println("Value of w in b after m3" + b.w);
		System.out.println("Value of h in b after m3 " + b.h);
		System.out.println("Value of d in b after m3 " + b.d);

	/*	Test t = new Test(10,20);
		System.out.println("Value of t is " + t);
		System.out.println("Value of x in t is " + t.x);
		System.out.println("Value of y in t is " + t.y);
		m2(t);
		System.out.println("Value of x in t after m2 is " + t.x);
		System.out.println("Value of y in t after m2 is " + t.y); */


	}

	static Box m1(Box z)
	{
		System.out.println("Value of z is " + z);
		System.out.println("Value of w in z is " + z.w);
		System.out.println("Value of h in z is " + z.h);
		System.out.println("Value of d in z is " + z.d);
		z.w *= 2;
		z.h *= 2;
		z.d *= 2;
		System.out.println("Value of w in z is " + z.w);
		System.out.println("Value of h in z is " + z.h);
		System.out.println("Value of d in z is " + z.d);
		return z;

	}

	static void m2(Test p)
	{
		System.out.println("Value of p is " + p);
		System.out.println("Value of x in p is " + p.x);
		System.out.println("Value of y in p is " + p.y);
		
		p.x = 11;
		p.y = 22;
		
		System.out.println("Value of x in p is " + p.x);
		System.out.println("Value of y in p is " + p.y);

	}

		static Box m3()
		{
			int p = 9;
			int q = 9;
			int r = 9;

			Box m = new Box(p,q,r);
			System.out.println("Value of m is " + m);
			System.out.println("Value of w in m is " + m.w);
			System.out.println("Value of h in m is " + m.h);
			System.out.println("Value of d in m is " + m.d);
			return m;
	}


}
