package com.cluster;

import java.util.Arrays;
import java.util.List;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ArraysToArrayListDemo2 {

	public static void main(String[] args) {
		

		Integer ia[] = new Integer[5];
		ia[0] = new Integer(102);
		ia[1] = new Integer(104);
		ia[2] = new Integer(103);
		ia[3] = new Integer(105);
		ia[4] = new Integer(101);
		
		// asList() converts array to ArrayList
		List list = Arrays.asList(ia);
		System.out.println("Value in list" + list);

	}

}
