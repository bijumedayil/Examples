class BooleanArgsDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int a = 5;
		boolean x = true;
		boolean y = false;

		boolean z = m3(x,y);
	//	b = a;
	//	m1(b);
	//	boolean z = m2();
	//	m
		System.out.println("Value of z in main is " + z);
	}

	static void m1(boolean z)
	{
		System.out.println("Value of z in m1 is " + z);
	}

	static boolean m2()
	{
		
		System.out.println("in m1  " );
		return true;
	}

	static boolean m3(boolean a, boolean b)
	{
		boolean c = true;
		System.out.println("Value of a in m3 is " + a);
		System.out.println("Value of b in m3 is " + b);
		return c;
	}
}
