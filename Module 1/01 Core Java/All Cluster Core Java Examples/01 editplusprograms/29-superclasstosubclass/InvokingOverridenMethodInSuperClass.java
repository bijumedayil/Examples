class A
{
	void m1()
	{
		System.out.println("Inside A m1()");
		fun();
		
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
		fun();
	}
	void fun()
	{
		System.out.println("Inside B fun()");
	}
};

class InvokingOverridenMethodInSuperClass
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A a = new B();
		a.m1();
//		a.fun();
		B b = new B();
		b.m1();
//		b.m2();
//		b.fun();
	}
}
