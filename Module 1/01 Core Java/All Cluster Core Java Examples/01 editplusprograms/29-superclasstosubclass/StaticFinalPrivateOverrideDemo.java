class A
{
	int x = 10;
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
	int x = 20;
	 void fun()
	{
		System.out.println("Inside B fun()");
	}
};


class StaticFinalPrivateOverrideDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A a = new A();
		System.out.println("Valu of x in A is" +a.x);
		B b = new B();
		System.out.println("Valu of x in B is" +b.x);
		a = b;
		System.out.println("Valu of x in A is" +a.x);

	//	b.fun();
	//	a = b;
	//	a.fun();
		
		
	}
}
