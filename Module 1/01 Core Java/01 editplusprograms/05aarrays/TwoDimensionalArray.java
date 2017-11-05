class TwoDimensionalArray 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int a[][] = new int [3][2];
		for (int i = 0;i < a.length ;i++ )
		{
			for (int j = 0;j < a[i].length ;j++ )
			{
				System.out.print(a[i][j] + " ");

			}
			System.out.println(" ");
		}

		a[0][0] = 66;
		a[0][1] = 66;
		a[1][0] = 77;
		a[1][1] = 77;
		a[2][0] = 88;
		a[2][1] = 88;

		for (int i = 0;i < a.length ;i++ )
		{
			for (int j = 0;j < a[i].length ;j++ )
			{
				System.out.print(a[i][j] + " ");

			}
			System.out.println(" ");
		}


	}
}
