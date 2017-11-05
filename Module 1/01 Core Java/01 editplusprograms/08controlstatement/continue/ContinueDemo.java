class ContinueDemo 
{
	public static void main(String[] args) 
	{
		for (int i = 0;i < 10;i++ )
		{
			System.out.print(i + " ");
			if (i % 2 == 0)
			{
				continue; // skips statements and causes early iteration
			}
			System.out.println("End of for loop");
		}
		
	}
}
