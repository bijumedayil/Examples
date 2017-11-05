package com.cluster.sort.string;

import java.util.Arrays;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SortStringDemo {

	public static void main(String[] args) {
		
		String s[] = new String[5];
		s[0] = "C";
		s[1] = "A";
		s[2] = "E";
		s[3] = "B";
		s[4] = "D";

		System.out.println("Original Order: ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + "\t");
		}
		System.out.println();

		// sorting String arrays
		// sort() calls compareTo() of the elements in the array 
		Arrays.sort(s);
		
		System.out.println("Sorted Order: ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + "\t");
		}
		System.out.println();

	}

}
