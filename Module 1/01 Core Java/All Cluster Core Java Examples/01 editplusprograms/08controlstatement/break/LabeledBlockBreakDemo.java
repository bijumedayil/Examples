class LabeledBlockBreakDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		boolean b  = true;

		first: {
				System.out.println("Entering first block");

			second :{
					System.out.println("Entering Second block");

				third : {
							System.out.println("Entering third block");

							System.out.println("Before the break");
							if (b)
							{
								break second;
							}
							System.out.println("End of third block will not execute");
						} 
						System.out.println("End of second block will not execute");
					}
					System.out.println("end of  first block");
				}

				System.out.println("End of all block");
	}
}
