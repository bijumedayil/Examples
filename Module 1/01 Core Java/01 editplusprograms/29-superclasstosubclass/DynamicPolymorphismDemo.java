class A
{
	void m1()
	{
		System.out.println("Inside A m1()");
	}
	void fun()
	{
		System.out.println("Inside A fun()");
	}
};

class B extends A
{
	void m2()
	{
		System.out.println("Inside B m2()");
	}
	void fun()
	{
		System.out.println("Inside B fun()");
	}
};


class C extends A
{
	void m3()
	{
		System.out.println("Inside C m3()");
	}
	void fun()
	{
		System.out.println("Inside C fun()");
	}
};

class  DynamicPolymorphismDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A a = new A();
		System.out.println("Val of a is" + a);
/*		a.m1();
		a.fun();
//		a.m2(); */

		B b = new B();
		System.out.println("Val of b is" + b);
	/*	b.m1();
		b.m2();
		b.fun(); */

		C c = new C();
		System.out.println("Val of c is" + c);
	/*	c.m1();
		c.m3();
		c.fun(); */

		A z = null;
		z = a;
		System.out.println("Val of z is when a assign" + z);
		z.fun();
		z = b;
		System.out.println("Val of z is when b assign" + z);
		z.fun();
		z = c;
		System.out.println("Val of z is when b assign" + z);
		z.fun();



	//	b = a;
		



	}
}
