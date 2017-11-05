package com.cluster.stack;

import java.util.LinkedList;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class MyStack {
	private LinkedList list = new LinkedList();

	// adding values on top
	public void push(Object item) {
		System.out.println("pushing: " + item);
		list.addFirst(item);
	}

	// removing values from top
	public Object pop() {
		return list.removeFirst();
	}

	// getting the top value of the stack
	public Object top() {
		return list.getFirst();
	}

	// finding the size of the stack
	public int size() {
		return list.size();
	}

	// finding whether stack is empty
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
