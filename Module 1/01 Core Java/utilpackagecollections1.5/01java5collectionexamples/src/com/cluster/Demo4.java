package com.cluster;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Demo4 {
	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<Object>();

		list.add("cluster");
		list.add(new Integer(99));
		list.add(new Double(99.99));

		for (Object x : list) {
			System.out.println(x);
		}

	}

}
