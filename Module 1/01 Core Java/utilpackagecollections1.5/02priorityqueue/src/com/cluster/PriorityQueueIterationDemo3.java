package com.cluster;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class MyComparator implements Comparator<Integer>
{
	 public int compare(Integer one, Integer two) 
	 {
		    // compare the second object with the first object for descending order 
		    return two.compareTo(one);
	  }
}

class PriorityQueueIterationDemo3 {
	public static void main(String[] args) {
		
		int[] ia = { 1, 5, 3, 7, 6, 9, 8 }; 
		
		// use ascending order or natural order
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(); 
		
		for (int x : ia)
		{
			pq1.offer(x);
		}
		
		// next() of Iterator gives values in an undefined order
		Iterator<Integer> itr1 = pq1.iterator();
		System.out.print("Accessing values using next() of iterator: ");
		while (itr1.hasNext()) {
			int i = itr1.next();
			System.out.print(i +" ");
			
		}

		System.out.println();
		
		System.out.print("Accessing values using for each loop: ");
		for (int i : pq1) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		
		// Always use poll() to access the values based on priority
		System.out.print("Accessing values using poll() ");
		Iterator<Integer> itr2 = pq1.iterator();
		while (itr2.hasNext()) {
			int i = pq1.poll();
			System.out.print( i + " ");
		}
		
		System.out.println();
		
		System.out.println("All values after poll in pq1: " + pq1);
		
		
		
		// use comparator to order in descending 
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10, new MyComparator()); 
		
		for (int x : ia)
		{
			pq2.offer(x);
		}

		System.out.print("Accessing values using poll() ");
		Iterator<Integer> itr3 = pq2.iterator();
		while (itr3.hasNext()) {
			int i = pq2.poll();
			System.out.print( i + " ");
		}
		
	}
}