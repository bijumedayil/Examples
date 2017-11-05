package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// program to join child thread to another child thread
class X implements Runnable
{
	public void run()
	{
		System.out.println("Begin X");
		System.out.println("Inside X thread");
		Y y = new Y();
		Thread t = new Thread(y);
		t.start();
		try 
		{
			t.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("End X");
	}
}

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Y implements Runnable
{
	public void run()
	{
		System.out.println("Begin Y");
		System.out.println("Inside Y thread");
		System.out.println("End Y");
	}
}

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Ex9JoinChildThreadToChildThreadDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		X x = new X();
		Thread t = new Thread(x);
		t.start();
		
		try 
		{
			t.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("End main");
	}
}
