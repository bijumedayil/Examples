package com.cluster.stack;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
//program to show FILO stack implementation using LinkedList class
public class DemoStack {

	public static void main(String[] args) {

		MyStack stack = new MyStack();
		
		// adding values to stack
		stack.push(new Integer(1));
		stack.push(new Integer(3));
		stack.push(new Integer(2));
		stack.push(new Integer(5));
		stack.push(new Integer(4));

		System.out.println("**************************");
		System.out.println("value at top: " + stack.top());
		System.out.println("**************************");

		// removing values from stack (FILO - First In Last Out)
		while (!stack.isEmpty())
		{
			System.out.println("poping: " + stack.pop());
		}
	}

}
