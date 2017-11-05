package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Z
{
	int m1(int x,int y)
	{
		int z = 0;
	
		try
		{
			System.out.println("Begin try of m1");
			z = x/y;
			return z;
		}
		
		finally
		{
		System.out.println("Inside finally");
		
		}
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class FinallyFixErrorDemo4 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		Z z = null;
		int res = 0;
		try 
		{
			System.out.println("Begin try of main");
			z = new Z();
			res = z.m1(10, 0);
			System.out.println("Result of div is " + res);
			System.out.println("End try");
		} 
		catch (ArithmeticException e) 
		{
			res = z.m1(10, 2);
			System.out.println("Inside catch");
		}
		System.out.println("End main");
	}

}
