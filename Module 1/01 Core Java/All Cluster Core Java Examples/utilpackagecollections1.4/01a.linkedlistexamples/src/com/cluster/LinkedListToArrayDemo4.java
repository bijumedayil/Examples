package com.cluster;

import java.util.LinkedList;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class LinkedListToArrayDemo4 {

	public static void main(String[] args) {
			// Create a LinkedList
			LinkedList list = new LinkedList();

			// Add elements to the LinkedList
			list.add(new Integer(1));
			list.add(new Integer(2));
			list.add(new Integer(3));
			list.add(new Integer(4));

			System.out.println("Contents of al: " + list);

			// get array
			Object a[] = list.toArray();

			// visit the elements of the array
			for (int i = 0; i < a.length; i++) {
				Object e = a[i];
				Integer x = (Integer)e ;
				System.out.println("int value is : " + x);
			}
			
		}
}
