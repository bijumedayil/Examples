class MethodDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin of main()");
		System.out.println("Inside main()");
		m1();
		m1();
		m1();
		System.out.println("End of main()");
	}

	static void m1()
	{
		System.out.println("Begin of m1");

		System.out.println("Inside m1");
		System.out.println("End of m1");
	}

	static void m2()
	{
		System.out.println("Begin of m2");
		System.out.println("Inside m2");
		System.out.println("End of m2");
	}
}
