package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// program to create a new thread by implementing interface Runnable
class MyRunnable implements Runnable
{
	public void run() // step 1 define a thread
	{
		System.out.println("Begin of child thread");
		m1();
		System.out.println("End of child thread");
	}
	
	void m1()
	{
		System.out.println("Begin of m1");
		m2();
		System.out.println("End of m1");
	}
	
	void m2()
	{
		System.out.println("Begin of m2");
		System.out.println("End of m2");
	}
}



/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Ex3ImplementsThreadDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		 MyRunnable mr = new MyRunnable(); // step 2 create an object of the class which implements Runnable 
		Thread t = new Thread(mr); // step 3 create a thread & pass the runnable object to the constructor of class Thread
		t.start(); // step 4 start the thread 
		System.out.println("End main");
	}
}
