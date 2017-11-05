package com.cluster;

import java.util.LinkedHashSet;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class LinkedHashSetDemo1 {

	public static void main(String[] args) {

		// create a LinkedHashSet
		LinkedHashSet set = new LinkedHashSet();

		System.out.println("Initial size of LinkedHashSet before adding elements: " + set.size());
		System.out.println("LinkedHashSet is empty before adding values: " + set.isEmpty());
		System.out.println("Contents of LinkedHashSet before adding values: " + set);

		// adding elements or values to the LinkedHashSet
		set.add("C");
		set.add("A");
		set.add("E");
		set.add("B");
		set.add("D");
		set.add("F");

		// cannot add duplicate values in LinkedHashSet
	//	set.add("A");
		
		// can add null values in LinkedHashSet
		set.add(null);

		System.out.println("Size of LinkedHashSet after adding elements: " + set.size());
		System.out.println("LinkedHashSet is empty after adding values: "	+ set.isEmpty());

		// display the contents of LinkedHashSet
		System.out.println("Contents of LinkedHashSet after adding values: " + set);

		// check whether an element is present or not
		boolean b1 = set.contains("E");
		System.out.println("Value E is present: " + b1);

		boolean b2 = set.contains("R");
		System.out.println("Value R is present: " + b2);

		// Remove an element from the LinkedHashSet
		set.remove("B");

		System.out.println("Size of LinkedHashSet after deletion: " + set.size());
		System.out.println("Contents of LinkedHashSet after deletion: " + set);

		// delete all the elements in the LinkedHashSet
		set.clear();
		System.out.println("Size of LinkedHashSet after clearing: " + set.size());
		System.out.println("Contents of LinkedHashSet after clearing: " + set);
	}
}
