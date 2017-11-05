package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Ex1MainThreadDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main method");
		Thread t = Thread.currentThread(); // gets the reference to the current executing thread.
		
		System.out.println("Current Thread  is " + t);
		t.setName("Demo Thread"); // change name of the thread
		System.out.println("After name change" + t);
		
		t.setPriority(7); // change priority of the thread 
		System.out.println("After priority change" + t); 
		
		try
		{
			for (int i = 0; i < 5; i++) 
			{
				System.out.println("Value of i is " + i);
				//Thread.sleep(1000);
				t.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("main thread interuppted" + e);
		}
		
		System.out.println("End of main method");
	}
}
