class ReturnInMainDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		System.out.println("Inside main");

		int p = 0;
		boolean b = true;
		if (b)
		{
			p = 1;
			System.out.println("Welcome");
			return ;
		}
		else
		{
			p = 2;
		System.out.println(" Not Welcome");
		return ;
		}
	//	System.out.println("End of main");
		
	}

	
}
