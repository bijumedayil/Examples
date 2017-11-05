package com.cluster.sort.integer;

import java.util.ArrayList;
import java.util.Collections;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SortIntegerDemo {
	public static void main(String[] args) {
	
		ArrayList list = new ArrayList();

		list.add(new Integer(102));
		list.add(new Integer(104));
		list.add(new Integer(101));
		list.add(new Integer(105));
		list.add(new Integer(103));
		
		System.out.println("Values in ArrayList before sort"+list);
		
		// use sort() of class Collections for sorting
		Collections.sort(list);
		System.out.println("Values in ArrayList after sort"+list);

	}
}

