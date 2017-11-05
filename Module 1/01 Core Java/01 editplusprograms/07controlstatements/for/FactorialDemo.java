class FactorialDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		int n = Integer.parseInt(args[0]);
		int fact = 1;
		if (n == 0)
		{
			System.out.println(n);

		}
		else
		{
			for (int i = 1; i<= n; i++ )
			{
				fact = fact * i;
			}
			System.out.println(fact);
		}
	}
}
