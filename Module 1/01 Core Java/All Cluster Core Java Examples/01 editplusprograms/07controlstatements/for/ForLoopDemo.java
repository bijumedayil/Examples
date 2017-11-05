class ForLoopDemo 
{
	public static void main(String[] args) 
	{
		
		int a[] = {1,2,3,4,5};
		int sum = 0;

/*		for (int i = 0; i < a.length ;i++ )
		{
			System.out.println("Values in the array are " + a[i]);
		
		} 

		//old for loop
		for (int i = 0; i < a.length ;i++ )
		{
		//	System.out.println("Values in the array are " + a[i]);
		//	int p = a[i];
		// sum += p;
			a[i] = a[i] + 10;
		} 

		for (int i = 0; i < a.length ;i++ )
		{
			System.out.println("Values in the array are " + a[i]);
		
		}  */
		







	//	System.out.println("Sum of all values in array " + sum); 

		// enhanced for loop or advavnced for loop

		for (int i : a)
		{
			System.out.println("Values in array are " + i);
		
		}

		for (int i : a)
		{
		//	System.out.println("Values in array are " + i);
		//	sum += i;

			i = i + 10;
		}

		for (int i : a)
		{
			System.out.println("Values in array are " + i);
		
		}

//		System.out.println("Sum of all values in array " + sum); 



	}
}
