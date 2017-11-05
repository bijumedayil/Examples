package com.cluster;

import java.util.LinkedList;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class LinkedListDemo1 {
	
	public static void main(String[] args) {
		
		// create a LinkedList
		LinkedList list = new LinkedList();

		System.out.println("Initial size of LinkedList before adding elements: " + list.size());
		System.out.println("LinkedList is empty before adding values: "	+ list.isEmpty());
		System.out.println("Contents of LinkedList before adding values: " + list);

		// adding elements or values to the LinkedList
		list.add("C");
		list.add("A");
		list.add("E");
		list.add("B");
		list.add("D");
		list.add("F");

		// can add duplicates and null values in LinkedList
		list.add("A");
		list.add(null);

		System.out.println("Size of LinkedList after adding elements: "	+ list.size());
		System.out.println("LinkedList is empty after adding values: "	+ list.isEmpty());

		// display the contents of LinkedList
		System.out.println("Contents of LinkedList after adding values: " + list);

		// check whether an element is present or not
		boolean b1 = list.contains("E");
		System.out.println("Value E is present: " + b1);

		boolean b2 = list.contains("R");
		System.out.println("Value R is present: " + b2);

		// Remove an element from the LinkedList
		list.remove("B");

		System.out.println("Size of LinkedList after deletion: " + list.size());
		System.out.println("Contents of LinkedList after deletion: " + list);

		// delete all the elements in the LinkedList
		list.clear();
		System.out.println("Size of LinkedList after clearing: " + list.size());
		System.out.println("Contents of LinkedList after clearing: " + list);
	}
}
