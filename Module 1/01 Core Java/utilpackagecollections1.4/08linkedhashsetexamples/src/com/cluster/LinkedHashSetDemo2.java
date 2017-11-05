package com.cluster;

import java.util.LinkedHashSet;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class LinkedHashSetDemo2 {
	public static void main(String[] args) {
		
	    LinkedHashSet set = new LinkedHashSet();
	    
	    // can add dissimilar and null values to the LinkedHashSet
	    // cannot add duplicates to LinkedHashSet
	    set.add("B");
	    set.add("A");
	    set.add("D");
	    set.add("E");
	    set.add("C");
	    set.add("F");
	    
	    // adding dissimilar and null value
	    set.add(new Integer(100));
	    set.add(null);
	    
	    // cannot add duplicates
	 //   set.add("D");
	    
	    System.out.println(set);
	}
}
