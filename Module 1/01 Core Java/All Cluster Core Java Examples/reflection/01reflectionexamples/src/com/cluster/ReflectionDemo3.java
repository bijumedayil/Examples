package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class X {
	int a;
	float b;
}


class Y extends X{
	double c;

}



/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ReflectionDemo3 {
	public static void main(String[] args) {
		
		X x = new X();
		Y y = new Y();

		Class c1 = x.getClass(); //returns the class of the object 
		System.out.println("x is object of type: " + c1.getSimpleName()); // getSimpleName() gives only simple name of the class

		Class c2 = y.getClass(); //returns the class of the object 
		System.out.println("y is object of type: " + c2.getName());
		
		Class c3 = c2.getSuperclass(); //returns the super class of the object 
		System.out.println("y's superclass is " + c3.getName()); // getName() gives fully qualified name of the class

	}

}
