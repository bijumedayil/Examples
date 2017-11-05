package com.cluster;

import java.util.Vector;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class VectorCollectionFrameworkMethodDemo3 {
	public static void main(String[] args) {
		
		Vector vector = new Vector();

		/* INSERT OPERATION*/
		
		// vector can store duplicates, dissimilar and null values
		// add() method adds values to the end of the array
		vector.add("C");
		vector.add("A");
		vector.add("E");
		vector.add("D");
		vector.add("F");
		vector.add(new Integer(101));
		vector.add(null);
		vector.add("A");
		
		// overloaded add() adds values to the specified index
		vector.add(3, "B");

		System.out.println("Values in Vector after inserting values: " + vector);

		/* READ OPERATION*/

		// Fetching a particular element from Vector
		String s1 = (String) vector.get(3);
		System.out.println("Value present at 3rd index is: " + s1);


		/* UPDATING OPERATION*/

		// replace an element at a particular index 
		vector.set(2, "Z");
		System.out.println("Values in Vector after setElementAt(): " + vector);

		/* DELETING OPERATION*/
		
		// remove elements in Vector
		vector.remove("F");
		vector.remove(4);

		System.out.println("Values in Vector after removing: " + vector);
		
		// delete all elements in Vector
		vector.clear();
		System.out.println("Values in Vector after removing all values: "+ vector);


	}

}
