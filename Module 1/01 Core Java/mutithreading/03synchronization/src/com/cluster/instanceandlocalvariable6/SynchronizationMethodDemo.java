package com.cluster.instanceandlocalvariable6;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// Effect of multiple thread accessing instance variable & local variable  
class A implements Runnable
{
	Hello h;
	A(Hello h)
	{
		this.h = h;
	}
	public void run()
	{
		h.m1();
	}
}

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class B implements Runnable
{
	Hello h;
	B(Hello h)
	{
		this.h = h;
	}
	public void run()
	{
		h.m1();
	}
}

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class C implements Runnable
{
	Hello h;
	C(Hello h)
	{
		this.h = h;
	}
	public void run()
	{
		h.m1();
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Hello 
{
	 int x = 0; // all threads A,B, and C will use same copy of instance variable
	public  void m1()
	{
		int y = 0; // all threads A,B, and C will have their own copy of local variable
		x++;
		y++;
		System.out.println("Value of instance variable X by "+ Thread.currentThread().getName()+ "\t " + x);
		System.out.println("Value of local variable Y by "+ Thread.currentThread().getName()+ "\t" + y);
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SynchronizationMethodDemo
{
	public static void main(String[] args) {
		
		System.out.println("Begin main");
		Hello h = new Hello();
		A a = new A(h);
		B b = new B(h);
		C c = new C(h);
		
		Thread t1 = new Thread(a,"Athread");
		Thread t2 = new Thread(b,"BThread");
		Thread t3 = new Thread(c,"CThread");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("End main");
		
	}
}