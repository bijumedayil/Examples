class A
{
	void m1()
	{
		final int i = 10;
	//	i ++;
		System.out.println("Val of i is " + i);
/*		int a = 5;
		int b = 8;
		i = a+b;
		i = 2;*/
		System.out.println("Val of i is " + i);
	}

	void m2(final int p)
	{
		System.out.println("Val of p is " + p);
	//	p++;
		System.out.println("Val of p is " + p);
		int a = 5;
		int b = 8;
	//	p = a+b;
		System.out.println("Val of p is " + p);
	}
};

class FinalLocalVariableDemo 
{
	public static void main(String[] args) 
	{
//		System.out.println("Hello World!");
		A a = new A();
		a.m2(5);
		a.m2(7);
//		a.m2

	}
}
