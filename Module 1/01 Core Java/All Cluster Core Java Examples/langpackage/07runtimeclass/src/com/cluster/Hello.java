package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Hello {
	
	private static Hello h;
	
	static
	{
		System.out.println("Inside static");
		h = new Hello();
	}
	private Hello()
	{
		System.out.println("Inside const");
	}

	public static Hello getHello()
	{
		System.out.println("Inside getHello()" + h);
		return h;
	}
	
	void m1()
	{
		System.out.println("Inside m1");
	}
	
	void m2()
	{
		System.out.println("Inside m2");
	}
	
}
