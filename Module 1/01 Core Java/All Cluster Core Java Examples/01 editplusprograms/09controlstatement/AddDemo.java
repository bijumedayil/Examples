class AddDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		int a = 10;
		int b = 2;
		int c = 0;
		c = add(a,b);
		System.out.println("Sum of a and b is " + c);

		int p = 5;
		int q = 3;
		int r = mutiply(p,q);
		System.out.println("Product of p and q is " + r);

		
	}

	static int add(int x, int y)
	{
		int z = 0;
		z = x + y;
		return z;

	}

	

	static int mutiply(int x, int y)
	{
		int z = 0;
		z = x * y;

		return z;

	}

	static int division(int x, int y)
	{
		int z = 0;
		z = x /y;
		return z;

	}
}
