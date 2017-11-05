package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Demo2 {
	public static void main(String[] args) {

		System.out.println("Here are all box constants");

		// use values()
		// values() will give a list of all constants 
		Box z[] = Box.values();
		for (Box b : z) {
			System.out.println(b);
		}

		System.out.println();

		// use values()
		for (Box a : Box.values()) {
			System.out.println(a);
		}

		System.out.println();
		// use valueOf()
		// valueOf() will give the specified constant
		Box e = Box.valueOf("b3");
		System.out.println("e contains " + e);
	}
}
