class Hello
{
	static int x = 5;
	int y = 9;

	static 
	{
		System.out.println("Inside static block()");
		System.out.println("Inside static block() " + x);
		Hello h = new Hello();
//		System.out.println("Inside static m1() " + y );
		System.out.println("Inside static block() " + h.y );
	}

	void m2()
	{
		System.out.println("Inside instance m2()");
		System.out.println("Inside instance m2() " + x);
		System.out.println("Inside instance m2() " + y );
	}
};

class AccessInstanceInStaticDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Hello h  = null;
		System.out.println("Inside main" + h.x);

	//	h.m1();
	//	h  = new Hello();
	//	h.m2();
	}
}
