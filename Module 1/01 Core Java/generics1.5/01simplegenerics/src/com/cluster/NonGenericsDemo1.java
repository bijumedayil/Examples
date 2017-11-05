package com.cluster;

//program without generics

// non generics class

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Hai {

	Object ob;
	
	void m1(Object e) {
		ob = e;
	}

	Object m2() {
		return ob;
	}
}

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class NonGenericsDemo1 {
	public static void main(String[] args) {
		
		Hai h1 = new Hai();
		// h1 can use any Object
		h1.m1("Cluster");

		// Do type casting
		String s = (String) h1.m2();
		System.out.println("Value of s is: " + s);
		
		
		Hai h2 = new Hai();
		// h2 can use any Object
		h2.m1(new Integer(10));

		// Do type casting and unboxing
	//	 int i = ((Integer)h2.m2()).intValue();

		// Do type casting
		int i = (Integer) h2.m2();
		System.out.println("Value of i is: " + i);
		
	// 	will  cause ClassCastException
	/*	String z = (String)h2.m2();
		System.out.println("Value of z is: " + z);*/

	}
}
