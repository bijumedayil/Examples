package com.cluster.object.getclass;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ObjectGetClassDemo {
	public static void main(String[] args) {
		// getClass() method is a final method which
		// returns the class of the object
		
		Box b = new Box(1,2,3);
		Test t = new Test(5,5);
		Class c1 = b.getClass();
		Class c2 = t.getClass();
		System.out.println("Class of b is " + c1);
		System.out.println("Class of t is " + c2);

	}

}
