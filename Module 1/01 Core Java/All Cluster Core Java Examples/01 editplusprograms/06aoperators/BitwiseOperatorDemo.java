class  BitwiseOperatorDemo
{
	public static void main(String[] args) 
	{
	/*	System.out.println("Hello World!");
		int a = 5;
		int b = a << 3;
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b); */

		int a = 5;
		int b = 6;

		int p = a & b;
		int q = a | b;
		int r = ~a;
		int s = a ^ b;

		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
		System.out.println("Value of p is " + p);
		System.out.println("Value of q is " + q);
		System.out.println("Value of r is " + r);
		System.out.println("Value of s is " + s);


	}
}
