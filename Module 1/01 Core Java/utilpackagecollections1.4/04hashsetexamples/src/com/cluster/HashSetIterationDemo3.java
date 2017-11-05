package com.cluster;

import java.util.Iterator;
import java.util.HashSet;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// Program to show primitives and iteration
// HashSet can use only Iterator
public class HashSetIterationDemo3 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		set.add(new Integer(52));
		set.add(new Integer(36));
		set.add(new Integer(74));
		set.add(new Integer(42));
		set.add(new Integer(24));
		set.add(new Integer(86));
		set.add(new Integer(11));
		System.out.println("Value store in HashSet: " + set);
		// get an iterator
		System.out.print("Contents of HashSet using iterator: ");
	    Iterator itr = set.iterator();
	    while(itr.hasNext()) 
	    {
	      Object e = itr.next();
	      Integer x = (Integer) e;
	      System.out.print(x + " ");
	    }

	}

}
