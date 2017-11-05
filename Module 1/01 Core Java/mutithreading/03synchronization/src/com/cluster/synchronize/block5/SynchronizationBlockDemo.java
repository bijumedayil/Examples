package com.cluster.synchronize.block5;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// block level synchronization
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
class Hello 
{
	public  void m1()// method is not synchronized. Only few statements inside the method are synchronized
	{
		System.out.println("Begin of m1 by "+ Thread.currentThread().getName());
		synchronized(this) // current object that is hello is synchronized & only statements inside the block are synchronized
		{
		for (int i = 1; i<=5; i++)
		{
			try 
			{
				System.out.println("Inside for loop of m1 by "+ Thread.currentThread().getName()+ "\t" + i);
				Thread.sleep(500);
			} 
			catch (InterruptedException e) 
			{
				System.out.println("Inside exception");
			}
		}
		System.out.println("End of m1 by "+ Thread.currentThread().getName());
		}
	}
}

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SynchronizationBlockDemo 
{
	public static void main(String[] args)
	{
		
		System.out.println("Begin main");
		Hello h = new Hello();
		A a = new A(h);
		B b = new B(h);
		
		Thread t1 = new Thread(a,"Athread");
		Thread t2 = new Thread(b,"BThread");
		t1.start();
		t2.start();
		System.out.println("End main");

	}
}
