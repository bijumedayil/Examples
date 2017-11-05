class A
{
	int x;
};

class B extends A
{
	int x;

	void m1()
	{
	//	int x = 5;
		System.out.println("inside m1");
		System.out.println("Val of local x" + x);
		System.out.println("Val of super class x" + super.x);
	}
	void fun(int x)
	{
		super.x = x;
		this.x = x;
		System.out.println("inside m1");
		System.out.println("Val of local x" + this.x);
		System.out.println("Val of super class x" + super.x);
	}
};

class LocalandSuperclassInstanceDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		B b = new B();
//		b.x = 1;
//		System.out.println("Val of x in b is" + b.x);
		b.fun(2);

		b.m1();

	}
}
