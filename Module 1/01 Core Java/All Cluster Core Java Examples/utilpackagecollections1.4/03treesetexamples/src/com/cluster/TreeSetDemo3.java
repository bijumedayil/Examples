package com.cluster;

import java.util.SortedSet;
import java.util.TreeSet;


//program to show methods of SortedSet
public class TreeSetDemo3 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		set.add(new Integer(20));
		set.add(new Integer(50));
		set.add(new Integer(10));
		set.add(new Integer(60));
		set.add(new Integer(30));
		set.add(new Integer(40));
		set.add(new Integer(70));
		set.add(new Integer(90));
		set.add(new Integer(80));
		
	//	System.out.println("Value of first element: " + set.first());
	//	System.out.println("Value of last element: " + set.last());
		
		// from first to 50 and excludes 50
	/*	SortedSet hs = set.headSet(new Integer(50));
		System.out.println("Values of headSet: " + hs);
	*/
		// from 30  to last and includes 30
	/*	SortedSet ts = set.tailSet(new Integer(30));
		System.out.println("Values of tailSet: " + ts);
	*/	
		// include  start range 30 till end range excluding 70
	/*	SortedSet ss = set.subSet(new Integer(30), new Integer(70));
		System.out.println("Values of subSet: " + ss);
	 */
	}

}
