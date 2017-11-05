class Box
{
	int w;
	int h;
	int d;

	Box(int x,int y, int z)
	{
		w = x;
		h = y;
		d = z;
	}

	int volume()
	{
		int l = 0;
		l = w*h*d;
		return l;
	}
	

};
class ConstructorDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Box b1 ;
		b1 = new Box(1,2,3);
	//	b1.Box(1,2,3);
		System.out.println("Value of w in b1 is " + b1.w);
		System.out.println("Value of h in b1 is " + b1.h);
		System.out.println("Value of d in b1 is " + b1.d); 
		int x = b1.volume();
		System.out.println("Volume of box b1 is " + x);


		Box b2 ;
		b2 = new Box(5,6,7);
	//	b2.Box(5,6,7);
		System.out.println("Value of w in b2 is " + b2.w);
		System.out.println("Value of h in b2 is " + b2.h);
		System.out.println("Value of d in b2 is " + b2.d); 

		x = b2.volume();
		System.out.println("Volume of box b2 is " + x);


	}
}
