class A
{
	int x;

	void m1()
	{
		System.out.println("Inside m1 of A");
		System.out.println("Value of x is" + x);
	}
};

class B extends A
{
	int x;

	B(int p, int q)
	{
		x = p;
		super.x = q;
	}

	void fun(int p, int q)
	{
		x = p;
		super.x = q;
	}
	void m2()
	{
		System.out.println("Inside m2 of A");
		System.out.println("Value of x in A is" + super.x);
		System.out.println("Value of x is" + x);
	}
};
class SuperVariableDemo 
{
	public static void main(String[] args) 
	{
/*		A a1 = null; //super class refrence variable
		a1 = new A();
		a1.x = 10;
		System.out.println("Value of a1 is" + a1);
		System.out.println("Value of x in a1 is" + a1.x);
		a1.m1(); */

		B b1 = null; //super class refrence variable
		b1 = new B(5,6);
//		b1.fun(5,6);
	//	b1.x = 5;
	//	b1.x = 6; // overwrite 
	//	super.x = 6; // Demo doesnt super class
	//	b1.super.x = 6; // wrong syntax
		System.out.println("Value of b1 is" + b1);
		System.out.println("Value of x in b1 is" + b1.x);
		System.out.println("Value of x in b1 is" + b1.x);
		b1.m1();
		b1.m2();
		

	}
}
