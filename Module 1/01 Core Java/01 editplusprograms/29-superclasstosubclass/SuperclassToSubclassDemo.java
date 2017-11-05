class A
{
	int x;
	int y;

	void m1()
	{
		System.out.println("inside m1");
	}
}

class B extends A
{
	int z;
	
	void m2()
	{
		System.out.println("inside m2");
	}
};


class SuperclassToSubclassDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A a = new B();
		a.x = 1;
		a.y = 2;
		a.z = 3;
		a.m2();
		a.m1();
		System.out.println("Value of a is ++++" + a);
		System.out.println("Value of x in A is " + a.x);
		System.out.println("Value of y in A is " + a.y);

	/*	B b = new B();
		b.x = 10;
		b.y = 20;
		b.z = 30;
		System.out.println("Value of b is ++++" + b);
		System.out.println("Value of x in B is " + b.x);
		System.out.println("Value of y in B is " + b.y);
		System.out.println("Value of z in B is " + b.z);
		b.m1();
		b.m2(); 
		b = a; */
	/*	System.out.println("Value of a is ******" + a);
		System.out.println("Value of x in A is " + a.x);
		System.out.println("Value of y in A is " + a.y);
		System.out.println("Value of z in  is " + a.z);
		a.m2(); */


		

//		A a = new B();


	}
}
