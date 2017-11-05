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
	
}

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

class Hello
{
	void m1()
	{
		System.out.println("inside m1");
	}
	void m2(int a)
	{
		System.out.println("inside m1");
		System.out.println("Value of a is " + a);
	}
	Box m7(Box z)
	{
		System.out.println("Value of z is *****" + z);
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

	Box m8()
	{
		int i = 11;
		int j = 12;
		int k = 13;
		Box b = new Box(i,j,k);
		System.out.println("Value of b is***** " + b);
		System.out.println("Value of w in b is " + b.w);
		System.out.println("Value of h in b is " + b.h);
		System.out.println("Value of d in b is " + b.d);
		return b;
	
	}
	int[] m9(Test p,Box q, boolean s)
	{
		System.out.println("Value of b in m9() is***** " + q);
		System.out.println("Value of w in q in m9() " + q.w);
		System.out.println("Value of h in q in m9() " + q.h);
		System.out.println("Value of d in q in m9() " + q.d);

		System.out.println("Value of p in m9() is***** " + p);
		System.out.println("Value of x in p in m9() " + p.x);
		System.out.println("Value of y in p in m9() " + p.y);

		System.out.println("Value of boolean s in m9 is " + s);
		int a[] = {1,2,3};
		return a;

	}

	void m10(int a[])
	{
		for (int x:a )
		{
			System.out.println("Value of a is " + a);

		}
	}

};

class DiffDataArgAndParamDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Hello h = new Hello();
//		int res[] =h.m9(new Test(1,2),new Box(5,6,7), true);

	/*	for (int x:res )
		{
			System.out.println("Value of x is " + x);

		} */
		int a[] = {100,101,102};
		h.m10();
		

		
		
		
	}
}
