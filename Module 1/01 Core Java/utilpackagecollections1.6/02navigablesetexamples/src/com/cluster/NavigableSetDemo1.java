package com.cluster;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class NavigableSetDemo1 {

	public static void main(String[] args) {
		NavigableSet<Integer> set1 = new TreeSet<Integer>();
		set1.add(3);
		set1.add(2);
		set1.add(15);
		set1.add(8);
		set1.add(5);
		

		System.out.println("Elements in the current Set are " + set1);

		// returns a set descending order. It is a backed collection
		NavigableSet<Integer> set2 = set1.descendingSet();
		System.out.println("Set in the descending order " + set2);
		
		set2.add(99);
		
		System.out.println("Elements in the current Set are " + set1);
		System.out.println("Set in the descending order " + set2);

		//Returns the next element in this set greater than or equal to the given element, or null if there is no such element
		Integer ceiling = set1.ceiling(100);
		System.out.println("Ceiling of given element is " + ceiling);

		//Returns the next element in this set strictly greater than the given element, or null if there is no such element
		Integer higher = set1.higher(100);
		System.out.println("Higher value of given element is " + higher);

		//Returns the next element in this set less than or equal to the given element, or null if there is no such element
		Integer floor = set1.floor(8);
		System.out.println("Floor value of given element is " + floor);

		//Returns the next element in this set strictly less than the given element, or null if there is no such element.
		Integer lower = set1.lower(8);
		System.out.println("Lower value of given element is " + lower);
	}

}
