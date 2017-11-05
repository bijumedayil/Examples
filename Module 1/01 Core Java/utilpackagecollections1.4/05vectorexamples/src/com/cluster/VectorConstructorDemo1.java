package com.cluster;

import java.util.Vector;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class VectorConstructorDemo1 {
	public static void main(String[] args) {
		
		/* creates a vector object with capacity  10 and when over-filled will increment by 10*/ 
		Vector vector = new Vector();
		
		/* creates a vector object with capacity  5 and when over-filled will increment by 5*/
	//	Vector vector = new Vector(5);
		
		/* creates a vector object with capacity  5 and when over-filled will increment by 3*/
	//	Vector vector = new Vector(5,3);
		
		/*adding 10 elements*/
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");

		/*adding 11th element*/
		vector.add("A");
		
		System.out.println("No of elements in the vector: " + vector.size());
		System.out.println("Capacity of the vector: " + vector.capacity());
		System.out.println("Values stored in vector: " + vector);
		
		vector.trimToSize();
		
		System.out.println("After trimming......");
		System.out.println("No of elements in the vector: " + vector.size());
		System.out.println("Capacity of the vector: " + vector.capacity());
		System.out.println("Values stored in vector: " + vector);

	}
}
