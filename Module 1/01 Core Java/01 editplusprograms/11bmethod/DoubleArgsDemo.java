class DoubleArgsDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		
		double x = 5;
		double y = 0; 
	//	m1(z);
		 y = m2(x);

		System.out.println("Value of y is " + y);
	}

	static void m1(double p)
	{
		System.out.println("inside m1()");
		System.out.println("Value of p is " + p);
	}

	static double m2(double p)
	{
		System.out.println("Value of p is " + p);
		double d = p+7;
		System.out.println("inside m2()");
		return d;
	}

	static double m3(double a, double d)
	{
		System.out.println("Value of p is " + p);
		double d = p+7;
		System.out.println("inside m2()");
		return d;
	}
}
