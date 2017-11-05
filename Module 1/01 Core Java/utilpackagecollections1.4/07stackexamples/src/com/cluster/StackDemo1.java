package com.cluster;

import java.util.Stack;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class StackDemo1 {
	public static void main(String[] args) {

		// create an object of stack
		Stack stack = new Stack();
		
		System.out.println("Size of stack is: " + stack.size());
		System.out.println("Is stack empty: " + stack.isEmpty());
		System.out.println("Value in stack is: " + stack);

		// adding values to stack
		stack.push(new Integer(1));
		stack.push(new Integer(3));
		stack.push(new Integer(2));
		stack.push(new Integer(5));
		stack.push(new Integer(4));
		
		System.out.println("Size of stack is: " + stack.size());
		System.out.println("Is stack empty: " + stack.isEmpty());
		System.out.println("Value in stack is: " + stack);

		
		

	}

}
