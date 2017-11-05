package com.cluster.integer.comparator;

import java.util.Comparator;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class MyComparator implements Comparator
{
	 public int compare(Object obj1, Object obj2) 
	 {
		    Integer a = (Integer) obj1;
		    Integer b = (Integer) obj2;

		    // reverse the comparison
		    // compare the second object with the first object for descending order 
		    return b.compareTo(a);
	  }
}
