package com.cluster;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class LinkedListIterationDemo3 {
	public static void main(String[] args) {
		
		//can use only Iterator and ListIterator with LinkedList
		LinkedList LinkedList = new LinkedList();

		LinkedList.add("C");
		LinkedList.add("A");
		LinkedList.add("E");
		LinkedList.add("B");
		LinkedList.add("D");
		LinkedList.add("F");

		
		
		// Using Iterator with LinkedList
		System.out.print("Iterator: ");
		Iterator iterator = LinkedList.iterator();
		while (iterator.hasNext()) {
			Object e = iterator.next();
			System.out.print(e + " ");
		}
		System.out.println();

		
		// Using ListIterator with LinkedList
		System.out.print("ListIterator forward: ");
		ListIterator listIterator = LinkedList.listIterator();
		while (listIterator.hasNext()) {
			Object e = listIterator.next();
			System.out.print(e + " ");
		}
		System.out.println();
		
		System.out.print("ListIterator backward: ");
		while (listIterator.hasPrevious()) {
			Object e = listIterator.previous();
			System.out.print(e + " ");
		}
		System.out.println();

	}

}
