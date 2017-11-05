class Hello
{
	static int a = 2;
	int b;
};

class StaticGlobalDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Hello h1 = null;
		Hello h2 = null;
		Hello h3 = null;

		h1 = new Hello();
		System.out.println("Value of a in is " + h1.a);
		System.out.println("Value of b in h1 is " + h1.b);
		h1.b = 10;
		System.out.println("Value of b in h1 is " + h1.b);

		h2 = new Hello();
		System.out.println("Value of a in is " + h2.a);
		System.out.println("Value of b in h1 is " + h2.b);
		h2.b = 20;
		System.out.println("Value of b in h1 is " + h2.b);

		h3 = new Hello();
		System.out.println("Value of a in is " + h3.a);
		System.out.println("Value of b in h1 is " + h3.b);
		h3.b = 30;
		System.out.println("Value of b in h1 is " + h3.b);

		h2.a = 99;
		System.out.println("Value of a in h1 is " + a);
		System.out.println("Value of a in h2 is " + h2.a);
		System.out.println("Value of a in h3 is " + h3.a);
		System.out.println("Value of a in Hello is " + Hello.a);

	}
}
