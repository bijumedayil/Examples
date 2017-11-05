abstract class A
{
	void m1()   // concrete method
	{
		System.out.println("Inside A m1");
	}
	abstract void m2();

	abstract void m3();
	
};

class B extends A
{
	void m2()   // concrete method
	{
		System.out.println("Inside B m2");
	}
	void m3()
	{
/*		dfsd
			sdfgsdfsd
			sdgds*/
	}


};


class ManyAbstractMethodDemo 
{
	public static void main(String[] args) 
	{
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
//		b.fun();
		
/*		A a = new B();
		System.out.println("Val of a is " + a);
		a.m1();
		a.m2();
		a.m3();*/
//		a.fun();
/*		B b = (B)a;
		System.out.println("Val of b is " + b);
		b.m1();
		b.m2();
		b.m3();
		b.fun();*/

	}
}
