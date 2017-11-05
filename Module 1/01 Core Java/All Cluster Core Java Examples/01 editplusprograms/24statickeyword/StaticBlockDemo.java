class Hello
{
	static int a = 5;

	static
	{
		System.out.println("Inside static block");
	}

	{
		System.out.println("Inside instance block");
	}
	Hello()
	{
		System.out.println("Inside constructor");
	}
	void m1()
	{
		System.out.println("Inside m1 method");
	}

	public void finalize()
	{
		System.out.println("Inside finalize method");
	}


};

class StaticBlockDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		Hello h1 = null;
//		Hello h2 = null;
//		Hello h3 = null;
//	
//		h1 = new Hello();
//		h2 = new Hello();
//		h3 = new Hello();
//		h1 = null;
//		h2 = h3;
//		System.gc();
//
//
//		System.out.println("End main");
	}
}
