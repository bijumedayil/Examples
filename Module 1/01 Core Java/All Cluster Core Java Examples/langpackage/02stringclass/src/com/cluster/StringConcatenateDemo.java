package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class StringConcatenateDemo {
	public static void main(String[] args) {
		// String concatenation

		String s1 = "a";
		System.out.println("Value of s1 is " + s1);
		String s2 = s1 + "b";
		System.out.println("Value of s1 is " + s1);
		System.out.println("Value of s2 is " + s2);
		s1 = s1 + "c";
		System.out.println("Value of s1 is " + s1);
		System.out.println("Value of s2 is " + s2);

		String s3 = "a";
		System.out.println("Value of s3 is " + s3);
		String s4 = s3.concat("b");
		System.out.println("Value of s3 is " + s3);
		System.out.println("Value of s4 is " + s4);
		s3 = s3.concat("c");
		System.out.println("Value of s3 is " + s3);
		System.out.println("Value of s4 is " + s4);
	}
}
