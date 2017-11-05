interface A
{
	void m1();
	void m2();
	void m3();
}

class B implements A
{
	public void m1()
	{
		System.out.println("Inside m1");
	}
	public void m2()
	{
		System.out.println("Inside m2");
	}
	public void m3()
	{
	}
	public void fun()
	{
		System.out.println("Inside B fun");
	}
}
/*
class C extends B
{
	public void m3()
	{
		System.out.println("Inside m3 C");
	}
	void test()
	{
		System.out.println("Inside C test");
	}
}; */

class InterfaceDemo
{
	public static void main(String args[])
	{
		System.out.println("Hello World");
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
		b.fun();
/*		A a = null;// declaring a reference variable of interface type
	//	a = new A();
		B b = null;

	//	b = new B();
		C c = null;
		c = new C();
		c.m1();
		c.m2();
		c.m3();
		c.fun();
		c.test();
		b = c;
		b.m1();
		b.m2();
		b.m3();
		b.fun();
//		b.test();
		a = c;
		a.m1();
		a.m2();
		a.m3();
//		a.fun();
//		a.test();
		A a1 = new C();
		B b1 = new C();*/
		
	



	}
};