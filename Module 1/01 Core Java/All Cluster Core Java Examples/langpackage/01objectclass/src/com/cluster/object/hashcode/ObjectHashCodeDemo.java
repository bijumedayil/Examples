package com.cluster.object.hashcode;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ObjectHashCodeDemo {
	public static void main(String[] args) {
		// overriding hashcode()
		Hello h1 = new Hello(1,2);
	//	Hello h2 = new Hello(5,5);
		System.out.println(h1);
		System.out.println(h1.hashCode());
		//System.out.println(h2.hashCode());
	}
}
