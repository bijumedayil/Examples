class A
{
	static 
	{
		System.out.println("Inside A static block");
	}

	{
		System.out.println("Inside A instance block");
	}
	A()
	{
		System.out.println("Inside A constructor");
	}

	void m1()
	{
		System.out.println("Inside A m1()");
	}
};


class B extends A
{
	static 
	{
		System.out.println("Inside B static block");
	}

	{
		System.out.println("Inside B instance block");
	}
	B()
	{
		System.out.println("Inside B constructor");
	}

	void m2()
	{
		System.out.println("Inside B m2()");
	}
};

class SubclassObjectDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A a = new A();
		a.m1();
		B b = new B();
		b.m1();
	}
}


