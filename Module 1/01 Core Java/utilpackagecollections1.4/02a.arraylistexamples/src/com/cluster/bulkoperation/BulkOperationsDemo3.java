package com.cluster.bulkoperation;

import java.util.ArrayList;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class BulkOperationsDemo3 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("10");
		list1.add("20");
		list1.add("30");
		list1.add("40");
		list1.add("50");
		System.out.println("Values in First ArrayList: " + list1);

		
		ArrayList list2 = new ArrayList();
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
		System.out.println("Values is Second ArrayList: " + list2);
		
		
	
		// checks whether the ArrayList contains the value of the specified collection 
	/*	boolean b = list2.containsAll(list1);
		System.out.println("second ArrayList contains all values of first ArrayList: " + b);
	*/	
		
		// removes all elements that are present in the specified collection
	/*	list2.removeAll(list1);
		System.out.println("Values in second ArrayList after removing values of first ArrayList: " + list2);
	*/
		
		// retains the values of the specified collection
	/*	list2.retainAll(list1);
		System.out.println("Values in second ArrayList after retaining values of first ArrayList: " + list2);
	*/	
	}

}
