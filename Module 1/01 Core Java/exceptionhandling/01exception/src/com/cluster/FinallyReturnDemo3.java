package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Fun
{
	int m1(int x,int y)
	{
		int z = 0;
	
		try
		{
			System.out.println("Begin try");
			z = x/y;
			return z;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inside catch");
			return z;
		}
		
		finally
		{
		System.out.println("Inside finally");
		System.out.println("Val of x is " + x);
		System.out.println("Val of y is " + y);
		System.out.println("Val of z is " + z);
		}
		
	}
}
	
/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class FinallyReturnDemo3 {

	public static void main(String[] args) {
		
		Fun f = new Fun();
		int res = f.m1(10,0);
		System.out.println("Val of res is " + res);

	}

}
