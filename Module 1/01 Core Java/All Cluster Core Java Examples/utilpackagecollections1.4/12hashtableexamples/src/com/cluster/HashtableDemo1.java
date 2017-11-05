package com.cluster;

import java.util.Hashtable;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class HashtableDemo1 {
	public static void main(String[] args) {

		// Create a Hashtable
		Hashtable hashTable = new Hashtable();

		// Add key/value to the Hashtable
		// Hashtable stores keys in unordered way
		hashTable.put("Kumar", new Double(11.11));
		hashTable.put("Ravi", new Double(22.22));
		hashTable.put("Amogh", new Double(33.33));
		hashTable.put("Vinay", new Double(44.44));
		hashTable.put("Balaji", new Double(55.55));

		// can add different type of key in Hashtable
		hashTable.put(new Integer(10), new Double(99.99));

		// can add different type of value in Hashtable
		hashTable.put("Praveen", "PRAVEEN");
		
		// can add duplicate value in Hashtable
		hashTable.put("Sunil", new Double(44.44));


		// cannot add null key in Hashtable
//		hashTable.put(null, new Double(66.66));

		// cannot add null value in Hashtable
//		hashTable.put("Hello", null);
	
		System.out.println(hashTable);

	}

}
