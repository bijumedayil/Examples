package com.cluster.search.string;

import java.util.HashSet;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SearchStringDemo {

	public static void main(String[] args) {

		// create an HashSet
		HashSet set = new HashSet();

		// adding elements or values to the HashSet
		set.add("Chetan");
		set.add("Amar");
		set.add("Ravi");
		set.add("Kumar");
		set.add("Amogh");
		set.add("Vinay");

		System.out.println("Vaues present in HashSet" + set);

		// hashing provides very fast searches
		if (set.contains("Ravi")) {
			System.out.println("Value is present");
		} else {
			System.out.println("Value is not present");
		}
	}
}
