package com.cluster.iterate;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class IterateArrayListInArrayListDemo5 {

	public static void main(String[] args) {
		
		// create 3 ArrayList
		ArrayList  list1 = new ArrayList();
		list1.add("100");
		list1.add("101");
		list1.add("102");
		list1.add("103");
		list1.add("104");
		System.out.println("First List" + list1);

		ArrayList  list2 = new ArrayList();
		list2.add("200");
		list2.add("201");
		list2.add("202");
		list2.add("203");
		list2.add("204");
		System.out.println("Second List" + list1);

		ArrayList  list3 = new ArrayList();
		list3.add("300");
		list3.add("301");
		list3.add("302");
		list3.add("303");
		list3.add("304");
		System.out.println("Third List" + list1);
		
		
		// add all three ArrayList into a single ArrayList 
		ArrayList  list = new ArrayList();
		list.add(list1);
		list.add(list2);
		list.add(list3);
		
		System.out.println("List of Lists" + list);
		
		// Accessing the elements in final list
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			Object e = itr.next();
			ArrayList arl = (ArrayList)e;
			Iterator i = arl.iterator();
			while(i.hasNext())
			{
				Object obj = i.next();
				String s = (String)obj;
				System.out.print(s + " ");
			}
			System.out.println();
		}

	}
}
