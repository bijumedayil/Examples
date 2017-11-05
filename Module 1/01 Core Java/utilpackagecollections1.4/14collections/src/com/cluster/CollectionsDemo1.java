package com.cluster;

import java.util.ArrayList;
import java.util.Collections;

// Collections class supports various algorithms like sorting, shuffling, reversing etc 

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class CollectionsDemo1 {
	public static void main(String[] args) {
	
		ArrayList list = new ArrayList();

		list.add("C");
		list.add("A");
		list.add("E");
		list.add("B");
		list.add("D");
		list.add("F");
		list.add("H");
		list.add("G");
		
		System.out.println("Values in ArrayList before sort: "+list);
		
		Collections.sort(list);
		System.out.println("Values in ArrayList after sort: "+list);
		
		Collections.reverse(list);
		System.out.println("Values in ArrayList after reversing: "+list);
		
		Collections.shuffle(list);
		System.out.println("Values in ArrayList after shuffling: "+list);
		
		System.out.println("Minimum "+ Collections.min(list));
		System.out.println("Maximum "+ Collections.max(list));

	}
}
