package com.cluster;

import java.util.Vector;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class VectorLegacyMethodDemo2 {

	public static void main(String[] args) {
		
		Vector vector = new Vector();

		/* INSERT OPERATION*/
		
		// vector can store duplicates, dissimilar and null values
		// addElement() method adds values to the end of the array
		vector.addElement("C");
		vector.addElement("A");
		vector.addElement("E");
		vector.addElement("D");
		vector.addElement("F");
		vector.addElement(new Integer(101));
		vector.addElement(null);
		vector.addElement("A");
		
		// insertElementAt() adds values to the specified index
		vector.insertElementAt("B", 3);

		System.out.println("Values in Vector after inserting values: " + vector);

		/* READ OPERATION*/

		// Fetching a particular element from Vector
		String s1 = (String) vector.elementAt(3);
		System.out.println("Value present at 3rd index is: " + s1);

		String s2 = (String) vector.firstElement();
		System.out.println("The first value in vector is: " + s2);

		String s3 = (String) vector.lastElement();
		System.out.println("The last value in vector is: " + s3);

		/* UPDATING OPERATION*/

		// replace an element at a particular index 
		vector.setElementAt("Z", 2);
		System.out.println("Values in Vector after setElementAt(): " + vector);

		/* DELETING OPERATION*/
		
		// remove elements in Vector
		vector.removeElement("F");
		vector.removeElementAt(4);

		System.out.println("Values in Vector after removing: " + vector);
		
		// delete all elements in Vector
		vector.removeAllElements();
		System.out.println("Values in Vector after removing all values: "+ vector);

	}

}
