class CastingArgsDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//float i = 12.0f;
		double a = m2();
		System.out.println("Value of a in main is" +   a);
	}

	static void m1(double z)
	{
		System.out.println("Value of z is" +   z);
	}

	static double m2()
	{
		double d = 1.5;
		System.out.println("Value of d is" +   d);
		return d;
	}


}
