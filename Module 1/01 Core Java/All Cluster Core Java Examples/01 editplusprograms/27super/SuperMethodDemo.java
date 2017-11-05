class A
{
	int x, y;

	A(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	void show()
	{
		System.out.println("Inside show() method class A");
		System.out.println("Val of x & y is" + x + y);
		System.out.println("Value of x & y is" + this.x + this.y);
	}

}

class B extends A
{
	int z;

	B(int x, int y, int z)
	{
		super(x,y);
		this.z = z;
	}
	void show()
	{
		super.show();

		System.out.println("Inside show() method of class B");
		System.out.println("Val of x & y is" + x + y);
		System.out.println("Value of z is" + z);
	
	}

}




class SuperMethodDemo 
{
	public static void main(String[] args) 
	{
/*		A a = new A(10,20);
		System.out.println("Val of x in main is" + a.x);
		System.out.println("Val of y in main is" + a.y);
		a.showxy(); */

		B b = new B(5,6,7);
		System.out.println("Val of x in main is" + b.x);
		System.out.println("Val of y in main is" + b.y);
		System.out.println("Val of z in main is" + b.z);
		b.show();
		//b.show(4);
		

		


	}
}
