package com.cluster;

import java.util.HashSet;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class HashSetDemo1 {

	public static void main(String[] args) {

		// create a HashSet
		HashSet set = new HashSet();

		System.out.println("Initial size of HashSet before adding elements: " + set.size());
		System.out.println("HashSet is empty before adding values: " + set.isEmpty());
		System.out.println("Contents of HashSet before adding values: " + set);

		// adding elements or values to the HashSet
		set.add("C");
		set.add("A");
		set.add("E");
		set.add("B");
		set.add("D");
		set.add("F");

		// cannot add duplicate values in HashSet
	//	set.add("A");
		
		// can add null values in HashSet
		set.add(null);

		System.out.println("Size of HashSet after adding elements: " + set.size());
		System.out.println("HashSet is empty after adding values: "	+ set.isEmpty());

		// display the contents of HashSet
		System.out.println("Contents of HashSet after adding values: " + set);

		// check whether an element is present or not
		boolean b1 = set.contains("E");
		System.out.println("Value E is present: " + b1);

		boolean b2 = set.contains("R");
		System.out.println("Value R is present: " + b2);

		// Remove an element from the HashSet
		set.remove("B");

		System.out.println("Size of HashSet after deletion: " + set.size());
		System.out.println("Contents of HashSet after deletion: " + set);

		// delete all the elements in the HashSet
		set.clear();
		System.out.println("Size of HashSet after clearing: " + set.size());
		System.out.println("Contents of HashSet after clearing: " + set);
	}
}
