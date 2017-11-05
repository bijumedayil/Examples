class BreakForLoopDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		for(int i = 0; i<100 ; i++) 
		{
			if (i == 10) // condition
			{
				break; // exit the loop
			}
			System.out.println("Value of i is " + i);
		}

		System.out.println("End of for loop");

	}
}
