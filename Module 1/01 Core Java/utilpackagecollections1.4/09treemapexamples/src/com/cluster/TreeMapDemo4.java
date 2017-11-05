package com.cluster;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;


//program to show methods of SortedMap
public class TreeMapDemo4 {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		
		map.put(new Integer(20),"BBB");
		map.put(new Integer(50),"EEE");
		map.put(new Integer(10),"AAA");
		map.put(new Integer(60),"FFF");
		map.put(new Integer(30),"CCC");
		map.put(new Integer(40),"DDD");
		map.put(new Integer(70),"GGG");
		map.put(new Integer(90),"III");
		map.put(new Integer(80),"HHH");
		
		System.out.println("Value of first key: " + map.firstKey());
		System.out.println("Value of last key: " + map.lastKey());
		
		// gives key/value from first to 50 and excludes 50
		SortedMap hm = map.headMap(new Integer(50));
		System.out.println("Values of headMap: " + hm);
		
		// gives key/value from 30  to last and includes 30
		SortedMap tm = map.tailMap(new Integer(30));
		System.out.println("Values of tailMap: " + tm);
		
		// gives key/value including start range 30 till end range excluding 70
		SortedMap sm = map.subMap(new Integer(30), new Integer(70));
		System.out.println("Values of subMap: " + sm);

	}

}
