package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Hello {
	/*void m1(byte z)
	{
		System.out.println("Inside m1() byte " + z);
	}
		void m1(double z)
	{
		System.out.println("Inside m1() double " + z);
	}
	void m1(int z)
	{
		System.out.println("Inside m1() int " + z);
	}
	
	*/
	
	void m1(int x, int y) // 1st preference
	{
		System.out.println("Inside m1() int " + x + y);
	}
	
	void m1(Integer x, Integer y) //  2nd preference
	{
		System.out.println("Inside m1() Integer " + x + y);
	}
	
	void m1(int... x) // 3rd preference
	{
		System.out.println("Inside m1() varargs");
	}

}
