class BlockScopeDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int a;
		a= 1;
		System.out.println("Value of a is " + a);
	first:{
			int b;
			b = 2; 
			System.out.println("Value of a in first is " + a);
			System.out.println("Value of b in first is " + b);
		sec:	{
				int c ;
				c = 3;
			System.out.println("Value of a in sec is " + a);
			System.out.println("Value of b in sec is " + b);
			System.out.println("Value of c in sec is " + c);
			}
			System.out.println("Value of a in sec is " + a);
			System.out.println("Value of b in sec is " + b);
		//	System.out.println("Value of c in sec is " + c);
		
		}
			System.out.println("Value of a in sec is " + a);
		//	System.out.println("Value of b in sec is " + b);
		//	System.out.println("Value of c in sec is " + c);
	}
}
