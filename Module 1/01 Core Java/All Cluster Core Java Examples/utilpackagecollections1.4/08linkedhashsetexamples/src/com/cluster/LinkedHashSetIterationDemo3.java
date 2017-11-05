package com.cluster;

import java.util.Iterator;
import java.util.LinkedHashSet;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// Program to show primitives and iteration
// LinkedHashSet can use only Iterator
public class LinkedHashSetIterationDemo3 {

	public static void main(String[] args) {
		
		LinkedHashSet set = new LinkedHashSet();
		set.add(new Integer(52));
		set.add(new Integer(36));
		set.add(new Integer(74));
		set.add(new Integer(42));
		set.add(new Integer(24));
		set.add(new Integer(86));
		set.add(new Integer(11));
		
		System.out.println("Value store in LinkedHashSet: " + set);
		
		// get an iterator
		System.out.print("Contents of LinkedHashSet using iterator: ");
	    Iterator itr = set.iterator();
	    while(itr.hasNext()) 
	    {
	      Object e = itr.next();
	      Integer x = (Integer) e;
	      System.out.print(x + " ");
	    }

	}

}
