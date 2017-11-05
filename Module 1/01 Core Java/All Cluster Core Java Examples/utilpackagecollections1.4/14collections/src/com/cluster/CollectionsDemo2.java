package com.cluster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// Collections class provides methods to get a synchronized or unmodifiable collection or map 

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class CollectionsDemo2 {
	public static void main(String[] args) {
	
		ArrayList list = new ArrayList();
		list.add("C");
		list.add("A");
		list.add("B");
		
		System.out.println("Values in ArrayList: "+list);
	
		// can get a unmodifiable list
	/*	List list2 = Collections.unmodifiableList(list);
	 	// cannot modify
	//	list2.add("Z");
	//	list2.remove("A");
		System.out.println(list2);
	*/	

		// can get a synchronized list or thread safe list
/*		List list3 = Collections.synchronizedList(list);
		System.out.println("Values in list3: "+ list3);
*/

	}
}
