package com.cluster.sort.string.comparator;

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
		    String a = (String) obj1;
		    String b = (String) obj2;

		    // reverse the comparison
		    // compare the second object with the first object for descending order
		    return b.compareTo(a);
	  }
}
