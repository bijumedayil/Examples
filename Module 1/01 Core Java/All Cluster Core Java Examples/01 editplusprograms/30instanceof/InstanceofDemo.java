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
class D extends A
{
	void m4()
	{
		System.out.println("Inside D m4");
	}
}

class InstanceofDemo 
{
	public static void main(String[] args) 
	{
	//	System.out.println("Hello World!");
//		A a = new A();
//		A a = null;
		A a = null;
		
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

		else if (a instanceof D)
		{
			System.out.println("a is referring to D object");
			D d = (D)a;
			System.out.println("Value of d is " + d);
			d.m1();
			d.m4();
		}
		else
		{
			System.out.println("a is not referring to any object");
		}
		
		
/*		a.m1();
		System.out.println("Value of a is " + a);

		B b = (B)a;
		System.out.println("Value of b is " + b);
		b.m1();
		b.m2(); */
		

/*		boolean z = a instanceof B;
		System.out.println("Value  of z is " + z);

		if (a instanceof B)
		{
			System.out.println("a is referring to A object");
		}
		else
		{
			System.out.println("a is not refg ++++ to A object");
		} */
	}
}
