package com.cluster.bulkoperation;

import java.util.ArrayList;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class BulkOperationsDemo2 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("10");
		list1.add("20");
		list1.add("30");
		list1.add("40");
		list1.add("50");
		System.out.println("Values in Original ArrayList: " + list1);

		
		ArrayList list2 = new ArrayList();
		list2.add("11");
		list2.add("22");
		list2.add("33");
		list2.add("44");
		System.out.println("Initial Values is Second ArrayList: " + list2);
		
		// Copy values from one ArrayList to another ArrayList at a specified index
		list2.addAll(2, list1); 
		System.out.println("Values in second ArrayList after adding first list: " + list2);
		
	}
}
