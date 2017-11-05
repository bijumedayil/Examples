package com.cluster.object.finalize;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ObjectFinalizeDemo {
	public static void main(String[] args) {
		
		//finalize() demo
		//create and initialize the objects
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		
		//Use the resource
		a1.m1();
		a2.m2();
		
		//call the garbage collector
		System.gc();
		
		//dereference the objects
		a1 = null;
		a2 = null;
		
		
		//call the garbage collector after dereferencing
		System.gc();

	}
}
