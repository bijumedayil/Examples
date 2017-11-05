class Hello
{
	Hello()
	{
		System.out.println("inside constructor");

	}
	 void m1()
	{
		System.out.println("inside m1");
	}

	 Hello m2()
	{
		
		System.out.println("inside m2" + this);
		return this;
	}
};

class ReturnThisDemo 
{
	public static void main(String[] args) 
	{
		Hello h = null;
		Hello h1 = null;
		h = new Hello();
		System.out.println("inside main" + h);
		h1 = h.m2();
		System.out.println("inside main" + h1);
	}
}
