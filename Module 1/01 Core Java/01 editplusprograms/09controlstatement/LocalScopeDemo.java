class LocalScopeDemo 
{
	public static void main(String[] args) 
	{
		int a = 15;
		int b = 20;
		int x = 0;
		int y = 0;
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
		System.out.println("Value of x is " + x);
		System.out.println("Value of y is " + y);

		x = a;
		y = b;

		System.out.println("Value of a after assign is " + a);
		System.out.println("Value of b aftre assign is " + b);
		System.out.println("Value of x after assign is " + x);
		System.out.println("Value of y after assign is " + y);

		x*=2;
		y/=2;

		System.out.println("Value of a after change is " + a);
		System.out.println("Value of b aftre change is " + b);
		System.out.println("Value of x after change is " + x);
		System.out.println("Value of y after change is " + y);








	}
}
