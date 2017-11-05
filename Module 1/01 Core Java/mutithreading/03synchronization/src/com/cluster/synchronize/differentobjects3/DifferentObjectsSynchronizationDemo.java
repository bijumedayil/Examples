package com.cluster.synchronize.differentobjects3;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// synchronizing two different objects with two separate threads
class A implements Runnable
{
	
	public void run()
	{
		Hello h1 = new Hello(); // A thread having its own h1 object
		h1.m1();
	}
}

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class B implements Runnable
{
	
	public void run()
	{
		Hello h2 = new Hello(); // B thread having its own h2 object
		h2.m1();
	}
}


 /**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Hello 
{
	public synchronized void m1()
	{
		for (int i = 1; i<=5; i++)
		{
			try 
			{
				System.out.println("Begin of for loop by "+ Thread.currentThread().getName()+ "\t" + i);
				Thread.sleep(500);
				System.out.println("End of for loop by "+ Thread.currentThread().getName());
				
			} 
			catch (InterruptedException e) 
			{
				System.out.println("Inside exception");
			}
		}
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class DifferentObjectsSynchronizationDemo
{
	public static void main(String[] args)
	{
		System.out.println("Begin main");

		A a = new A();
		B b = new B();
		
		Thread t1 = new Thread(a,"Athread");
		Thread t2 = new Thread(b,"BThread");
		t1.start();
		t2.start();
		System.out.println("End main");
	}
}