class Demo 
{
	
	public static void main(char[] args)
	{
		System.out.println("Inside main char parameter");
		for (char c: args )
		{
			System.out.println(c);
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Inside main args");
		char z[] = {'A','B','C'};
		main(z);
	}
}
