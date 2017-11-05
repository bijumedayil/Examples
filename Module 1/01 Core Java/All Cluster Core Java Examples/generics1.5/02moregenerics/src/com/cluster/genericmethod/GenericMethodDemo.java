package com.cluster.genericmethod;


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

//Hello is not a generic class 

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Hello
{
	// 	m1 is a generic method
	public <T extends A> void m1(T t)
	{
		t.show1();
	}
}

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class GenericMethodDemo {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.m1(new A());
	//	h.m1("Cluster");
	//	h.m1(10);
	}

}
