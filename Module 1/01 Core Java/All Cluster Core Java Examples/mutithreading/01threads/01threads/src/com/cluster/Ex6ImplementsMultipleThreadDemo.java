package com.cluster;

//program to name a thread and creating multiple threads by implementing interface Runnable
class A implements Runnable 
{
	public void run()
	{
		System.out.println("Inside one thread");
	}
}


class B implements Runnable
{
	public void run()
	{
		System.out.println("Inside two thread");
	}
}

class C implements Runnable
{
	public void run()
	{
		System.out.println("Inside three thread");
	}
}


public class Ex6ImplementsMultipleThreadDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		
		
		// 1 Approach
		/*Thread t1 = new Thread(new A()); // create a thread
		Thread t2 = new Thread(new B());
		Thread t3 = new Thread(new C());
		t1.setName("AThread"); // name the thread
		t2.setName("BThread");
		t3.setName("CThread");*/
		
		// 2 Approach
		Thread t1 = new Thread(new A(), "AThread"); // create and name the thread
		Thread t2 = new Thread(new B(), "BThread");
		Thread t3 = new Thread(new C(), "CThread");
		
		System.out.println("Child thread " + t1);
		System.out.println("Child thread " + t2);
		System.out.println("Child thread " + t3);
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("End main");

	}

}
