package com.cluster;

// Program for isAlive(), sleep() & join()  method

class Fun implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Run by " + Thread.currentThread().getName()+"\t" + i);
			/*try 
			{
				Thread.sleep(500);
			} 
			catch (InterruptedException e) 
			{
				System.out.println("interruption happened");
			}*/
		}
	}
}

public class Ex7IsAliveSleepAndJoinDemo 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Begin main");
		Thread t1 = new Thread(new Fun(), "ClusterThread");
		System.out.println("Child Thread Before start " + t1.isAlive()); // prints false 
		t1.start();
		System.out.println("Child Thread After start " + t1.isAlive());
		/*try
		{
			Thread.sleep(5000);
			//t1.join();
		} 
		catch (InterruptedException e) 
		{
		}*/
		System.out.println("Child Thread after execution " + t1.isAlive());
		System.out.println("End main");
	}
}
