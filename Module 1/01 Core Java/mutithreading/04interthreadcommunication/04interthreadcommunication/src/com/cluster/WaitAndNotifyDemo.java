package com.cluster;

class Hello 
{
	 int x;
	 boolean flag=false;
	 synchronized public void push(int x)
	 {
		 if(flag)
		 {
			 try
			 {
				 wait();
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
		 }
		 this.x=x;
		 System.out.println(x +"is pushed");
		 flag=true;
		 notify();
	 }
	synchronized public void pop()
	 {
		if(!flag)
		 {
			try
			 {
				wait();
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
		 }
		 System.out.println(x +"is poped");
		 flag=false;
		 notify();
		 
	 }

}


class Producer implements Runnable
{
	Hello h;
	Producer(Hello h)
	{
		this.h = h;
	}
	public void run()
	{
		int a=1;
		 for(int i=0;i<7;i++)
		 {
			 h.push(a++);
		 }
	}
}

class Consumer implements Runnable
{
	Hello h;
	Consumer(Hello h)
	{
		this.h = h;
	}
	public void run()
	{
		int a=1;
		for(int i=0;i<7;i++)
		 {
			h.pop();
		 }
	}
}


public class WaitAndNotifyDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		Hello h = new Hello();
		Producer p = new Producer(h);
		Consumer c = new Consumer(h);
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
		System.out.println("End main");
		
	}
}
