package com.cluster.queue;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
//program to show FIFO queue implementation using LinkedList class
public class DemoQueue {

	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		
		// adding values to queue
		queue.insertLast(new Integer(1));
		queue.insertLast(new Integer(3));
		queue.insertLast(new Integer(2));
		queue.insertLast(new Integer(5));
		queue.insertLast(new Integer(4));

		System.out.println("**************************");
		System.out.println("value at first: " + queue.first());
		System.out.println("**************************");

		// removing values from queue (FIFO - First In First Out)
		while (!queue.isEmpty())
		{
			System.out.println("dequeueing: " + queue.deleteFirst());
		}
	}

}
