package com.cluster.sort.string;

import java.util.ArrayList;
import java.util.Collections;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SortStringDemo {
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
		
		// while sorting ArrayList cannot contain dissimilar data or null value
	//	list.add(new Integer(10));
	//	list.add(null);
		
		System.out.println("Values in ArrayList before sort"+list);
		
		// use sort() of class Collections for sorting
		Collections.sort(list);
		System.out.println("Values in ArrayList after sort"+list);
				
	}
}
