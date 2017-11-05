class FibonacciDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	
		int n = Integer.parseInt(args[0]);

		int a = 1, b =0, c = 0;
		for (int i = 0;i<n ;i++ )
		{
			System.out.println(c);
			b = c;
			c = a+b;
			a = c-a;
		}
		System.out.println("End of for loop");
	}
}
