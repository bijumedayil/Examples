package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Outer 
{
	 int a = 10;
	 static int p = 55;

	void m1() 
	{
		System.out.println("Inside m1() OUTER class");
		System.out.println("Value of a is" + a);
		Inner obj = new Inner();
		obj.m2(); // access inner class instance member in outer class by creating an object
		System.out.println("Val of b in outer is" + obj.b); 
		System.out.println("Val of q in outer is" + Inner.q); // access static member of inner class in outer class with classname
	}

	static class Inner 
	{
		int b = 20;
		static int q = 66;

		void m2() 
		{
			System.out.println("Inside m2() INNER class");
			System.out.println("Value of p is" + p); // can access only static member of outer class inside inner class directly 
//			System.out.println("Value of a is" + a); // cannot access instance member of outer class inside inner class
			System.out.println("Value of b is" + b); 
		}
	}
}