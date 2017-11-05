class A
{
	final int i; // 1 hardcoding

/*	{				// 2 instance block
		i = 5;
	} */
	A(int i)
	{
		this.i = i;
	}

	A()
	{
		i = 5;

	}

/*	A (int i)		// 3 constructor
	{
		this.i = i;
	}*/

/*	void m1(int x) // 1 cannot in method
	{
		i =x;
	}*/
};


class FinalVariableDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A a1 = new A(10);
//		a1.i = 10; // cannot with dot operator
	//	a1.m1(10);
		System.out.println("Val of i in a1 is" + a1.i);
		A a2 = new A();
//		a2.i = 20;
	//	a2.m1(20);
		System.out.println("Val of i in a2 is" + a2.i);
	}
}
