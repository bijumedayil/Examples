package com.cluster;

// program to name a thread and creating multiple threads by extending class Thread
class One extends Thread 
{
	One()
	{
		
	}
	One(String name)
	{
		super(name); // invoke super class constructor
	}
	
	public void run()
	{
		System.out.println("Inside one thread");
	}
}


class Two extends Thread
{
	Two()
	{
		
	}
	Two(String name)
	{
		super(name);
	}
	public void run()
	{
		System.out.println("Inside two thread");
	}
}

class Three extends Thread
{
	Three()
	{
		
	}
	Three(String name)
	{
		super(name);
	}
	
	public void run()
	{
		System.out.println("Inside three thread");
	}
}

public class Ex5ExtendsMultipleThreadDemo 
{
	public static void main(String[] args)
	{
		System.out.println("Begin main");
		// 1 Approach 
		/*One t1 = new One();  // create the thread
		Two t2=  new Two();
		Three t3 = new Three();
		t1.setName("FirstThread"); // name the thread
		t2.setName("SecondThread");
		t3.setName("ThirdThread");*/
		
		// 2 Approach 
		One t1 = new One("FirstThread"); // create and name the thread
		Two t2 = new Two("SecondThread");
		Three t3 = new Three("ThirdThread");
		
		System.out.println("Child thread " + t1);
		System.out.println("Child thread " + t2);
		System.out.println("Child thread " + t3);
		
		t1.start(); // start the thread
		t2.start();
		t3.start();
		System.out.println("End main");
	}
}
