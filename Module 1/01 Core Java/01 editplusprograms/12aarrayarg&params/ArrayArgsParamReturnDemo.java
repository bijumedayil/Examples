class ArrayArgsParamReturnDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	/*	int a = 15;
		int b = 20;
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
		m1(a,b);
		System.out.println("Value of a after call is " + a);
		System.out.println("Value of b after call is " + b); */

		int a[] = {100, 101,102,103,104,105,106};
		System.out.println("Value of a is " + a);
		System.out.println("Value of a is " + a.length);
		System.out.println("Value in 2 index is" + a[2]);
		m2(a); 

	/*	char p[] = {'A','B','C','D','E'};
		System.out.println("Value of P is " + p);
		System.out.println("Length of P is " + p.length);
		System.out.println("Value in 2 ind in main" + p[2]);
		m3(p); */
//		int a[];
	//	System.out.println("Value of a is " + a);
	//	System.out.println("Lenght of a is " + a.length);
		int a[] = m4();

		System.out.println("Value of a is " + a);
		System.out.println("Lenght of a is " + a.length);

		for (int i: a)
		{
			System.out.println("Value of i is" +i );
		}

	}

	static int[] m4()
	{
		int x[] = {100, 101,102,103,104,105,106};
		System.out.println("Value of x is " + x);
		System.out.println("Lenght of x is " + x.length);
		return x;

	}

	static void m3(char x[])
	{
		System.out.println("Value of x is " + x);
		System.out.println("Value of x is " + x.length);
		for (char i: x)
		{
			System.out.println("Value of i is" +i );
		}

	}


	
	static void m2(int x[])
	{
		System.out.println("Value of x is " + x);
		System.out.println("Value of x is " + x.length);

		for (int i: x)
		{
			System.out.println("Value of i is" +i );
		}

		x[2] = 222;

		System.out.println("Value in 2 ind in m2" + x[2]);



	}














	static void m1(int p, int q)
	{
		System.out.println("Value of p before mod is " + p);
		System.out.println("Value of q before mod is " + q);
		p*=2;
		q/=2;
		System.out.println("Value of p after mod is " + p);
		System.out.println("Value of q after mod is " + q);

	}
}
