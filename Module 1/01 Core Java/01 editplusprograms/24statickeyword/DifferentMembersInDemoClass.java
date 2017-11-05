class DifferentMembersInDemoClass 
{
	static int a = 5;
	static int b;
	int c;

	static
	{
		System.out.println("inside static block");
		System.out.println("inside static block " + a);
		System.out.println("inside static block " + b);
		b = a * 2;
		System.out.println("inside static block " + a);
		System.out.println("inside static block " + b);
	}

	 static void m1(int x)
	{
		System.out.println("inside static m1()");
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
		System.out.println("Value of x is " + x);
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
				m1(55);

		DifferentMembersInDemoClass d = new DifferentMembersInDemoClass();
		d.c = 3;
		System.out.println("Value of c is " + d.c);

//		this.c = 5;
	//	this 

	}
}
