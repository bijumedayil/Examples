// print the number in reverse order 

class ReverseNumberDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int n = Integer.parseInt(args[0]);
		
		int r = 0;
		int m = 0;
		while (n!=0)
		{
			r = n% 10;
			m = m* 10 + r;
			n = n/10;
		}
		System.out.println(m);

	}
}