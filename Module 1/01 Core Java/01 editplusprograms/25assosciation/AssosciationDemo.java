class Hello 
{
	int x ;
	int y ;
	static Test t = new Test(5);

	static
	{
		System.out.println("Inside Hello static");
	}
	
	{
		System.out.println("Inside Hello inst");
		
	}

	Hello()
	{
		System.out.println("Inside Hello const");
	}

	Hello(int x, int y, Test t)
	{
		System.out.println("inside fun");
		System.out.println("Val of x in fun is" +x);
		System.out.println("Val of y in fun is" +y);
		System.out.println("Val of t in fun is" +t);
		System.out.println("Val of inst x in fun is" +this.x);
		System.out.println("Val of inst y in fun is" +this.y);
		System.out.println("Val of t inst in fun is" +this.t);
		this.x = x;
		this.y = y;
		this.t = t;
		System.out.println("Val of x in fun is" +x);
		System.out.println("Val of y in fun is" +y);
		System.out.println("Val of t in fun is" +t);
		System.out.println("Val of inst x in fun is" +this.x);
		System.out.println("Val of inst y in fun is" +this.y);
		System.out.println("Val of t inst in fun is" +this.t);



	}

	void show()
	{
		System.out.println("inside show");
		System.out.println("Val of x in show is" +x);
		System.out.println("Val of y in show is" +y);
	}
};

class Test
{
	int p;

	static
	{
		System.out.println("Inside Test static");
	}
	
	{
		System.out.println("Inside Test inst");
	}

	Test(int p)
	{
		System.out.println("Inside Test const");
		this.p = p;
	}
	
	void m1()
	{
		System.out.println("inside m1");
		System.out.println("Val of p in m1 is" +p);
	}
};

class AssosciationDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Hello h = null;
		System.out.println("Value of t is" + h.t);
		
	/*	int p = 10;
		int q = 20;
		Test t = new Test(5);
		System.out.println("Value of t in main is" + t);
		Hello h = null;
		h = new Hello(p,q,t);
		
		
	
		System.out.println("Value of x is" + h.x);
		System.out.println("Value of y is" + h.y);
		System.out.println("Value of t is" + h.t);
		System.out.println("Value of p is" + h.t.p);
		h.t.m1();
		System.out.println("End of main"); */


	}
}
