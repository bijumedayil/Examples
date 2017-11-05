class ArraysDemo 
{
	public static void main(String[] args) 
	{
		int a ; // declaring a primitive variable
		a = 5; // intializing the variable

		int x[]; // declaring a array variable
	//	int []x;
		x = new int[5]; // create an array
		
	//	int x[] = new int[5];
	//	int []x = new int[5];

		System.out.println("size of the array is" + x.length);

		int p = x[4];
		System.out.println("Value in 4 index is" + p);
		System.out.println("Value in 3 index is" + x[3]);

		x[0] = 100;
		x[1] = 101;
		x[2] = 102;
		x[3] = 103;
		x[4] = 104;
	///	x[10] = 105;

//		System.out.println("hello world 11111");

		int q = x[4];

//		System.out.println("hello world2222");
		System.out.println("Value in 4 index is" + q);
		System.out.println("Value in 3 index is" + x[]);

		for (int i = 0;i < x.length ; i++)
		{
			System.out.println("Value in "+ i +" index is" + x[i]);

		}


	}
}
