package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("Begin main");
		int a[] = new int[5];
		a[9] = 102;// Exception occurs.  JVM identifies and creates ArrayIndexOutOfBoundsException object.
		System.out.println("End of main");

	}

}
