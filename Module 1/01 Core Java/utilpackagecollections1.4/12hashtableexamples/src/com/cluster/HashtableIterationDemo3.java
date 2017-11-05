package com.cluster;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class HashtableIterationDemo3 {
	public static void main(String[] args) {

		Hashtable hashTable = new Hashtable();
		hashTable.put(new Integer(103), "CCC");
		hashTable.put(new Integer(105), "EEE");
		hashTable.put(new Integer(102), "BBB");
		hashTable.put(new Integer(101), "AAA");
		hashTable.put(new Integer(104), "DDD");

		// Iterate using key
/*		Set s = hashTable.keySet(); // 1.2 method
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Integer k = (Integer)itr.next();
			System.out.println(k);
			// using key can get value
	//		String v = (String) hashTable.get(k);
	//		System.out.print(k + "\t" + v + "\n");
		}
*/		
		// Iterate using values
/*		Collection c = hashTable.values(); // 1.2 method
		Iterator itr1 = c.iterator();
		while (itr1.hasNext()) {
			String name = (String) itr1.next();
			System.out.println(name);
		}
*/
		// iterate using both key and value
/*		Set s1 = hashTable.entrySet(); // 1.2 method
		Iterator itr2 = s1.iterator();
		while (itr2.hasNext()) {
			Map.Entry me = (Map.Entry) itr2.next();
			Integer k = (Integer)me.getKey();
			String v = me.getValue().toString();
			System.out.print(k + "\t" + v + "\n");
		}
*/	
		// Iterate using key
/*		Enumeration e = hashTable.keys(); // 1.0 method
		while (e.hasMoreElements()) {
			Integer k = (Integer)e.nextElement();
			System.out.println(k);
			
			// using key can get value
		//	String v = (String) hashTable.get(k);
		//	System.out.print(k + "\t" + v + "\n");
		}
		
*/		
		// Iterate using only values 
/*		Enumeration e = hashTable.elements(); // 1.0 method
		while (e.hasMoreElements()) {
			String v = (String)e.nextElement();
			System.out.println(v);
		}
*/
		
	}
}
