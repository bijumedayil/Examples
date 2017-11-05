package com.cluster.search;

import java.util.ArrayList;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SearchStringDemo1 {

	public static void main(String[] args) {

		// create an ArrayList
		ArrayList list = new ArrayList();

		// adding elements or values to the ArrayList
		list.add("C");
		list.add("A");
		list.add("E");
		list.add("B");
		list.add("D");
		list.add("F");

		System.out.println("Vaues present in ArrayList" + list);

		if (list.contains("B")) {
			System.out.println("Value is present");
		} else {
			System.out.println("Value is not present");
		}
	}
}
