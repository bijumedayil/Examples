package com.cluster.wildcard;

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
  class Hello {
	 // unbounded
 	void m1(Sample<?> t)
 	{
 		A a = t.getOb();
 		a.show1();
 	}
 	// A and anything which extends A
 	// extends is UPPER BOUND
 	void m2(Sample<? extends A> t)
 	{
 		A a = t.getOb();
 		a.show1();
 	}
 	// B and anything which is super to B
 	// super is LOWER BOUND
 	void m3(Sample<? super B> t)
 	{
 		A a = t.getOb();
 		a.show1();
 	}
 }

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */ 
public class WildCardDemo {
	public static void main(String[] args) {
		
		Sample<A> s1 = new Sample<A>(new A());
		
		Sample<B> s2 = new Sample<B>(new B());
		
		Sample<C> s3 = new Sample<C>(new C());
		
		Hello h  = new Hello();
		h.m1(s1);
		h.m1(s2);
		h.m1(s3);
		
		h.m2(s1); 
		h.m2(s2);
		h.m2(s3);
		
		h.m3(s1);
		h.m3(s2);
//		h.m3(t3);// C type is not allowed

	}
}
