abstract class A
{
	static
	{
		System.out.println(" inside A static block");
	}

	{
		System.out.println(" inside A instance block");
	}

	A( )
	{
		System.out.println(" inside A constructor");
	}
static 	void m1()
	{
		System.out.println(" inside A m1");
	}
	void m2()
	{
		System.out.println("Inside A m2");
	}
};

class B extends A
{
	static
	{
		System.out.println(" inside B static block");
	}

	{
		System.out.println(" inside B instance block");
	}

	B()
	{
		
		System.out.println(" inside B constructor");
	}
	
};
class AbstractClassMembersDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
/*		A a = null;
		a = new A();*/
	//	a.m1();
	//	a.m2();
	/*	B b = new B();
		b.m1();
		b.m2();*/
	/*	A a = new B();
		a.m1();
		a.m2();*/
//		A a = new A();
		A.m1();
		B b = new B();

	}
}
