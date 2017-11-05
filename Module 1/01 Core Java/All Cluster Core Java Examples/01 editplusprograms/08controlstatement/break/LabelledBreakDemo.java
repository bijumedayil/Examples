class LabelledBreakDemo
{
	public static void main(String[] args) 
	{
		
		first: for (int i = 0;i < 3 ; i++ )
		{
			System.out.print("Pass" + i  + " : ");
			{
			second:	for (int j = 0;j < 100 ; j++ )
				{
					if (j==10)
					{
						break first; // exits inner loops
					}
					System.out.print(j +" ");
					
				}
				System.out.println("This will not print");
			}
			System.out.println("Both Loops are completed");

		}
	}
}
