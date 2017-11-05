package com.cluster;

import java.util.PriorityQueue;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class PriorityQueueDemo1 {
	public static void main(String[] args) {

		// without generics
		PriorityQueue pq = new PriorityQueue();
		
		// add values
		pq.add(1);
		pq.add(5);
		pq.add(3);
		pq.add(4);
		pq.add(6);
		pq.add(2);
		
		// cannot add dissimilar value
		pq.add("A");
		
		// cannot add null value
	//	pq.add(null);

		// Display all values
		System.out.println("All values:" + pq);

		// the number of elements in this collection
		int size = pq.size();
		System.out.println("The size is:" + size);

		// checks this queue contains the specified element.
		boolean b = pq.contains(5);
		System.out.println("The value is present:" + b);

		// remove a particular value or element
		pq.remove(4);
		System.out.println("All values after remove:" + pq);

		// clear all values in collection
		pq.clear();
		System.out.println("All values after clear:" + pq);
	}
}
