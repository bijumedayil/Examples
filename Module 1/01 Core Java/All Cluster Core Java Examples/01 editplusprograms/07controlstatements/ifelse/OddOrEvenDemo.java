// program to find odd or even number

class OddOrEvenDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

	//	String s = args[0];
	//	int a = Integer.parseInt(s);

		int a = Integer.parseInt(args[0]);

//		int a = 5;

		if (a%2==0)
		{
			System.out.println("even number " + a);
		}
		else
		{
			System.out.println("odd number " + a);
		}

	}
} 
