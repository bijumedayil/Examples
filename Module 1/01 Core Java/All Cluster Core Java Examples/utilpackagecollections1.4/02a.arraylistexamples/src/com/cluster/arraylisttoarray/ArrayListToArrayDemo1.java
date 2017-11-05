package com.cluster.arraylisttoarray;

import java.util.ArrayList;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ArrayListToArrayDemo1 {

	public static void main(String[] args) {
			// Create an array list
			ArrayList list = new ArrayList();

			// Add elements to the array list
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
