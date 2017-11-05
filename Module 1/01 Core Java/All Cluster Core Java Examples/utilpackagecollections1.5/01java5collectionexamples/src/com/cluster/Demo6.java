package com.cluster;

import java.util.Map;
import java.util.TreeMap;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Demo6 {
	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<Integer, String>();

		map.put(103, "CCC");
		map.put(105, "EEE");
		map.put(102, "BBB");
		map.put(101, "AAA");
		map.put(104, "DDD");

		String s = map.get(103);
		System.out.println("Value of 103 is: " + s);

	}

}
