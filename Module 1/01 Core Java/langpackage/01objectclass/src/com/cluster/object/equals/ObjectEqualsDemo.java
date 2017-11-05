package com.cluster.object.equals;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ObjectEqualsDemo {
	public static void main(String[] args) {
		//equals() method overriding
		
		Test t1 = new Test(11,22);
		Test t2 = new Test(11,22);
		Test t3 = new Test(5,5);
		
		System.out.println("t1 equals t2 is "+ t1.equals(t2));
		System.out.println("t1 equals t3 is "+ t1.equals(t3));
	}
}
