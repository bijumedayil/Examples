package com.cluster;

import java.util.HashMap;
import java.util.HashMap;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class HashMapDemo2 {
	public static void main(String[] args) {
		// Create a HashMap
		HashMap customerMap = new HashMap();
		System.out.println("HashMap is empty before adding vales: "+ customerMap.isEmpty() );
		System.out.println("Size of HashMap before adding values: "+ customerMap.size() );
		
		// Add key/value to the HashMap
		customerMap.put("Kumar", new Double(11.11));
		customerMap.put("Ravi", new Double(22.22));
		customerMap.put("Amogh", new Double(33.33));
		customerMap.put("Vinay", new Double(44.44));
		customerMap.put("Balaji", new Double(55.55));
		
		System.out.println("HashMap is empty after adding values: "+ customerMap.isEmpty() );
		System.out.println("Size of HashMap after adding values: "+ customerMap.size() );

		// using same key will update or replace the value 
		customerMap.put("Ravi", new Double(99.99));
		System.out.println(customerMap);
		
		// getting a value using a key
		Object e1 = customerMap.get("Ravi");
		System.out.println("Value of Ravi is: " + e1);
		
		Object e2 = customerMap.get("Tom");
		System.out.println("Value of Tom is: " + e2);
		
		//deleting
		customerMap.remove("Vinay");
		System.out.println("Values in HashMap after deleting: " + customerMap);
		
		boolean b = customerMap.containsKey("Ravi");
		boolean b1 = customerMap.containsKey("Rama");
		System.out.println("Key Ravi is present: " +b);
		System.out.println("Key Rama is present: " + b1);

		System.out.println(customerMap.containsValue("33.33"));
		System.out.println(customerMap.containsValue(new Double(33.33)));
		
		customerMap.clear();
		System.out.println("Values in HashMap after clearing: " + customerMap);
		
	}
}
