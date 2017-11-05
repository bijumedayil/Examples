class Box
{
	int w;
	int h;
	int d;

	void fun(int x, int y, int z)
	{
		w = x;
		h = y;
		d = z;
	}
	int volume()
	{
		int l;
		l = w*h*d;
		System.out.println("Volume of box is" + l);
		return l;
	}
};

class MethodDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		Box b ;
		b = new Box();
		System.out.println("Value of b is" + b);
		System.out.println("Value of w in b is" + b.x);
		System.out.println("Value of h in b is" + b.y);
		System.out.println("Value of d in b is" + b.z);
		System.out.println("Value of d in b is" + b.l);
	/*	//int vol = b.w * b.h * b.d;
		//System.out.println("Volume of box b is" + vol);
		int vol = b.volume();
		System.out.println("Volume of box b is" + vol);

		b.fun(1,2,3);
		System.out.println("Value of b is" + b);
		System.out.println("Value of w in b is" + b.w);
		System.out.println("Value of h in b is" + b.h);
		System.out.println("Value of d in b is" + b.d);
//		vol = b.w * b.h * b.d;
//		System.out.println("Volume of box b is" + vol);
		vol = b.volume();
		System.out.println("Volume of box b is" + vol);


		Box b1; //declaring a reference variable
		b1 = new Box(); // creating an instance or object
		System.out.println("Value of b is" + b1);
		System.out.println("Value of w in b1 is" + b1.w);
		System.out.println("Value of h in b1 is" + b1.h);
		System.out.println("Value of d in b1 is" + b1.d);
		b1.fun(4,5,6);
		System.out.println("Value of b1 is" + b1);
		System.out.println("Value of w in b1 is" + b1.w);
		System.out.println("Value of h in b1 is" + b1.h);
		System.out.println("Value of d in b1 is" + b1.d);
	//	vol = b1.w * b1.h * b1.d;
	//	System.out.println("Volume of box b1 is" + vol);
		vol = b1.volume();
		System.out.println("Volume of box b is" + vol); */



	}
}
