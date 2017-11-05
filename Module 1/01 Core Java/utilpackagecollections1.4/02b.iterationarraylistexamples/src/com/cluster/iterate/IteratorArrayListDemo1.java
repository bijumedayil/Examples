package com.cluster.iterate;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class IteratorArrayListDemo1 {

	public static void main(String[] args) {
		
	    // create an array list
	    ArrayList list = new ArrayList();
	    
	    // add elements to the array list
	    list.add("C");
	    list.add("A");
	    list.add("E");
	    list.add("B");
	    list.add("D");
	    list.add("E");
	    list.add("B");
	    list.add("F");
	    
	 //   System.out.println("Values in ArrayList are" + list);
	    
	    // accessing elements using for loop
	    
	 /*   System.out.print("Contents of ArrayList using for loop: ");
	    for(int i= 0 ; i < list.size();i++)
	    {
	    	Object e = list.get(i);
	    	String s = (String) e;
	    	System.out.print(s + " ");
	    }
	 */	    
	 
	    // accessing elements in ArrayList using iterator
	 
	 /* System.out.print("Contents of ArrayList using iterator: ");
	    Iterator itr1 = list.iterator();
	    while(itr1.hasNext()) 
	    {
	      Object e = itr1.next();
	      String s = (String) e;
	      System.out.print(s + " ");
	    }
	 */   
	    
	    
	    // can remove elements using iterator
	    // remove all B values in ArrayList
	    
	 /* System.out.print("Contents of ArrayList before removing: " + list);
	    Iterator itr2 = list.iterator();
	    while(itr2.hasNext()) 
	    {
	      Object e = itr2.next();
	      String s = (String)e;
	      if(s.equals("B"))
	      {
	      	itr2.remove();
	      }
	    }
	    
	    System.out.println();
	    
	    System.out.print("Contents of ArrayList after removing using Iterator: ");
	    itr2 = list.iterator();
	    while(itr2.hasNext()) 
	    {
	      Object e = itr2.next();
	      String s = (String)e;
	      System.out.print(s + " ");
	    }
	   */

	}
}