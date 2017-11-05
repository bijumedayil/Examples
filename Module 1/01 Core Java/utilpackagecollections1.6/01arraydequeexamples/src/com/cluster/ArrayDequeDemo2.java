package com.cluster;

import java.util.ArrayDeque;
import java.util.Deque;

// using ArrayDeque as double ended queue 

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ArrayDequeDemo2 {
	public static void main(String[] args) {
		Deque<Integer> adq = new ArrayDeque<Integer>();

		//use offerFirst(), peekFirst(), pollFirst() methods to work with front end of queue
		// add values to front end of the queue
		adq.offerFirst(10);
		adq.offerFirst(20);
		adq.offerFirst(30);
		adq.offerFirst(40);
		adq.offerFirst(50);
		System.out.println("All values: " + adq);

		// get head from front end of the queue but does not remove
		int x = adq.peekFirst();
		System.out.println("Head of queue from front end: " + x);

		// remove head from front end of the queue
		int a = adq.pollFirst();
		System.out.println("Head of queue from front end: " + a);

		// remove head from front end of the queue
		a = adq.pollFirst();
		System.out.println("Head of queue from front end: " + a);

		System.out.println("All values after poll: " + adq);

		//use offerLast(), peekLast(), pollLast() methods to work with tail end of queue
		// add values to rear end of the queue
		adq.offerLast(11);
		adq.offerLast(22);
		adq.offerLast(33);
		adq.offerLast(44);
		
		System.out.println("All values: " + adq);

		// get head from rear end of the queue
			int y = adq.peekLast();
		System.out.println("Head of queue from rear end: " + y);

		// remove head from rear end of the queue
		a = adq.pollLast();
		System.out.println("Head of queue from rear end: " + a);

		// remove head from rear end of the queue
		a = adq.pollLast();
		System.out.println("Head of queue from rear end: " + a);

		System.out.println("All values after poll: " + adq);

	}

}
