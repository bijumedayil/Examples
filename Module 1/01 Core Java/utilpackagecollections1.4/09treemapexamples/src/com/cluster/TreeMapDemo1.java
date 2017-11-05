package com.cluster;

import java.util.TreeMap;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class TreeMapDemo1 {
	public static void main(String[] args) {
		// Create a TreeMap
		TreeMap map = new TreeMap();

		// Add key/value to the TreeMap
		//TreeMap stores keys in sorted order
		map.put(new Integer(103), "CCC");
		map.put(new Integer(105), "EEE");
		map.put(new Integer(102), "BBB");
		map.put(new Integer(101), "AAA");
		map.put(new Integer(104), "DDD");
		
		System.out.println(map);

	}

}
