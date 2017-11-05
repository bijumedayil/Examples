class Hello
{
	void test()
	{
		System.out.println("No params");
	}
	void test(int a)
	{
		System.out.println("value of a is" + a);
	} 
	void test(int a, double d)
	{
		System.out.println("value of a & d is " + a + d);
	}
	void test(double d, int a)
	{
		System.out.println("value of d & a is " + d + a);
	}
	void test(double d)
	{
		System.out.println("value of d is" + d);
	}

/*	int test(int a)
	{
		int p = 0;
		p = a *a;
		System.out.println("value of p is" + p);

		return p;
	} */

};

class OerloadDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Hello  h = new Hello();
//		h.test(); // 1 
//		h.test(8);// 2
//		h.test(3.5,7); // 4
//		h.test(9, 8.3);
	//	h.test(10,20,30);
		int z =  h.test(5);
	System.out.println("Value of z is " + z);
	}
}
