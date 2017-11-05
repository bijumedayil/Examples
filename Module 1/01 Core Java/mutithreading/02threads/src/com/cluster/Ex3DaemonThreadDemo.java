package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Ex3DaemonThreadDemo 
	{
    	public static void main(String[] args) throws InterruptedException 
    	{
	    	System.out.println("Begin main>>>>>>>>>>>");
	        Thread dt = new Thread(new Hello(), "dt");
	        dt.setDaemon(true); // create the daemon thread
	        dt.start(); // start the daemon thread
	        boolean b = dt.isDaemon();
	        System.out.println("This thread is a daemon thread " + dt +"\t" + b);
	        Thread.sleep(30000);
	        System.out.println("End main>>>>>>>>>>>>");
    	}
	}

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Hello implements Runnable
	{
	  public void run() 
	  {
	        while(true)
	        {
	            processSomething();
	        }
	  }
	
	  void processSomething() 
	  {
	      try 
	      {
	            System.out.println("Processing daemon thread");
	            Thread.sleep(5000);
	      } catch (InterruptedException e) 
	      {
	            e.printStackTrace();
	      }
	    }
}

