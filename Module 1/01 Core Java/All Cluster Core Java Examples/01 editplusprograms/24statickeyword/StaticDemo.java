class Hello
{
	static int a = 10;
	int b = 20;

	static void m1()
	{
		System.out.println("Value of a in m1 is " + a);
//		System.out.println("Value of b in m1 is " + b);
	}

};

class StaticDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		// 1st way with refrence variable
//		Hello h = null;
//		System.out.println("Value of a in main is " + h.a);
//		h.m1();
//		System.out.println("Value of b in main is " + h.b);

	
		

		// 2nd way with class name
		
//		System.out.println("Value of a in main is " + Hello.a);
//		Hello.m1();
//		System.out.println("Value of b in main is " + Hello.b);
//		System.out.println("End of main");

		// 3rd way with object
		
		Hello h1 = null;
		h1 = new Hello();
		System.out.println("Value of a in main is " + h1.a);
		System.out.println("Value of b in main is " + h1.b);
		h1.m1();


	}
}
