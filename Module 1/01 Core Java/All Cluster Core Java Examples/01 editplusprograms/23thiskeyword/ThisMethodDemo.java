class Hello
{
	private void m1()
	{
		System.out.println("inside m1");
	}

	 void m2()
	{
		this.m1();
		System.out.println("inside m2");
		this.m1();
	}
};

class ThisMethodDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Hello h = new Hello();
		h.m2();
	}
}
