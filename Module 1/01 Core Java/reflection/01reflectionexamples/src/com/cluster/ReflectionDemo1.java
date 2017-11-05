package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Test {
	int x;
	int y;

	Test() 
	{
	}

	Test(int a, int b)
	{
		x = a;
		y = b;
	}
	void m1()
	{
		System.out.println("Value of x & y is" + x + y);
	}

}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ReflectionDemo1 {
	public static void main(String[] args) {
	
		Test t = new Test(10, 20);
		System.out.println("Value of t is " + t);
		System.out.println("Value of x & y in t is " + t.x + "\t" + t.y);
		Class c = t.getClass();
		System.out.println("Value of c is " + c);

		try {
			Test t1 = (Test) c.newInstance();
			System.out.println("Value of t1 is " + t1);
			System.out.println("Value of x & y in t1 is " + t1.x + "\t" + t1.y);
		}

		catch (Exception e) {
			System.out.println("Exception caught" + e);
		}

	}

}
