class BreakWhileLoopDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int i = 0; // initialization
		while (i<100) // test condition
		{
			if (i == 10)// condition
			{
				break; // exit the loop
			}
			System.out.println("Value of i is " + i);
			i++;
		}
		System.out.println("outside while loop");

	}
}
