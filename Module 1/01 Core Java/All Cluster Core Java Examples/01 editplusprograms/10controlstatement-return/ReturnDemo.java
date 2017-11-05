class ReturnDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main() method");
		System.out.println("Inside main() method");
	//	m2(15);
		int z = m3(15);
		System.out.println("value of z is " + z);
		System.out.println("End of main() method");

	}
	static void m1()
	{
		System.out.println("Begin m1() method");
		System.out.println("Inside m1() method");
		System.out.println("End of m1() method");
				return;
		
	}

	static void m2(int a )
	{
		System.out.println("Begin m2() method");
		System.out.println("Inside m2() method");
		if (a < 10)
		{
			System.out.println("Value is less than 10" + a);
			return;
			
		}
		else
		{
			System.out.println("Value is greater than 10");
			return; 
			
		}

	//	System.out.println("End of m2() method");
	
	}


	static int m3(int a )
	{
		int p = 0;
		if (( a > 0) && (a < 10))
		{
			p = 1;
			System.out.println("Value is bet 0 and 10	" + a);
			return p;
		}
		else if (( a > 10) && (a < 20))
		{
			p = 2;
			System.out.println("Value is bet 10 and 20	" + a);
			return p;
		}
		else if (( a > 20) && (a < 30))
		{
			p =3;
			System.out.println("Value is bet 20 and 30	" + a);
			return p;
		}
		else
		{
			System.out.println("Value is outside range	" + a);
			return p;
		}
		
	//	System.out.println("End of m3() method");
	}
}
