class MethodDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main() method");
		System.out.println("Inside main() method");
	//	m1();

	//	m2(a);

	//	m3();
		int a = 5;
		int b = 6;
	//	m4(a,b);

		int z = m5(a,b);
	
		
		
	System.out.println("Value of z in main after call is" + z);
		System.out.println("End main() method");
	}

	static void m1()
	{
		System.out.println("Begin m1() method");
		System.out.println("Inside m1() method");
		System.out.println("End m1() method");
	}
	static void m2(int a)
	{
		System.out.println("Begin m2() method");
		System.out.println("Inside m2() method");
		System.out.println("Value of a is" + a);
		a+=5;
		System.out.println("Value of a after modifying is" + a);
		System.out.println("End m2() method");
	}

	static int m3()
	{
		int z = 99;
		System.out.println("Begin m3() method");
		System.out.println("Inside m3() method");
		System.out.println("End m3() method");
		return z;
	}

	static void m4(int a, int b)
	{
		System.out.println("Begin m4() method");
		System.out.println("Inside m4() method");
		System.out.println("Value of a is" + a);
		System.out.println("Value of b is" + b);
		System.out.println("End m4() method");

	}

	static int m5(int a, int b)
	{
		System.out.println("Begin m5() method");
		System.out.println("Inside m5() method");
		System.out.println("Value of a is" + a);
		System.out.println("Value of b is" + b);
		int c = a + b;
		return c;

		//System.out.println("End m4() method");

	}
}
