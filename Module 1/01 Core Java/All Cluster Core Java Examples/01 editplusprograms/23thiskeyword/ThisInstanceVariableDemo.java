class Box
{
	int w;
	int h;
	int d;

	Box(int w,int h, int d)
	{
		System.out.println("Val of this is " + this);
		System.out.println("Val of w with this is " + this.w);
		System.out.println("Val of h wiht this is " + this.h);
		System.out.println("Val of d with this is " + this.d);
		System.out.println("Val of w is " + w);
		System.out.println("Val of h is " + h);
		System.out.println("Val of d is " + d);
		this.w = w;
		this.h = h;
		this.d = d;
		System.out.println("Val of this is " + this);
		System.out.println("Val of w with this is " + this.w);
		System.out.println("Val of h wiht this is " + this.h);
		System.out.println("Val of d with this is " + this.d);
		System.out.println("Val of w is " + w);
		System.out.println("Val of h is " + h);
		System.out.println("Val of d is " + d);
	}

	Box(int x)
	{
		this.w = x;
		this.h = x;
		this.d = x;
		
	}

	int volume()
	{
		int w = 0;
		w = this.w*this.h*this.d;
		return w;
	}
	

};

class ThisInstanceVariableDemo 
{
	public static void main(String[] args) 
	{
		Box b1 ;
		b1 = new Box(10);
	//	b1.Box(1,2,3);
		System.out.println("Value of b1 is " + b1);
		System.out.println("Value of w in b1 is " + b1.w);
		System.out.println("Value of h in b1 is " + b1.h);
		System.out.println("Value of d in b1 is " + b1.d); 
		int x = b1.volume();
		System.out.println("Volume of box b1 is " + x);
	}
}
