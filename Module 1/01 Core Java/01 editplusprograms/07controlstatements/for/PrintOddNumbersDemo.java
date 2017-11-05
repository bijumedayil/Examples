// print all odd numbers till the entered number

class PrintOddNumbersDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int a = Integer.parseInt(args[0]);

		for (int i =0;i < a ; i++ )
		{
			if (i%2 != 0)
			{
				System.out.println(i);
			}
		}
		System.out.println("End of for loop");
	}
}
