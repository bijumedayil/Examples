package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Demo3 {
	public static void main(String[] args) {

		// Obtain all ordinal values using ordinal().
		System.out.println("Here are all Box constants and their ordinal values ");
/*
		for (Box b : Box.values()) {
			System.out.println(b + "	 " + b.ordinal());
		}
*/
/*		Box z1 = Box.b1;
		Box z4 = Box.b2;

		// Demonstrate compareTo()
		// compareTo() method is used to compare the ordinal value 
		//or position of the constant in the list
		int i = z1.compareTo(z4);
		System.out.println("Value of i is: " + i);

		int j = z4.compareTo(z1);
		System.out.println("Value of j is: " + j);

		int k = z1.compareTo(z1);
		System.out.println("Value of k is: " + k);

*/		// Demonstrate equals()
		// can check for equality of enum using equals() method 
		//or == (comparison) operator
		Box z = Box.b3;
		if (z.equals(Box.b3)) 
		{
			System.out.println("z contains b3");
		}

		if (z == Box.b3) 
		{
			System.out.println("z contains b3");
		}
	}
}
