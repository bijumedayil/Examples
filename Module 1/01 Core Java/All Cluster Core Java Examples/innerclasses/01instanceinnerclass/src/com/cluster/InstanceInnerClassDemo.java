package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Outer 
{
	int a = 10;

	void m1() 
	{
		System.out.println("Inside m1() OUTER class");
		System.out.println("Value of a is" + a);
	//	System.out.println("Value of b is" + b); // cannot access inner class member directly in outer class
		Inner obj = new Inner(); // create object of inner class in outer class to access the members of inner class in outer class
		obj.m2(); // accessing inner class member
		System.out.println("Value of b in outer is" + obj.b);  // accessing inner class member
	}

	class Inner 
	{
		int b = 20;

		void m2() 
		{
			System.out.println("Inside m2() INNER class");
			System.out.println("Value of a is" + a); // outer class members can be accessed directly in inner class
			System.out.println("Value of b is" + b);
		}
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class InstanceInnerClassDemo 
{
	public static void main(String[] args) 
	{
		// outer class functionality
		Outer o = new Outer();
		o.m1();
		
		// Inner class functionality outside outer class
		
		// create object of inner class to access members of inner class outside outer class
		Outer.Inner oi1 = o.new Inner();
		Outer.Inner oi2 = new Outer().new Inner(); 
		oi1.m2();  
		oi2.m2();  
	}
}
