package com.cluster.integer.comparator;

import java.util.TreeSet;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class TreeSetIntegerComparatorDemo {

	public static void main(String[] args) {
		
		TreeSet set1 = new TreeSet();
		set1.add(new Integer(52));
		set1.add(new Integer(36));
		set1.add(new Integer(74));
		set1.add(new Integer(42));
		set1.add(new Integer(24));
		set1.add(new Integer(86));
		set1.add(new Integer(11));
		
		System.out.println("Values in treeset natural order: " + set1);
		
		TreeSet set2 = new TreeSet(new MyComparator());
		set2.add(new Integer(52));
		set2.add(new Integer(36));
		set2.add(new Integer(74));
		set2.add(new Integer(42));
		set2.add(new Integer(24));
		set2.add(new Integer(86));
		set2.add(new Integer(11));
		
		System.out.println("Values store in treeset using comparator: " + set2);
		
		
	}
}
