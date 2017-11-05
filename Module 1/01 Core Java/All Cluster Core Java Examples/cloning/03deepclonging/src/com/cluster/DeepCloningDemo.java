package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Hello implements Cloneable{
	int a;
	int b;
	Test t;

	Hello(int a, int b, Test t) 
	{
		System.out.println("Inside const");
		this.a = a;
		this.b = b;
		this.t = t;
	}

	public Object clone() throws CloneNotSupportedException
	{
			Hello h = (Hello)super.clone();
			h.t = (Test)t.clone();
			return h;
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Test implements Cloneable 
{
	int x;
	int y;

	Test(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class DeepCloningDemo {
	public static void main(String[] args) {
		try 
		{
			Test t=new Test(11,22);
			Hello h1=new Hello(10,20,t);
			Hello h2=(Hello)h1.clone();
			System.out.println(t);;
			System.out.println(h1);
			System.out.println(h2);
			System.out.println(h1.t);
			System.out.println(h2.t);
			
			System.out.println("Value of x in h1.t before modification is " + h1.t.x);
			System.out.println("Value of x in h2.t before modification is " + h2.t.x);
			h1.t.x = 99;
			System.out.println("Value of x in h1.t after modification is " + h1.t.x);
			System.out.println("Value of x in h2.t after modification is " + h2.t.x);
		} 
		catch (CloneNotSupportedException e) 
		{
			System.out.println("Inside Exception " + e);
		}
	}
}
