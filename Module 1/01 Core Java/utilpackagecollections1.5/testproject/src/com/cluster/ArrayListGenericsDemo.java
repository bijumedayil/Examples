package com.cluster;

import java.util.ArrayList;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ArrayListGenericsDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(40);
		list.add(20);
	//	list.add("AAA");
		
	//	Integer x = list.get(2);
	//	int x = list.get(2);
	//	System.out.println(x);
		
//		for (Integer i : list) {
//			System.out.println(i);
//			
//		}
		
		for (int i : list) {
			System.out.println(i);
			
		}
		

	}

}
