package com.cluster;

import java.util.HashMap;
import java.util.TreeMap;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class TreeMapDemo2 {
	public static void main(String[] args) {
		// Create a TreeMap
		TreeMap customerMap = new TreeMap();

		// Add key/value to the TreeMap
		//TreeMap stores keys in sorted order
		customerMap.put("Kumar", new Double(11.11));
		customerMap.put("Ravi", new Double(22.22));
		customerMap.put("Amogh", new Double(33.33));
		customerMap.put("Vinay", new Double(44.44));
		customerMap.put("Balaji", new Double(55.55));

		System.out.println(customerMap);
	}
}
