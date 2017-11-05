package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// program to show priority 
class P extends Thread 
{
	
	public void run()
	{
		System.out.println("Begin P thread");
		for (int i = 0; i < 5; i++) 
		{
				System.out.println("From P thread i = " + i);
		}
		System.out.println("End P thread");
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Q extends Thread
{
	public void run()
	{
		System.out.println("Begin Q thread");
		for (int j = 0; j < 5; j++) 
		{
				System.out.println("From Q thread j = " + j);
		}
		System.out.println("End Q thread");
	}
}



/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Ex2PriorityDemo 
{
	public static void main(String[] args)
	{
		System.out.println("Begin main>>>>>>>>>>>>>");

		P t1 = new P(); 
		Q t2 = new Q();
		
		// get the current priority
		System.out.println("Current priority of thread P is " + t1.getPriority());
		System.out.println("Current priority of thread Q is " + t2.getPriority());
		
		// change priority
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start(); 
		t2.start();
		System.out.println("End main>>>>>>>>>>>>>>>");
	}
}
