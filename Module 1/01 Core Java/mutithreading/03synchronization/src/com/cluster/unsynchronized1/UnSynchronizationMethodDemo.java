package com.cluster.unsynchronized1;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
//without synchronization, two threads accessing same object 
class A implements Runnable
{
	Hello h;
	A(Hello h)
	{
		this.h = h; 
	}
	public void run()
	{
		h.m1(); // A thread using or referring to h object
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
		h.m1(); // B thread also using or referring to h object
	}
}


 /**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Hello 
{
	public void m1()
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
public class UnSynchronizationMethodDemo
{
	public static void main(String[] args)
	{
		System.out.println("Begin main");
		Hello h = new Hello(); // create the object of h 
		A a = new A(h); //Now pass the reference of h object to both A & B threads
		B b = new B(h);
		
		Thread t1 = new Thread(a,"Athread");
		Thread t2 = new Thread(b,"BThread");
		t1.start();
		t2.start();
		System.out.println("End main");
	}
}