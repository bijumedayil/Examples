package com.cluster;

import java.util.ArrayList;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// Program to show how to work with primitives in collections 
public class StoringPrimitivesInArrayListDemo4 {

	public static void main(String[] args) {
		
		// create an ArrayList
		ArrayList list = new ArrayList();

		// cannot add primitives in collections
		// do boxing (convert primitive to object) and then store
		list.add(new Integer(102));
		list.add(new Integer(104));
		list.add(new Integer(101));
		list.add(new Integer(105));
		list.add(new Integer(103));

		// can add an element at a specific index by using overloaded add() method
		list.add(2, new Integer(222));

		System.out.println("Size of ArrayList after additions: " + list.size());
		System.out.println("Contents of Arraylist: " + list);

		int i = list.indexOf(new Integer(101));
		int j = list.indexOf("101");
		System.out.println("Index of Integer 101 is: " + i);
		System.out.println("Index of String 101 is: " + j);

		// Fetching a particular element from an ArrayList
		Object e1 = list.get(3);
		Integer x = (Integer) e1;

		Object e2 = list.get(5);
		Integer y = (Integer) e2;

		System.out.println("Value present at index No 3 is " + x);
		System.out.println("Value present at index No 5 is " + y);

		// replace an element at a particular index
		list.set(1, new Integer(111));
		System.out.println("Contents of ArrayList after replacing: " + list);

		// Remove elements from the ArrayList
		list.remove(new Integer(103));
		list.remove(4);

		System.out.println("Size of ArrayList after deletions: " + list.size());
		System.out.println("Contents of ArrayList: " + list);


	}

}
