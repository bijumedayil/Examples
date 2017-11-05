package com.cluster;

import java.util.ArrayList;
import java.util.List;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Demo2 {
	public static void main(String[] args) {
		// generics 
		List<Integer> list = new ArrayList<Integer>();

		// autoboxing
		list.add(66);
		list.add(44);
		list.add(22);
		list.add(55);
		list.add(11);
		
		// type safety, cannot add String
		// list.add("cluster");

		// for each loop & auto unboxing
		for (int x : list) {
			System.out.println(x);
		}
	}

}
