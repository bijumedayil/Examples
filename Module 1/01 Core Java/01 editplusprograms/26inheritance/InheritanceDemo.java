class A
{
	int x;
	int y;

	void showxy()
	{
		System.out.println("Val of x & y is" + x + y);
	}
}
class B extends A
{
	int z;

	void showz()
	{
		System.out.println("Val of z is" + z);
	}

	void sum()
	{
		System.out.println("sum of x,y & z is" + (x + y +z));
		System.out.println("sum " + (super.x + super.y +z));
	}

};


class InheritanceDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	/*	A a = new A();
		a.x = 1;
		a.y = 2;
		a.showxy();

		System.out.println("Value of a is +++++++++" + a); */

		B b = new B();
		b.x = 5;
		b.y = 6;
		b.z = 7;
		b.showxy();
		b.showz();
		b.sum();

		System.out.println("Value of b is +++++++++" + b);
	}
}
