package com.cluster;

//program to creating multiple threads and join to main thread
class P implements Runnable 
{
	public void run()
	{
		System.out.println("Inside P thread");
	}
}


class Q implements Runnable
{
	public void run()
	{
		System.out.println("Inside Q thread");
	}
}

class R implements Runnable
{
	public void run()
	{
		System.out.println("Inside R thread");
	}
}


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
