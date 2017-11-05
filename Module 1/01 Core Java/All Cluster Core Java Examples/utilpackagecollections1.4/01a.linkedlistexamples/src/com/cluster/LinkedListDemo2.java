package com.cluster;

import java.util.LinkedList;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// Program to show inserting, reading, updating & deleting in LinkedList
public class LinkedListDemo2 {
	
	public static void main(String[] args) {
		
		// create a LinkedList
		LinkedList list = new LinkedList();

		System.out.println("Initial size of LinkedList: " + list.size());
		System.out.println("Is LinkedList empty: " + list.isEmpty());
		System.out.println("Contents of LinkedList: " + list);

		// can add duplicate, null and dissimilar elements to the LinkedList
		// add() method adds values to the end of the linked list
		list.add("C");
		list.add("A");
		list.add("E");
		list.add("B");
		list.add("D");
		list.add("F");
		
		list.add("A");
		list.add(null);
		list.add(new Integer(10));
		
		// can add an element at a specific index by using overloaded add() method
		list.add(2, "P");

		System.out.println("Size of LinkedList after additions: " + list.size());
		System.out.println("Is LinkedList empty: " + list.isEmpty());
		System.out.println("Contents of LinkedList: " + list);

		
		// Fetching a particular element from a LinkedList
		Object e1 = list.get(3);
		String s1 = (String)e1;
		
		Object e2 = list.get(5);
		String s2 = e2.toString();
		
		System.out.println("Value present at index No 3 is " + s1);
		System.out.println("Value present at index No 5 is " + s2);

		
		// replace an element at a particular index 
		list.set(1, "Q");
		System.out.println("Contents of LinkedList: " + list);


		// Remove elements from the LinkedList
		list.remove("F");
		list.remove(4);

		System.out.println("Size of LinkedList after deletions: " + list.size());
		System.out.println("Contents of LinkedList: " + list);
		
		// delete all the elements in the LinkedList
		list.clear();
		System.out.println("Size of LinkedList after clearing: " + list.size());
		System.out.println("Contents of LinkedList after clearing: " + list);
		
	}
}
