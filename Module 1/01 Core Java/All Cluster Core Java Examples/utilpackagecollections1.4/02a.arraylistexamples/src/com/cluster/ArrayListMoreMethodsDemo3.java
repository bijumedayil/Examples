package com.cluster;

import java.util.ArrayList;
import java.util.List;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// Program to show more methods of ArrayList
public class ArrayListMoreMethodsDemo3 {

	public static void main(String[] args) {
		
		//ArrayList list = new ArrayList(15);
		ArrayList list = new ArrayList();

		System.out.println("Initial size of ArrayList: " + list.size());
		System.out.println("Is Arraylist empty: " + list.isEmpty());
		System.out.println("Contents of Arraylist: " + list);

		// adding elements or values to the ArrayList
		list.add("C");
		list.add("A");
		list.add("E");
		list.add("B");
		list.add("D");
		list.add("F");
		list.add("Z");
		list.add("X");
		list.add("Y");
		
		System.out.println("Size of ArrayList after adding values: " + list.size());
		System.out.println("Is Arraylist empty after adding values: " + list.isEmpty());
		System.out.println("Contents of Arraylist: " + list);
		
		// trimToSize() trims the capacity of this ArrayList to the list's current size.
	/*	list.trimToSize();
		
		System.out.println("Size of ArrayList after trimming: " + list.size());
		System.out.println("Contents of Arraylist: " + list);
	*/	
	
	/*	int i = list.indexOf("B");
		System.out.println("Index of B is: " + i);
	*/	
		
		// clone method will copy the values into another ArrayList
	/*	ArrayList anotherList = (ArrayList)list.clone();
		
		System.out.println("Size of anotherList : " + anotherList.size());
		System.out.println("Contents of anotherList: " + anotherList);
	*/
		
		// subList() returns a portion of the list depending on the range
	
	/*	List li = list.subList(2, 5);
		System.out.println("Value present in sublist  are" + li);
		System.out.println("Contents of Arraylist: " + list);
	*/
		
	}

}
