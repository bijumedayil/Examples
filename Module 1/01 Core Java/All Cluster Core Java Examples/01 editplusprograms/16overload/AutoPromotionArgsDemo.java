class Hello
{
/*	void m1(byte x)
	{
		System.out.println("Inside byte m1  " + x);
	} */

	void m1(short x)
	{
		System.out.println("Inside short m1  " + x);
	} 

	void m1(int x)
	{
		System.out.println("Inside int m1  " + x);
	}

	void m1(long x)
	{
		System.out.println("Inside long m1  " + x);
	}


};

class AutoPromotionArgsDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Hello h = new Hello();
		byte  b = 1;
		short s = 2;
		int i = 3;
		long l = 4;
		double d = 7.9;
	//	h.m1(b);
//		int res = b + s;
		h.m1(b + s);
	}
}
