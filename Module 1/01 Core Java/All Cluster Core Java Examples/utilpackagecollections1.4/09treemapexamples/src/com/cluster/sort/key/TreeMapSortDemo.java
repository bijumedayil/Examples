package com.cluster.sort.key;

import java.util.TreeMap;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class TreeMapSortDemo {
	public static void main(String[] args) {
		
		// Create a TreeMap to sort in natural order
		TreeMap customerMap1 = new TreeMap();
		customerMap1.put("Kumar", new Double(11.11));
		customerMap1.put("Ravi", new Double(22.22));
		customerMap1.put("Amogh", new Double(33.33));
		customerMap1.put("Vinay", new Double(44.44));
		customerMap1.put("Balaji", new Double(55.55));

		System.out.println(customerMap1);

		// Create a TreeMap to sort in descending order
		TreeMap customerMap2 = new TreeMap(new MyComparator());
		customerMap2.put("Kumar", new Double(11.11));
		customerMap2.put("Ravi", new Double(22.22));
		customerMap2.put("Amogh", new Double(33.33));
		customerMap2.put("Vinay", new Double(44.44));
		customerMap2.put("Balaji", new Double(55.55));

		System.out.println(customerMap2);
	}
}
