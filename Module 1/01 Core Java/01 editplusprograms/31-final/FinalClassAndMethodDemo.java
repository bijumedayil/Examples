 class A // stops inheritance
{
	final void m1() // stops overriding
	{
		System.out.println("Inside A m1");
	}

	void m2()
	{
		System.out.println("Inside A m2");
	}

}
class B extends A
{
	void m2()
	{
		System.out.println("Inside B m2");
	}

};


class FinalClassAndMethodDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		B b = new B();
		b.m1();
//		b.m2();
	}
}

