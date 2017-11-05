class ArrayLocalScopeDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int a[];
		a = new int[5];

		System.out.println("Value of a is " + a);
		System.out.println("Lenght of array is " + a.length);

//		int p2 = a[2];
		System.out.println("Value in 2 index of a[] is " + a[2]);	

	//	System.out.println("Value in 2 index  is " + a[2]);	

		a[0] = 100;
		a[1] = 101;
		a[2] = 102;
		a[3] = 103;
		a[4] = 104; 

		int x[] = a;

//		x = a;

		System.out.println("Value of x is " + x);
		System.out.println("Lenght of array is " + x.length);

	System.out.println("Value in 2 index of a[] is " + a[2]);	

	System.out.println("Value in 2 index of x[] is " + x[2]);	

	int p = a[2];
	int q = x[2];

	System.out.println("Value of p & q is " + p  + "\t" + q);
	
	x[2] = 222;

System.out.println("Value in 2index  a[] after mod is " + a[2]);	

System.out.println("Value in 2index  x[] after mod is " + x[2]);	








	/*	int a[] = {100,101,102,103,104};

		int p2 = a[2]; */
//		System.out.println("Value in 2 index or p2 after  init" + p2);	

//		System.out.println("Value in 2 index is after init " + a[2]);	

		
		}
}
