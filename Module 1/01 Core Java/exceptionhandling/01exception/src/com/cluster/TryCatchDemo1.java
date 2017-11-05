package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class TryCatchDemo1 {

	public static void main(String[] args) {

		System.out.println("Begin main");
		int x = 10;
		int y = 0;
		int z = 0;
		
		try {
			System.out.println("Begin try");
			z = x/y; // Exception occurs.  JVM identifies and creates a corresponding exception object.
			System.out.println("Result of division is " + z);
			System.out.println("End try");
			
		} catch (ArithmeticException e) {
			System.out.println("Begin catch");
			System.out.println("Please enter values");
			int p = 10;
			int q = 2;
			int r = p/q;
			System.out.println("Result of division is " + r);
		//	System.out.println(e); // Used for debugging
		//	e.printStackTrace(); // Used for debugging
		//	System.out.println(e.getMessage()); // Used for debugging
			System.out.println("End catch");
		}
		
		System.out.println("End of main");
	}
}
