class A
{
	final static void m1()
	{
		System.out.println("Inside static A m1 method");
	}
};

class B extends A
{
	final static void m1()
	{
		System.out.println("Inside static B m1 method");
	}
};

class StaticFinalMethodDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	/*	A a = new A();
		a. m1();
		B b = new B();
		b.m1();*/
		A a = new B();
		a.m1();


	}
}
