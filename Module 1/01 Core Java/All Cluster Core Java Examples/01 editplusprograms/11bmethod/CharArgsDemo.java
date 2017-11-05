class CharArgsDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
//		char c = 'A';
		//m1(c);
		char c = m2();
		System.out.println("Value of c is " + c);
		
	}

	static void m1(char z)
	{
		System.out.println("Value of z is " + z);
	}

	static char m2()
	{
//		char c ='D';
//		return c;
		return 'C';
		
	}


}
