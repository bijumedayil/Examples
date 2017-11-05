package com.cluster;

import java.util.ArrayDeque;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ArrayDequeDemo1 {
	public static void main(String[] args) {

		// without generics
		ArrayDeque adq = new ArrayDeque();
		
		// add values
		adq.add(1);
		adq.add(5);
		adq.add(3);
		adq.add(4);
		adq.add(6);
		adq.add(2);
		
		// can add dissimilar value
		adq.add("A");
		
		// cannot add null value
	//	adq.add(null);

		// Display all values
		System.out.println("All values:" + adq);

		// the number of elements in this collection
		int size = adq.size();
		System.out.println("The size is:" + size);

		// checks this queue contains the specified element.
		boolean b = adq.contains(5);
		System.out.println("The value is present:" + b);

		// remove a particular value or element
		adq.remove(4);
		System.out.println("All values after remove:" + adq);

		// clear all values in collection
		adq.clear();
		System.out.println("All values after clear:" + adq);
	}
}
