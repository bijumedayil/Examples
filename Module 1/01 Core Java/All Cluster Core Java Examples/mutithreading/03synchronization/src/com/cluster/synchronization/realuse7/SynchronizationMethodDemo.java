package com.cluster.synchronization.realuse7;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// synchronization is done to protect data when multiple threads are trying to use the same data
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
	 int balance = 0;
	public synchronized void m1()
	{
		for (int i = 0; i < 5; i++) 
		{
			try 
			{
				int x = balance ;
				Thread.sleep(500);
				balance = x + 1 ;  // manipulating instance variable
				System.out.println("Value of balance by "+ Thread.currentThread().getName()+ "\t " + balance);
			} 
			catch (Exception e) 
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
public class SynchronizationMethodDemo
{
	public static void main(String[] args) {
		
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