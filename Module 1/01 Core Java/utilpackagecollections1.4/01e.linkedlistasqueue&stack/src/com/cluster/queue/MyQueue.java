package com.cluster.queue;

import java.util.LinkedList;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class MyQueue {

	private LinkedList list = new LinkedList();

	// adding values to rear end
	public void insertLast(Object item) {
		System.out.println("enqueueing: " + item);
		list.addLast(item);
	}

	// removing values from front end
	public Object deleteFirst() {
		return list.removeFirst();
	}

	// getting the first value in the queue
	public Object first() {
		return list.getFirst();
	}

	// finding the size of the queue
	public int size() {
		return list.size();
	}

	// finding whether queue is empty
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
