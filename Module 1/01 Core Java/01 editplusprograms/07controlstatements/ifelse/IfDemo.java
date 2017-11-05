class IfDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	/*	I scencario

		int i = 15;
		if (i < 10)
		{
			System.out.println("Inside if block");
		}
		System.out.println("After If ");*/


/*		// II Scenario

		int i = 15;

		if (i < 10)
		{
		System.out.println("Inside if block");
		System.out.println("Value of i is " + i );
		}
		else
		{
		System.out.println("Inside else block");
		System.out.println("Value of i is " + i );
		}

		System.out.println("After If and else "); */


		// III Scenario

		int i = 25;
		int j = 0;

		if ((i > 0)  && (i < 10))
		{
		System.out.println("Inside if block");
		j = 1;
		System.out.println("Value of i is " + i );
		System.out.println("Value of j is " + j );
		}
		else if ((i > 10)  && (i < 20))
		{
		System.out.println("Inside else if block");
		j = 2;
		System.out.println("Value of i is " + i );
		System.out.println("Value of j is " + j );
		}

		else 
		{
		System.out.println("Inside else block");
		System.out.println("Value outside range");
		j = 3;
		System.out.println("Value of i is " + i );
		System.out.println("Value of j is " + j );
		
		}

		System.out.println("After IF , ELSE IF and ELSE statment");





		
	}
}
