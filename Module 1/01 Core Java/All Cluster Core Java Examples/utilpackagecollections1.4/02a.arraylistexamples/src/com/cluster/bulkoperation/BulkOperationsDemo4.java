package com.cluster.bulkoperation;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// program to compare value stored in two different data structures
public class BulkOperationsDemo4 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("10");
		list1.add("20");
		list1.add("30");
		list1.add("40");
		list1.add("50");
		System.out.println("Values in ArrayList: " + list1);

		
		LinkedList list2 = new LinkedList();
		list2.add("11");
		list2.add("22");
		list2.add("33");
		list2.add("10");
		list2.add("20");
		list2.add("30");
		list2.add("40");
		list2.add("50");
		list2.add("44");
		list2.add("55");
		System.out.println("Values is LinkedList: " + list2);
		
		
	
		// checks whether the LinkedList contains the value of the specified collection 
	/*	boolean b = list2.containsAll(list1);
		System.out.println("LinkedList contains all values of ArrayList: " + b);
	*/
		
		// removes all elements in the LinkedList that are present in the specified collection
	/*	list2.removeAll(list1);
		System.out.println("Values in LinkedList after removing values of ArrayList: " + list2);
	*/
		
		// retains all the values in the LinkedList of the specified collection
	/*	list2.retainAll(list1);
		System.out.println("Values in LinkedList after retaining values of ArrayList: " + list2);
	*/

	}

}
