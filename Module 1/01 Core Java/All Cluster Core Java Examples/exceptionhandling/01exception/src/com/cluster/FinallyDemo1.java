package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class FinallyDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Begin main");
		int x = 10;
		int y = 2;
		int z = 0;

		try 
		{
			System.out.println("Begin try");
			z = x/y; // Exception occurs.  JVM identifies and creates a corresponding exception object.
			System.out.println("Result of division is " + z);
			System.out.println("End try");
		}
		
		catch (ArithmeticException e) 
		{
			System.out.println("Inside catch " + e);
		}

		finally
		{
			System.out.println("Inside finally");
		}
		
		System.out.println("End of main");

	}

}
