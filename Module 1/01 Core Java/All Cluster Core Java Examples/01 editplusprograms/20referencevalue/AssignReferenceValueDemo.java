class Box
{
	int w;
	int h;
	int d;

	int volume()
	{
		int l = 0;
		l = w*h*d;
		return l;
	}
	
};

class Test
{
	int x,y;

	void m1()
	{
		System.out.println("Value of x & y is " + x + y);
	}

};
class  AssignReferenceValueDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Box b = null;
		System.out.println("Value of b is " + b);
		b = new Box();
		Test t = null;
		t = b;
		System.out.println("Value of b is " + b);
		System.out.println("Value of w in b is " + b.w);
		System.out.println("Value of h in b is " + b.h);
		System.out.println("Value of d in b is " + b.d);
		b.w = 1;
		b.h = 2;
		b.d = 3;
		System.out.println("Value of w in b is " + b.w);
		System.out.println("Value of h in b is " + b.h);
		System.out.println("Value of d in b is " + b.d);
		
		Box b1 = null;
		System.out.println("Value of b1 is " + b1);
		b1 = new Box();
		System.out.println("Value of b1 is " + b1);
		System.out.println("Value of w in b1 is " + b1.w);
		System.out.println("Value of h in b1 is " + b1.h);
		System.out.println("Value of d in b1 is " + b1.d);
		b1.w = 5;
		b1.h = 6;
		b1.d = 7;
		System.out.println("Value of w in b1 is " + b1.w);
		System.out.println("Value of h in b1 is " + b1.h);
		System.out.println("Value of d in b1 is " + b1.d);
		
		Box b2  = null;
		System.out.println("Value of b2 is " + b2);
		b2 = b1;
		System.out.println("Value of b2 is " + b2);
		System.out.println("Value of w in b2 is " + b2.w);
		System.out.println("Value of h in b2 is " + b2.h);
		System.out.println("Value of d in b2 is " + b2.d);

		Box b3  = null;
		System.out.println("Value of b3 is " + b3);
		b3 = b1;
		System.out.println("Value of b3 is " + b3);
		System.out.println("Value of w in b3 is " + b3.w);
		System.out.println("Value of h in b3 is " + b3.h);
		System.out.println("Value of d in b3 is " + b3.d);
		b3.w*=2;
		b3.h*=2;
		b3.d*=2;
		System.out.println("Value of b3 is " + b3);
		System.out.println("Value of w in b3 is " + b3.w);
		System.out.println("Value of h in b3 is " + b3.h);
		System.out.println("Value of d in b3 is " + b3.d);
		System.out.println("Value of w in b2 is " + b2.w);
		System.out.println("Value of h in b2 is " + b2.h);
		System.out.println("Value of d in b2 is " + b2.d);
		System.out.println("Value of w in b1 is " + b1.w);
		System.out.println("Value of h in b1 is " + b1.h);
		System.out.println("Value of d in b1 is " + b1.d);
		b1 = b;
		System.out.println("Value of b1 is after assign b" + b1);
		System.out.println("Value of w in b is " + b.w);
		System.out.println("Value of h in b is " + b.h);
		System.out.println("Value of d in b is " + b.d);
		System.out.println("Value of w in b1 is " + b1.w);
		System.out.println("Value of h in b1 is " + b1.h);
		System.out.println("Value of d in b1 is " + b1.d);
		b1 = new Box();

		System.out.println("Value of b1 is after new object" + b1);

		System.out.println("Value of w in b1 is " + b1.w);
		System.out.println("Value of h in b1 is " + b1.h);
		System.out.println("Value of d in b1 is " + b1.d);
		









	}
}
