package com.cluster;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class NavigableMapDemo1 {

	public static void main(String[] args) {
		NavigableMap<Integer, String> map1 = new TreeMap<Integer, String>();
		map1.put(9, "Ravi");
		map1.put(3, "Kumar");
		map1.put(2, "Vinay");
		map1.put(11, "Amogh");
		map1.put(17, "Arjun");
		
		System.out.println("Elements in the map are: "+map1);
		
		//returns a map in descending order. It is a backed map.
	/*	NavigableMap<Integer, String> map2 = map1.descendingMap();
		System.out.println("Map in descending order: "+map2);
		
		// returns set of only keys in descending order.
		NavigableSet<Integer> set = map1.descendingKeySet();
		System.out.println("Key Set in descending order: "+set);
		
		Entry<Integer, String> firstEntry = map1.firstEntry();
		System.out.println("First Entry is: "+firstEntry);
		
		
		Entry<Integer, String> lastEntry = map1.lastEntry();
		System.out.println("Last Entry is: "+lastEntry);
		*/
		//  Returns a key-value mapping associated with the next highest key or equal key than the specified value

		Entry<Integer, String> ceilingEntry = map1.ceilingEntry(11);
		System.out.println("Ceiling Entry: "+ceilingEntry);
		
		// Returns a key associated with the next highest key or equal key than the specified value
		Integer ceilingKey = map1.ceilingKey(11);
		System.out.println("Ceiling Key: "+ceilingKey);
		
		//Returns a key-value mapping associated with the next lowest key or equal key than the specified value
		Entry<Integer, String> floorEntry = map1.floorEntry(9);
		System.out.println("Floor Entry: "+floorEntry);
		
		// Returns a key associated with the next lowest key or equal key than the specified value
		Integer floorKey = map1.floorKey(9);
		System.out.println("Floor key: "+floorKey);
		
	}
}
