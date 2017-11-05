package com.cluster.sort.string.comparator;

import java.util.LinkedList;
import java.util.Collections;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// sorting in descending order using interface Comparator and class Collections  
public class SortStringDescendingOrderDemo {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add("C");
		list.add("A");
		list.add("E");
		list.add("B");
		list.add("D");
		list.add("F");
		list.add("H");
		list.add("G");

		System.out.println("Values in LinkedList before sort" + list);

		// sorting in natural order
		// this sort() calls the compareTo() of the element in the list 
		Collections.sort(list);
		System.out.println("Values in LinkedList after natural sort" + list);

		
		// sorting in descending order 
		// this overloaded sort() calls the compare() of the Comparator interface
		Collections.sort(list, new MyComparator());
		System.out.println("Values in LinkedList after sorting using Comparator" + list);

	}
}
