class DifferentArgsDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
//		int a = 10;
//		double d  = 2.9;


		boolean b = m1(10,2.9d,'Z');
		System.out.println("Value of b in main" + b);
		System.out.println("End of main");
	}
	static boolean m1(int a, double d, char c)
	{
		System.out.println("Begin m1()");
		boolean b  = false;
		System.out.println("Value of a and d is " + a +"\t"+ d);
		System.out.println("Value of c in m1 is " + c);
		System.out.println("End m1()");
		return b;
	}
}
