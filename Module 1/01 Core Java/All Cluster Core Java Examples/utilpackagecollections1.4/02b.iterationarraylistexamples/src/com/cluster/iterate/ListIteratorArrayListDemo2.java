package com.cluster.iterate;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ListIteratorArrayListDemo2 {
	public static void main(String[] args) {
		
		//can use ListIterator with ArrayList
	    // create an ArrayList
	    ArrayList list = new ArrayList();
	    
	    // add elements to the ArrayList
	    list.add("C");
	    list.add("A");
	    list.add("E");
	    list.add("B");
	    list.add("D");
	    list.add("F");

	    // use ListIterator to display contents of ArrayList

	    ListIterator litr = list.listIterator();
	    System.out.print("Contents of ArrayList in forward direction using ListIterator: ");
	    
	    while(litr.hasNext()) 
	    {
	      Object e = litr.next();
	      String s = (String) e;
	      System.out.print(s + " ");
	    }
	    System.out.println();
	    
	    System.out.print("Contents of ArrayList in backward direction using ListIterator: ");
	    
	    while(litr.hasPrevious()) 
	    {
	      Object e = litr.previous();
	      String s = (String) e;
	      System.out.print(s + " ");
	    }
	    System.out.println();

	    
	    
	    // modify objects being iterated
	/*    ListIterator litr2 = list.listIterator(); 
	    while(litr2.hasNext()) {
	      Object e = litr2.next();
	      String s1 = (String) e;
	      String s2 = s1 + "X";
	      litr2.set(s2);
	    }

	   

	    // now, display the list backwards
	    System.out.print("Modified list backwards: ");
	    while(litr2.hasPrevious()) {
	      Object element = litr2.previous();
	      System.out.print(element + " ");
	    }
	    System.out.println();

	 */	 	
	   }

}
