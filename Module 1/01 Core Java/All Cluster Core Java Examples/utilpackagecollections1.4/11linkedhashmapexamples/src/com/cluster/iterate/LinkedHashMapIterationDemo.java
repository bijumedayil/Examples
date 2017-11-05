package com.cluster.iterate;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class LinkedHashMapIterationDemo {
	public static void main(String[] args) {

		LinkedHashMap map = new LinkedHashMap();
		map.put(new Integer(103), "CCC");
		map.put(new Integer(105), "EEE");
		map.put(new Integer(102), "BBB");
		map.put(new Integer(101), "AAA");
		map.put(new Integer(104), "DDD");

		// Iterate using key
/*		Set s = map.keySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Integer k = (Integer)itr.next();
			System.out.println(k);
			// using key can get value
		//	String v = (String) map.get(k);
		//	System.out.print(k + "\t" + v + "\n");
		}
*/
		// Iterate using values
/*		Collection c = map.values();
		Iterator itr1 = c.iterator();
		while (itr1.hasNext()) {
			String name = (String) itr1.next();
			System.out.println(name);
		}
*/
		// iterate using both key and value
		Set s1 = map.entrySet();
		Iterator itr2 = s1.iterator();
		while (itr2.hasNext()) {
			Map.Entry me = (Map.Entry) itr2.next();
			Integer k = (Integer)me.getKey();
			String v = me.getValue().toString();
			System.out.print(k + "\t" + v + "\n");
		}
		
		
	}
}
