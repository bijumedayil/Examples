package com.cluster;

import java.util.Arrays;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// program for searching and sorting in arrays storing primitive data
public class ArraysDemo1 {
	public static void main(String[] args) {
		
		// array storing primitive data
		int a[] = new int[5];
		a[0] = 103;
		a[1] = 101;
		a[2] = 100;
		a[3] = 104;
		a[4] = 102;
		
		// finding index or a position of an element in an array
		int index = Arrays.binarySearch(a, 100);
		System.out.println("Index of 100 is: " +index);
		
		
		System.out.println("Original Order");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		// sorting in arrays storing primitive data
		Arrays.sort(a);
		
		System.out.println("Sorted Order");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		Arrays.fill(a, 2,4,-1);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
