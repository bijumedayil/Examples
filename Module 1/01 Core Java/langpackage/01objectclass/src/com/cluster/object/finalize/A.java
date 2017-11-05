package com.cluster.object.finalize;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class A {
	A(){
		System.out.println("Initialize in constructor");
	}
	void m1(){
		System.out.println("Use the initialized resource");
	}
	void m2(){
		System.out.println("Use the initialized resource");
	}
	
	public void finalize(){
		System.out.println("Clearing the initialized resource");
	}

}
