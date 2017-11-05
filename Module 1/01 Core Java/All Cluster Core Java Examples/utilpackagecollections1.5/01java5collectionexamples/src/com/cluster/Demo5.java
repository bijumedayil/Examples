package com.cluster;

import java.util.HashSet;
import java.util.Set;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Demo5 {
	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();

		set.add(111);
		set.add(222);
		set.add(333);
		set.add(444);
		set.add(555);

		for (int x : set) {
			System.out.println(x);
		}

	}

}
