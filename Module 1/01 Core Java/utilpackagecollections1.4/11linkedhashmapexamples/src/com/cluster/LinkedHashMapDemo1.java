package com.cluster;

import java.util.LinkedHashMap;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class LinkedHashMapDemo1 {
	public static void main(String[] args) {

		// Create a LinkedHashMap
		LinkedHashMap customerMap = new LinkedHashMap();

		// Add key/value to the LinkedHashMap
		// LinkedHashMap stores keys in unordered way
		customerMap.put("Kumar", new Double(11.11));
		customerMap.put("Ravi", new Double(22.22));
		customerMap.put("Amogh", new Double(33.33));
		customerMap.put("Vinay", new Double(44.44));
		customerMap.put("Balaji", new Double(55.55));

		// can add null key in LinkedHashMap
		customerMap.put(null, new Double(66.66));

		// can add different type of key in LinkedHashMap
		customerMap.put(new Integer(10), new Double(99.99));

		// can add different type of value in LinkedHashMap
		customerMap.put("Praveen", "PRAVEEN");

		// can add null value in LinkedHashMap
		customerMap.put("Hello", null);
		
		// can add duplicate value in LinkedHashMap
		customerMap.put("Sunil", new Double(44.44));

		System.out.println(customerMap);

	}

}
