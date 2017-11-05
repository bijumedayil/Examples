class Box
{
	 int w, h, d;

	Box(int w, int h, int d)
	{
		this.w = w;
		this.h = h;
		this.d = d;
	}
	void fun()
	{
		System.out.println("inside Box fun");
	}
	int volume()
	{
		int z = 0;
		z = w*h*d;
		return z;
	}
}

class Boxweight extends Box
{
	 int m;

	Boxweight(int w, int h, int d, int m)
	{
		super(w,h,d);
		this.m = m;
	}
	void meth()
	{
		System.out.println("inside Boxweight meth");
	}
}


class A
{
	void m1()
	{
		System.out.println("Inside A m1");
	}
}

class B extends A
{
	void m2()
	{
		System.out.println("Inside B m2");
	}
}
class C extends A
{
	void m3()
	{
		System.out.println("Inside C m3");
	}
}


class Hello
{
	void m1(Boxweight z)
	{
		System.out.println("Value of z is " + z);
		System.out.println("Value of w in z is " + z.w);
		System.out.println("Value of h in z is " + z.h);
		System.out.println("Value of d in z is " + z.d);
		System.out.println("Value of m in z is " + z.m);
		z.fun();
		z.meth();
	}

	Box m2()
	{
		Box z = new Boxweight(1,2,3,4);
		//Boxweight z = new Boxweight(1,2,3,4);
		System.out.println("Value of z is " + z);
		System.out.println("Value of w in z is " + z.w);
		System.out.println("Value of h in z is " + z.h);
		System.out.println("Value of d in z is " + z.d);
//		System.out.println("Value of m in z is " + z.m);
		z.fun();
//		z.meth();
		return  z;
	}

	void m3(A a)
	{
		
		if (a instanceof B)
		{
			System.out.println("a is referring to B object");
			B b = (B)a;
			System.out.println("Value of b is " + b);
			b.m1();
			b.m2();
		}
		else if (a instanceof C)
		{
			System.out.println("a is referring to C object");
			C c = (C)a;
			System.out.println("Value of c is " + c);
			c.m1();
			c.m3();
		}

		
		else
		{
			System.out.println("a is not referring to any object");
		}
		

	}

};

class  SubclassArgumentAndReturnTypeDemo
{
	public static void main(String[] args) 
	{
//		System.out.println("Hello World!");
		Hello h = new Hello();
	//	Boxweight bw = null;
//		Box bw  = h.m2();
	//	Boxweight bw  = h.m2();
//		System.out.println("Value of bw is " + bw);
//		System.out.println("Value of w in bw is " + bw.w);
//		System.out.println("Value of h in bw is " + bw.h);
//		System.out.println("Value of d in bw is " + bw.d);
	//	System.out.println("Value of m in bw is " + bw.m);
//		bw.fun();
	//	bw.meth();
		
//		h.m1(bw);

		A a = new C();
		h.m3(a);

	}
}
