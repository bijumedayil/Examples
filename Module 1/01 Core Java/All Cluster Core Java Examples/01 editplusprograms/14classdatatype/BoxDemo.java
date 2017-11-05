class Box
{
	int w = 5; // Step 1defining a class data type 
	int h = 6;
	int d = 7;
}

class BoxDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
//		int z; // declaring a variable of type int
//		z = 5; // initializing the variable with primitive value
//		System.out.println("value of z is " + z);

		Box b; // Step 2 declaring a reference variable of type Box
		//System.out.println("value of width is " + b.w);
		b =	new Box(); // Step 3 Create the instance
		System.out.println("value of b is " + b);

		System.out.println("value of width in b is " + b.w);
		System.out.println("value of height in b is " + b.h);
		System.out.println("value of depth in b is " + b.d); 

		int vol = b.w * b.h * b.d;
		System.out.println("volume of box b is " + vol); 


		Box b1; // Step 2 declaring a reference variable of type Box
		//System.out.println("value of width is " + b.w);
		b1 =	new Box(); // Step 3 Create the instance
		System.out.println("value of b1 is " + b1);

		System.out.println("value of width in b1 is " + b1.w);
		System.out.println("value of height in b1 is " + b1.h);
		System.out.println("value of depth in b1 is " +  b1.d); 

		int vol1 = b1.w * b1.h * b1.d;
		System.out.println("volume of box b1 is " + vol1);


		b.w = 1;
		b.h = 2;
		b.d = 3;

		System.out.println("value of b is " + b);

		System.out.println("value of width in b is " + b.w);
		System.out.println("value of height in b is " + b.h);
		System.out.println("value of depth in b is " + b.d); 

		int vol2 = b.w * b.h * b.d;
		System.out.println("volume of box b is " + vol2); 



	}
}
