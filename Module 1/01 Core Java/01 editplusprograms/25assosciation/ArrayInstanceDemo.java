class Hello
{
	int i = 5;
// declaring, creating and initializing
//	int x[] = {100,101,102,103,104};

	// declaring, creating
//	int x[] = new int[5];

	int x[];

/*	{
		x[0] = 100;
		x[1] = 101; // initializing
		x[2] = 102;
		x[3] = 103;
		x[4] = 104;
	} */
	
	void m1()
	{
		System.out.println("Val of x in m1() is " + x);
		System.out.println("Val in 1 ind in m1() is " + x[2]);

	}
};

class ArrayInstanceDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Hello h = null;
		h = new Hello();

		System.out.println("Val of i in main is " + h.i);
		System.out.println("Val of x in main is " + h.x);

		int p[] = {100,101,102};
		h.x = p;
		System.out.println("Val in 1 ind in main is " + h.x[2]);
		h.m1();

	}
}
