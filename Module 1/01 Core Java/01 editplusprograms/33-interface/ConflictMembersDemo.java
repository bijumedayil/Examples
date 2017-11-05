interface A
{
	int x = 10;
	void m1();
	void fun();
}
interface B
{
	int x = 20;
	void m2();
	void fun();
}

class Z implements A,B
{
	public void m1()
	{
		System.out.println("Inside Z m1");
		System.out.println("val of x in Z is " + A.x);
		System.out.println("val of x in Z is " + B.x);

	}
	public void fun()
	{
		System.out.println("Inside Z fun");
	}
	public void m2()
	{
		System.out.println("Inside Z m2");
	}
};


class ConflictMembersDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
/*		Z z = new Z();
		z.m1();
		z.m2();
		z.fun(); */
//		A a = new Z();
		
//		a.m1();
//		a.m2();
//		a.fun();
//		B b= new Z();
//		b.m1();
//		b.m2();
//		b.fun();
		A a = null;
		B b = null;
	/*	System.out.println("val of x in Demo class is " + A.x);
		System.out.println("val of y in Demo class is " + B.x);
		System.out.println("val of x in Demo class is " + a.x);
		System.out.println("val of y in Demo class is " + b.x);*/
		Z z = new Z();
		System.out.println("val of x in Demo with z is " + z.x);
//		System.out.println("val of y in Demo wiht z is " + z.y);
		System.out.println("val of x in Demo with z is " + Z.x);
//		System.out.println("val of y in Demo wiht z is " + Z.y);*/
		


	}
}
