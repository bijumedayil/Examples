class Hello
{
	int m1(int... a)
	{
		System.out.println("Inside  vargs m1");
		int sum = 0;
		for (int x: a)
		{
			//System.out.println("Value of a is  " + x);
			sum += x;
		}
		System.out.println("Sum of all numbers is  " + sum); 
		return sum;
	}
	void m1(int a )
	{
		System.out.println("Inside  normal m1");
	}

	
};
class VarargsDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Hello h = new Hello();
		int p = 1;
		int q = 2;
		int r = 3;
		int s = 4;
		//int d = 8.2;
		int a  = h.m1(p);
		System.out.println("Sum of all values is  " + a);
		//sum += x;
		
		
	}
}
