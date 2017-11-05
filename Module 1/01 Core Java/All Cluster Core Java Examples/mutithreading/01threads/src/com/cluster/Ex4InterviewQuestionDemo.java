package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Hai implements Runnable
{
	public void run()
	{
		System.out.println("Running child thread with no argument run() method");
	//	int x = 12;
	//	run(x);
	}
	
	public void run(int a)
	{
		System.out.println("Inside overloaded run() method " + a);
	}
}

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Ex4InterviewQuestionDemo 
{
	public static void main(String[] args)
	{
		System.out.println("Begin main");
		Hai h = new Hai();
		Thread t = new Thread(h);
		System.out.println(t);
		//h.run(12); // calling overloaded run method
		//t.run(); // calling run method explicitly 
		t.start();
	//	t.start();
		System.out.println("End main");
	}
}
