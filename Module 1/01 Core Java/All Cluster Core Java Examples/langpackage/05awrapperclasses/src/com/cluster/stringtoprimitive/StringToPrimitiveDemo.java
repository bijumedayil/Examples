package com.cluster.stringtoprimitive;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class StringToPrimitiveDemo {
	public static void main(String[] args) {
		// Program to convert String to primitive

		String s1 = "99";

		// 1) By using parseInt(String) method
		int i = Integer.parseInt(s1);

		// 2)By using valueOf(String) method, convert into
			// wrapper object and then call intValue() method
		Integer z = Integer.valueOf(s1);
		int j = z.intValue();

	}
}
