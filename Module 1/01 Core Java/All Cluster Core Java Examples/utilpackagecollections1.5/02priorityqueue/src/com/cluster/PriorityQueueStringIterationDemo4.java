package com.cluster;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class PriorityQueueStringIterationDemo4 {
	public static void main(String[] args) {

		String a[] = { "C", "A", "E", "B", "D", "F" };

		// use ascending order or natural order
		PriorityQueue<String> pq = new PriorityQueue<String>();

		for (String x : a) {
			pq.offer(x);
		}
		
		//Best way to retrieve value from a PriorityQueue: 
		System.out.print("Accessing values using poll(): "); 
		while(!pq.isEmpty())
		{
			String s = pq.poll();
			System.out.print(s + " ");
		}
		

	}
}
