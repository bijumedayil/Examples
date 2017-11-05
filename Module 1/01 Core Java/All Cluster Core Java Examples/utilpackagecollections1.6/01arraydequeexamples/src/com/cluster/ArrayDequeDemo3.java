package com.cluster;

import java.util.ArrayDeque;
import java.util.Deque;

 
// using ArrayDeque as stack (LIFO)

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ArrayDequeDemo3 {
	public static void main(String[] args) {
		Deque<String> adq = new ArrayDeque<String>();
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		
		System.out.print("Popping the stack: ");
		
		while(adq.peek() != null)
		{
			String s = adq.pop();
			System.out.print(s + " ");
		}
	}
}
