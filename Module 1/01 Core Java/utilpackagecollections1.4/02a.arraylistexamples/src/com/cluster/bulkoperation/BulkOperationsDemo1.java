package com.cluster.bulkoperation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// Program to copy values from one data structure to another data structure
public class BulkOperationsDemo1 {

	public static void main(String[] args) {
		
		// create ArrayList and store values
		ArrayList list1 = new ArrayList();
		list1.add("10");
		list1.add("20");
		list1.add("30");
		list1.add("40");
		list1.add("50");
		System.out.println("Values in Original ArrayList" + list1);
		
		// Copy values from one ArrayList to another ArrayList 
	/*	ArrayList list2 = new ArrayList();
		list2.add("11");
		list2.add("22");
		list2.addAll(list1);
		list2.add("33");
		list2.add("44");
		System.out.println("Values in new ArrayList" + list2);		
	*/	
		//Copy values from array structure to linked list structure
	/*	LinkedList list3 = new LinkedList();
		list3.add("11");
		list3.add("22");
		list3.addAll(list1);
		list3.add("33");
		list3.add("44");
		System.out.println("Values in LinkedList" + list3);	
	*/ 		
		
		// Copy values from array structure to tree structure
	/*	TreeSet set = new TreeSet();
		set.add("11");
		set.add("22");
		set.addAll(list1);
		set.add("33");
		set.add("44");
		System.out.println("Values in TreeSet" + set);
	*/
		
	}
}
