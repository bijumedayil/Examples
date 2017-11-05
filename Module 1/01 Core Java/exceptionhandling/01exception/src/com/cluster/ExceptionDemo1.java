package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ExceptionDemo1 {
	public static void main(String[] args) throws ArithmeticException 
	{
		
		System.out.println("Begin main");
		int x = 10;
		int y = 0;
		int z = 0;
		System.out.println("Val of x before div is " + x);
		System.out.println("Val of y before div is " + y);
		System.out.println("Val of z before div is " + z);
		
		z= x/y; // Exception occurs.  JVM identifies and creates ArithmeticException object.
		
		System.out.println("Val of x after div is " + x);
		System.out.println("Val of y after div is " + y);
		System.out.println("Val of z after div is " + z);
		System.out.println("End of main");

	}
}
