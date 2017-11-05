class A
{
	final static int i  ; // 1 hardcoding

	/*static // 2 static block
	{
		i = 10;
	} */
/*	A(int x)
	{
		i = x;
	}*/

	void m1(int x)
	{
		i = x;
	}


	
};

class FinalStaticVariableDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println("Value of i is " +A.i);
		//A.i = 5;
	}
}
