package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Hello
{
	void m1(int x, int y)
	{
		int z = x/y;
		System.out.println("Result of division is " + z);
	}
	
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class TryCatchFixErrorDemo4 {
	public static void main(String[] args) {
		System.out.println("Begin main");
		Hello h = new Hello();
		
		try
		{
			System.out.println("Begin try");
			int a = 10;
			int b = 0;
			h.m1(a, b);
			System.out.println("End try");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Please provide proper values");
			int p  = 10;
			int q = 2;
			h.m1(p,q);
			
		}
		
		System.out.println("End main");
	}

}
