class Hello
{
	{
		System.out.println("Inside first instance block");
		
	}

	{
		System.out.println("Inside sec instance block");
		
	}

	{
		System.out.println("Inside third instance block");
		
	}


	

	void m1()
	{
		System.out.println("Inside m1() method ");
	}
	void m2()
	{
		System.out.println("Begin m2() method ");
	}
	public void finalize()
	{
		System.out.println("Inside finalize() method ");
	}
};

class InstanceBlockDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Hello h1 = null;
		h1 = new Hello();
		Hello h2 = null;
		h2 = new Hello();
		Hello h3 = null;
		h3 = new Hello();
		
		h1.m2();
		
	}
}
