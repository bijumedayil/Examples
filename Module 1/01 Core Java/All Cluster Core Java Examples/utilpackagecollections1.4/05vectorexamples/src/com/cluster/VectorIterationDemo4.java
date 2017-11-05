package com.cluster;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class VectorIterationDemo4 {
	public static void main(String[] args) {
		
		
		//can use Enumeration, Iterator and ListIterator with Vector
		Vector vector = new Vector();

		vector.addElement("C");
		vector.addElement("A");
		vector.addElement("E");
		vector.addElement("B");
		vector.addElement("D");
		vector.addElement("F");

		// Using Enumeration with Vector
		System.out.print("Enumeration: ");
		Enumeration enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			Object e = enumeration.nextElement();
			System.out.print(e + " ");
		}
		System.out.println();

		
		// Using Iterator with Vector
		System.out.print("Iterator: ");
		Iterator iterator = vector.iterator();
		while (iterator.hasNext()) {
			Object e = iterator.next();
			System.out.print(e + " ");
		}
		System.out.println();

		
		// Using ListIterator with Vector
		System.out.print("ListIterator forward: ");
		ListIterator listIterator = vector.listIterator();
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
