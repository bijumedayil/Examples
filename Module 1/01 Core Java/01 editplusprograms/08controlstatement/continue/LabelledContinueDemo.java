class LabelledContinueDemo
{
	public static void main(String[] args) 
	{
		
		outer : for (int i = 0;i < 10 ; i++ )
		{
			inner :for (int j = 0;j < 10 ; j++ )
				{
					if (j>i)
					{
						System.out.println();
						continue outer; 
					}
					System.out.print(" * " );
				}
		}
		System.out.println();
		System.out.println("Loop is completed");

		
	}
}
