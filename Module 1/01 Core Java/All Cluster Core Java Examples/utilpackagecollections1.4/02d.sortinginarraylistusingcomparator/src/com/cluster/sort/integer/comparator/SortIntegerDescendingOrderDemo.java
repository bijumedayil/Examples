package com.cluster.sort.integer.comparator;

import java.util.ArrayList;
import java.util.Collections;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// sorting in descending order using interface Comparator and class Collections  
public class SortIntegerDescendingOrderDemo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add(new Integer(102));
		list.add(new Integer(104));
		list.add(new Integer(101));
		list.add(new Integer(105));
		list.add(new Integer(103));
		

		System.out.println("Values in ArrayList before sort" + list);

		// sorting in natural order
		// this sort() calls the compareTo() of the element in the list 
		Collections.sort(list);
		System.out.println("Values in ArrayList after natural sort" + list);

		
		// sorting in descending order 
		// this overloaded sort() calls the compare() of the Comparator interface 
		Collections.sort(list, new MyComparator());
		System.out.println("Values in ArrayList after sort using Comparator" + list);

	}
}
