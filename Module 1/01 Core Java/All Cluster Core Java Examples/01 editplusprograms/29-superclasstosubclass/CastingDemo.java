class A
{
	int x,y;
	A(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	void m1()
	{
		System.out.println("Inside A m1()");
	}
};

class B extends A
{
	int z;
	B(int x,int y, int z)
	{
		super(x,y);
		this.z = z;
	}
	void m1()
	{
		System.out.println("Inside B overriding");
	}
};


class CastingDemo 
{
	public static void main(String[] args) 
	{
		// Down casting or explicit casting
		A a = new B(1,2,3);
		System.out.println("Value of a is" + a );
		System.out.println("Value of x in a is" + a.x );
		System.out.println("Value of y in a is" + a.y );
		a.m1();
		B b = null;
//		b = a; // compilation error
		b = (B)a; // Explicit casting or Down casting
		System.out.println("Value of  b is" + b ); 
		System.out.println("Value of x in b is" + b.x );
		System.out.println("Value of y in b is" + b.y );
		System.out.println("Value of z in b is" + b.z );
		b.m1();
	//	b.m2();
	
		
//		System.out.println("Value of y in b is" + b.y ); 

	// Up casting or implicit casting
	/*	B b = new B(5,6,7);
		A a = null;
//		a = b; // implicit or upcasting
		a = (A)b; // explicit but not required
		System.out.println("Value of a is" + a );
		System.out.println("Value of x in a is" + a.x );
		System.out.println("Value of y in a is" + a.y );*/








	/*	A a1 = null;
		a1 = a;
		System.out.println("Value of a1 is" + a1 );
		System.out.println("Value of x in a1 is" + a1.x );
		System.out.println("Value of y in a1 is" + a1.y );
		a.m1();*/






	}
}
