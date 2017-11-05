class FloatargsDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		float f = m2();
		System.out.println("Value of f in main is " + f);
	}

	static void m1(float f)
	{
		System.out.println("Value of f is " + f);
	}

	static float m2()
	{
		float z = 1.5f;
		System.out.println("Value of z in m2() is " + z);
		return z;
	}
}
