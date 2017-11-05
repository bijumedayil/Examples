abstract class A
{
	void m1()   // concrete method
	{
		System.out.println("Inside A m1");
	}
	void m2() // concrete method
	{
		System.out.println("Inside A m2");
	}

	abstract void m3();
	
};

abstract class B extends A
{
	
	void m4()
	{
		System.out.println("Inside B m4");
	}
};

class AbstractClassDemo 
{
	public static void main(String[] args) 
	{
//		System.out.println("Hello World!");
//		A a = null; // declaring a ref variable of abstract class type
//		a = new A();
//		B b = null; // declaring a ref var of subclass data type
//		b = new B();
//		b.m1();
/*		b.m2(); 
		b.m3();
		b.m4();*/
/*		a = b;
		a.m1();
		a.m2();
		a.m3();*/
	//	a.m4(); 
/*		A a = new B();
		a.m1();
		a.m2();
		a.m3();*/
//		a.m4();
	}
}
