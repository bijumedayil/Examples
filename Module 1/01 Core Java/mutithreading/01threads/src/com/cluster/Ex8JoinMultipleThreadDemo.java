package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
//program to creating multiple threads and join to main thread
class P implements Runnable 
{
	public void run()
	{
		System.out.println("Inside P thread");
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Q implements Runnable
{
	public void run()
	{
		System.out.println("Inside Q thread");
	}
}

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class R implements Runnable
{
	public void run()
	{
		System.out.println("Inside R thread");
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Ex8JoinMultipleThreadDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		
		Thread t1 = new Thread(new P()); 
		Thread t2 = new Thread(new Q());
		Thread t3 = new Thread(new R());
		
		t1.start();
		t2.start();
		t3.start();
		
		try 
		{
			t1.join();
			t2.join();
			t3.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}

		System.out.println("End main");

	}

}
