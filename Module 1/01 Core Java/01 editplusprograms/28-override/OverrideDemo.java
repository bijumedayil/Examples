class A
{
	void m1()
	{
		System.out.println("inside m1 of A");
	}
	void m2()
	{
		System.out.println("inside m2 of A");
	}
}

class B extends A
{
	void m1(int a) // new similar logic --- overload
	{
		System.out.println("inside overloaded m1 of B");
	}
	
	void m2() // new add or change logic ---- override
	{
	//	super.m2();
		System.out.println("inside m2 of B");
	}
	void m3() // completely new logic ---- new method
	{
		System.out.println("inside m3 of b");
	}
};

class C extends B
{
/*	void m3() 
	{
		System.out.println("inside overirde m3 of c");
	} */
	
/*	void m1() 
	{
		
		System.out.println("inside m1 of C");
	}  */
	void m2() 
	{
	//	A a = new A();
	//	a.m2();
	super.m2();

	//	System.out.println("inside m2 of C");
	}

	void m4() 
	{
		System.out.println("inside m4of C");
	}  
	void m1(int a, int b) 
	{
		System.out.println("inside m1 overloaded  of C");
	} 

/*	void m1(int a) 
	{
		System.out.println("inside m1 overridden of C");
	} */

};
class OverrideDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
//		A a = new A();
//		a.m1();
//		a.m2();
//		B b = new B();
//		b.m1();
//		b.m2();
	//	System.out.println("Hello World!");
	//	b.m3();

		C c = new C();
		c.m1();
		c.m2();
		c.m3();
	//	c.m4();
	//	c.m1(5);
	//	c.m1(10,20);
//		c.fun();
	
	}
}
