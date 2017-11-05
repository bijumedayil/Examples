package com.cluster;

import java.util.ArrayList;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// Program to show Simple Arraylist Demo
public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		// create an ArrayList
		ArrayList list = new ArrayList();

		System.out.println("Initial size of ArrayList before adding elements: "	+ list.size());
		System.out.println("ArrayList is empty before adding values: " + list.isEmpty());
		System.out.println("Contents of ArrayList before adding values: " + list);

		// adding elements or values to the ArrayList
		list.add("C");
		list.add("A");
		list.add("E");
		list.add("B");
		list.add("D");
		list.add("F");

		// can add duplicates and null values in ArrayList
		list.add("A");
		list.add(null);

		System.out.println("Size of ArrayList after adding elements: "	+ list.size());
		System.out.println("ArrayList is empty after adding values: "	+ list.isEmpty());

		// display the contents of ArrayList
		System.out.println("Contents of ArrayList after adding values: " + list);

		// check whether an element is present or not
		boolean b1 = list.contains("E");
		System.out.println("Value E is present: " + b1);

		boolean b2 = list.contains("R");
		System.out.println("Value R is present: " + b2);

		// Remove an element from the ArrayList
		list.remove("B");

		System.out.println("Size of ArrayList after deletion: " + list.size());
		System.out.println("Contents of ArrayList after deletion: " + list);

		// delete all the elements in the ArrayList
		list.clear();
		System.out.println("Size of ArrayList after clearing: " + list.size());
		System.out.println("Contents of ArrayList after clearing: " + list);
	}

}
