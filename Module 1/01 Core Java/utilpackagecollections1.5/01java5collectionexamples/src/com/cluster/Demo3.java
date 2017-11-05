package com.cluster;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Demo3 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("cluster");
		list.add("99");
		list.add("999");

		for (String x : list) {
			System.out.println(x);
		}
	}
}
