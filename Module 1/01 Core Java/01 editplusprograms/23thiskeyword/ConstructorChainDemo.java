class Box
{
	int w;
	int h;
	int d;

	private Box(int w)
	{
		System.out.println("Inside first cons");
		this.w = w;
	}

	private Box(int w, int h)
	{
		this(w);
		System.out.println("Inside sec cons");
		this.h = h;
	}

	Box(int w, int h, int d)
	{
		this(w,h);
		System.out.println("Inside third cons");
		this.d = d;
		
	}
};

class ConstructorChainDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Box b1 = new Box(1,2,3);
		System.out.println("Value of b1 is " + b1);
		System.out.println("Value of w in b1 is " + b1.w);
		System.out.println("Value of h in b1 is " + b1.h);
		System.out.println("Value of d in b1 is " + b1.d);
	}
}
