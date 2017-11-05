class ArgumentAndParameterDemo 
{

	static int m1(int x, int y)
	{
		
		System.out.println("Begin of m1()");
		System.out.println("Value of x in m1 is " + x);
		System.out.println("Value of y in m1 is " + y);
		
		x*=2;
		y/=2;
		System.out.println("Value of x in m1 after change is " + x);
		System.out.println("Value of y in m1 after change is " + y);
		return x;
	}
	public static void main(String[] args) 
	{
		System.out.println("Begin of main()");
		int a = 15;
		int b = 20;
		int c = 0;

		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
		System.out.println("Value of c is " + c);
		
		 m1(a,b);
		System.out.println("Value of a after executing m1 is " + a);
		System.out.println("Value of b after executing m1 is " + b);
		System.out.println("Value of c after executing m1 is " + c);
		System.out.println("End of main()");


	}

	
	 
}
