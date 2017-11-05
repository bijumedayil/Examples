package com.cluster;

import java.util.Stack;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class StackDemo2 {
	public static void main(String[] args) {

		// create an object of stack
		Stack stack = new Stack();
		
		// adding values to stack
		stack.push(new Integer(1));
		stack.push(new Integer(3));
		stack.push(new Integer(2));
		stack.push(new Integer(5));
		stack.push(new Integer(4));
		
		System.out.println("The elements in stack are: " + stack);
		
		// peek() retrieves the object at the top of the stack without removing it from the stack
		System.out.println("Element at the top of stack is: " + stack.peek());
		
		// pop() retrieves the object at the top of the stack and removes it from the stack
		System.out.println("The element popped out of the stack is: " + stack.pop());
		
		System.out.println("The elements in stack after popping: " + stack);

		
		

	}

}
