package com.cluster.bounded;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
 class A {
	
	void show1()
	{
		System.out.println("Inside A show1");
	}
}

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
 class B extends A{
	
	void show2()
	{
		System.out.println("Inside B show2");
	}
}

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
 class C extends B{
	
	void show3()
	{
		System.out.println("Inside C show3");
	}
}


 // generic class

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
 class Sample<T extends A> 
{
	T ob;
	
	Sample(T t)
	{
		ob = t;
	}
	
	T getOb()
	{
		return ob;
	}
}
 

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */ 
public class BoundedDemo {
	public static void main(String[] args) {
		
		Sample<A> s1 = new Sample<A>(new A());
		A a = s1.getOb();
		a.show1();
		
		Sample<B> s2 = new Sample<B>(new B());
		B b = s2.getOb();
		b.show1();
		b.show2();
		
		Sample<C> s3 = new Sample<C>(new C());
		C c = s3.getOb();
		c.show1();
		c.show2();
		c.show3();
		
	//	Sample<String> s4 = new Sample<String>("Welcome");

	}
}
