package com.cluster.synchronize.block4;

// block level synchronization
// locking 3rd party objects

class A implements Runnable
{
	Hello h;
	A(Hello h)
	{
		this.h = h;
	}
	public void run()
	{
		synchronized (h) // h object is synchronized or locking 3rd party objects
		{
			h.m1(); 
		}
	}
}

class B implements Runnable
{
	Hello h;
	B(Hello h)
	{
		this.h = h;
	}
	public void run()
	{
		synchronized (h)  // h object is synchronized
		{
			h.m1();
		}
	}
}


 class Hello 
{
	public  void m1()
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


public class SynchronizationBlockDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		Hello h = new Hello();
		A a = new A(h);
		B b = new B(h);
		
		Thread t1 = new Thread(a,"Athread");
		Thread t2 = new Thread(b,"BThread");
		t1.start();
		t2.start();
		System.out.println("End main");
	}
}