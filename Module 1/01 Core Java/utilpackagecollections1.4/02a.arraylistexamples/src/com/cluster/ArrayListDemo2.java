package com.cluster;

import java.util.ArrayList;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// Program to show inserting, reading, updating & deleting in ArrayList
public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		
		// create an ArrayList
		ArrayList list = new ArrayList();

		System.out.println("Initial size of ArrayList: " + list.size());
		System.out.println("Is Arraylist empty: " + list.isEmpty());
		System.out.println("Contents of Arraylist: " + list);

		// can add duplicate, null and dissimilar elements to the ArrayList
		// add() method adds values to the end of the array
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

		System.out.println("Size of ArrayList after additions: " + list.size());
		System.out.println("Is ArrayList empty: " + list.isEmpty());
		System.out.println("Contents of Arraylist: " + list);

		
		// Fetching a particular element from an ArrayList
		Object e1 = list.get(3);
		String s1 = (String)e1;
		
		Object e2 = list.get(5);
		String s2 = e2.toString();
		
		System.out.println("Value present at index No 3 is " + s1);
		System.out.println("Value present at index No 5 is " + s2);

		
		// replace an element at a particular index 
		list.set(1, "Q");
		System.out.println("Contents of ArrayList: " + list);


		// Remove elements from the ArrayList
		list.remove("F");
		list.remove(4);

		System.out.println("Size of ArrayList after deletions: " + list.size());
		System.out.println("Contents of ArrayList: " + list);
		
		// delete all the elements in the ArrayList
		list.clear();
		System.out.println("Size of ArrayList after clearing: " + list.size());
		System.out.println("Contents of ArrayList after clearing: " + list);
		
	}
}
