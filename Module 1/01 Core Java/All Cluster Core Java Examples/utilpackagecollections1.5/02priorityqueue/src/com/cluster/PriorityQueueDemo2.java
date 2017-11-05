package com.cluster;

import java.util.PriorityQueue;


// demo for offer(), peek(), poll()

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */ 
public class PriorityQueueDemo2 {
	public static void main(String[] args) {

		// with generics
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		// use offer() to add values
		
		pq.offer(5);
		pq.offer(3);
		pq.offer(4);
		pq.offer(1);
		pq.offer(6);
		pq.offer(2);
		
		System.out.println("All values: " + pq);
		System.out.println("Size: " + pq.size());
		
		
		// peek will return the value from the head of the queue but does not 
		//remove the element
/*		int a = pq.peek();
		System.out.println("Head of queue: " + a);
		System.out.println("Size after after peek: " + pq.size());
		System.out.println("All values after peek: " + pq);
		
*/		// poll will return the value from the head of the queue and will remove the element
/*		int x = pq.poll();
		System.out.println("Head of queue: " + x);
		System.out.println("Size after after poll: " + pq.size());
		System.out.println("All values after poll: " + pq);
		
*/	/*	int y = pq.poll();
		System.out.println("Head of queue: " + y);
		System.out.println("Size after after poll: " + pq.size());
		System.out.println("All values after poll: " + pq);
		*/
		
	/*	int z = pq.poll();
		System.out.println("Head of queue: " + z);
		System.out.println("Size after after poll: " + pq.size());
		System.out.println("All values after poll: " + pq);
		*/

	}
}
