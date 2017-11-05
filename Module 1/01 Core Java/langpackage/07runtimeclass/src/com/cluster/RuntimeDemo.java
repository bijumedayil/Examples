package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class RuntimeDemo {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();

	    System.out.println("Total memory is: " +
	                       r.totalMemory());
	    System.out.println("Initial free memory: " + r.freeMemory());

	}

}
