class CommandLineArgumentDemo 
{
	public static void main(String[] args) 
	{
//		System.out.println("Hello World!");

		System.out.println("Length of the array is "+args.length);
		String s1 = args[0];
		String s2 = args[1];

		String s3 = s1 + s2;

		System.out.println("Value of s1 is " + s1);
		System.out.println("Value of s2 is " + s2);
		System.out.println("Value of s3 is " + s3);

		int x = Integer.parseInt(s1);
		int y = Integer.parseInt(s2);
		int z = x + y;

		System.out.println("Value of x is " + x);
		System.out.println("Value of y is " + y);
		System.out.println("Value of z is " + z);


	//	System.out.println("Value of s is" + s);

		for (int i = 0; i < args.length ; i++ )

		{
			System.out.println("Value in" + i +" index is" + args[i]);

		} 
	}
}
