package com.cluster;

import java.util.TreeSet;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class TreeSetDemo1 {
	
	public static void main(String[] args) {
		
		// create a TreeSet
		TreeSet set = new TreeSet();

		System.out.println("Initial size of TreeSet before adding elements: "	+ set.size());
		System.out.println("TreeSet is empty before adding values: "	+ set.isEmpty());
		System.out.println("Contents of TreeSet before adding values: " + set);
		

		// adding elements or values to the TreeSet
		set.add("C");
		set.add("A");
		set.add("E");
		set.add("B");
		set.add("D");
		set.add("F");

		// cannot add duplicates, dissimilar and null values in TreeSet
	//	set.add("A");
	//	set.add(new Integer(10));
	//	set.add(null);

		System.out.println("Size of TreeSet after adding elements: " + set.size());
		System.out.println("TreeSet is empty after adding values: " + set.isEmpty());

		// display the contents of TreeSet
		System.out.println("Contents of TreeSet after adding values: " + set);

		// check whether an element is present or not
		boolean b1 = set.contains("E");
		System.out.println("Value E is present: " + b1);

		boolean b2 = set.contains("R");
		System.out.println("Value R is present: " + b2);

		// Remove an element from the TreeSet
		set.remove("B");

		System.out.println("Size of TreeSet after deletion: " + set.size());
		System.out.println("Contents of TreeSet after deletion: " + set);

		// delete all the elements in the TreeSet
		set.clear();
		System.out.println("Size of TreeSet after clearing: " + set.size());
		System.out.println("Contents of TreeSet after clearing: " + set);

	}
}
