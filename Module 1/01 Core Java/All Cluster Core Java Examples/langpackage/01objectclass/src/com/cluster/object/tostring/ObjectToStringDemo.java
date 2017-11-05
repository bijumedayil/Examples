package com.cluster.object.tostring;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ObjectToStringDemo {
	public static void main(String[] args) {
		//overriding  toString() demo
		Box b1 = new Box(1,2,3);
		Box b2 = new Box(5,5,5);
		System.out.println(b1); // toString will be invoked implicitly
		System.out.println(b1.toString());
		System.out.println(b2); // toString will be invoked implicitly
		System.out.println(b2.toString());
	}

}
