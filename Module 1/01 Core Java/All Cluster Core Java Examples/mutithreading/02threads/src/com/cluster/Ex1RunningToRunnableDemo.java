package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// program to show how a thread moves from running to runnable
class A extends Thread 
{
	
	public void run()
	{
		System.out.println("Begin A thread");
		for (int i = 0; i < 50; i++) 
		{
				System.out.println("From A thread i = " + i);
		}
		System.out.println("End A thread");
	}
}


class B extends Thread
{
	public void run()
	{
		System.out.println("Begin B thread");
		for (int j = 0; j < 50; j++) 
		{
				System.out.println("From B thread j = " + j);
		}
		System.out.println("End B thread");
	}
}

class C extends Thread
{
	public void run()
	{
		System.out.println("Begin C thread");
		for (int k = 0; k < 50; k++) 
		{
				System.out.println("From C thread k = " + k);
		}
		System.out.println("End C thread");
	}
}

public class Ex1RunningToRunnableDemo 
{
	public static void main(String[] args)
	{
		System.out.println("Begin main>>>>>>>>>>>>>>");

		A t1 = new A(); 
		B t2 = new B();
		C t3 = new C();
		
		t1.start(); 
		t2.start();
		t3.start();
		
		
		System.out.println("End main>>>>>>>>>>>>>>");
	}
}
