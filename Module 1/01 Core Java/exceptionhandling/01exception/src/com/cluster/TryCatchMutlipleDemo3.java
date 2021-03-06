package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class TryCatchMutlipleDemo3 {

	public static void main(String[] args) {
		
		System.out.println("Begin main");
		int x = 10;
		int y = 0;
		int z = 0;
		
		try {
			System.out.println("Begin try");
			z = x/y; 
			System.out.println("Result of division is " + z);
			int a[] = new int[5];
			a[9] = 102;
			System.out.println("End try");
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("End of main");
		
	}

}
