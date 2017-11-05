class TypeCastDemo 
{
	public static void main(String[] args) 
	{
/*		System.out.println("Hello World!");
		byte b  = 5;
		int i = 0;

		System.out.println("Value of b is " + b);
		System.out.println("Value of i is " + i);

		i = b; // Implicit casting or Widening conversion

		System.out.println("Value of b is " + b);
		System.out.println("Value of i is " + i); */

	/*	System.out.println("Hello World!");
		byte b  = 0;
		int i = 130;

		System.out.println("Value of b is " + b);
		System.out.println("Value of i is " + i);

	//	b = i; 
		//destination = (target type) source;
		b = (byte) i;

		System.out.println("Value of b is " + b);
		System.out.println("Value of i is " + i); */



		int a = 0;
		float f = 5.908f;
		

		System.out.println("Value of a is " + a);
		System.out.println("Value of f is " + f);

		a = (int)f;

		System.out.println("Value of a is " + a);
		System.out.println("Value of f is " + f);


	}
}
