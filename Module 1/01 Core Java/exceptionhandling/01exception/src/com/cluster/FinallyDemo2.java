package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Test
{
	void m1(int x, int y)
	{
		System.out.println("Begin m1");
		int z = 0;
		try 
		{
			System.out.println("Inside try");
			z = x/y;
			System.out.println("Res of div is " + z);
		} 
		
		catch (ArithmeticException e) 
		{
			System.out.println("Inside catch");
		}
		
		finally
		{
			System.out.println("Inside finally");
		}
		
		System.out.println("End of m1");
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class FinallyDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		Test t = new Test();
		t.m1(10, 2);
		System.out.println("End main");
	}
}
