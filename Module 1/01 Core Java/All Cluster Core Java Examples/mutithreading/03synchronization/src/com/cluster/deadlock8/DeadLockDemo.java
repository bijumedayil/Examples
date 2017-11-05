package com.cluster.deadlock8;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class A {
	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered A.foo");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("A Interrupted");
		}

		System.out.println(name + " trying to call B.m2()");
		b.m2();
				
	}

	synchronized void m1() {
		System.out.println("Inside A.m1");
	}
}

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class B {
	synchronized void bar(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered B.bar");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("B Interrupted");
		}
		System.out.println(name + " trying to call A.m1()");
		a.m1();
	}

	synchronized void m2() {
		System.out.println("Inside B.m2");
	}
}



/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class X implements Runnable
{
	A a;
	B b;
	
	X(A a, B b)
	{
		this.a = a;
		this.b = b;
	}
	public void run()
	{
		a.foo(b);
	}
}

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Y implements Runnable
{
	A a;
	B b;
	
	Y(A a, B b)
	{
		this.a = a;
		this.b = b;
	}
	public void run()
	{
		b.bar(a);
	}
}

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class DeadLockDemo 
{

	public static void main(String args[]) 
	{
		System.out.println("Begin main");
		A a = new A(); // create the two objects to be used by two different threads
		B b = new B(); 
		X x = new X(a,b); // give both the objects to the two threads 
		Y y = new Y(a,b);
		Thread t1 = new Thread(x,"AThread");
		Thread t2 = new Thread(y,"Bthread");
		t1.start();
		t2.start();
		System.out.println("End main");
		
	}

}