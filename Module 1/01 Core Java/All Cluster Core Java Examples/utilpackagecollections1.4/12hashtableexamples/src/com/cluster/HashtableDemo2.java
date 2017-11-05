package com.cluster;

import java.util.Hashtable;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class HashtableDemo2 {
	public static void main(String[] args) {
		// Create a Hashtable
		Hashtable hashTable = new Hashtable();
		System.out.println("Hashtable is empty before adding vales: "+ hashTable.isEmpty() );
		System.out.println("Size of Hashtable before adding values: "+ hashTable.size() );
		
		// Add key/value to the Hashtable
		hashTable.put("Kumar", new Double(11.11));
		hashTable.put("Ravi", new Double(22.22));
		hashTable.put("Amogh", new Double(33.33));
		hashTable.put("Vinay", new Double(44.44));
		hashTable.put("Balaji", new Double(55.55));
		
		System.out.println("Hashtable is empty after adding values: "+ hashTable.isEmpty() );
		System.out.println("Size of Hashtable after adding values: "+ hashTable.size() );

		// using same key will update or replace the value 
		hashTable.put("Ravi", new Double(99.99));
		System.out.println(hashTable);
		
		// getting a value using a key
		Object e1 = hashTable.get("Ravi");
		System.out.println("Value of Ravi is: " + e1);
		
		Object e2 = hashTable.get("Tom");
		System.out.println("Value of Tom is: " + e2);
		
		//deleting
		hashTable.remove("Vinay");
		System.out.println("Values in Hashtable after deleting: " + hashTable);
		
		boolean b = hashTable.containsKey("Ravi"); // 1.2 method
		boolean b1 = hashTable.contains("Rama"); // 1.0 method
		System.out.println("Key Ravi is present: " +b);
		System.out.println("Key Rama is present: " + b1);

		System.out.println(hashTable.containsValue("33.33"));
		System.out.println(hashTable.containsValue(new Double(33.33)));
		
		hashTable.clear();
		System.out.println("Values in Hashtable after clearing: " + hashTable);
		
	}
}
