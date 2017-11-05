package com.cluster.iterate;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// iteration in ArrayList when it is having dissimilar elements
public class ArrayListDissimilarDataIterationDemo4 {
	public static void main(String[] args) {

		// adding disimilar elements into ArrayList
		ArrayList listBalance = new ArrayList();
		listBalance.add("6000");
		listBalance.add(new Integer(100));
		listBalance.add(new Double(1000.555));
		
		System.out.println("ArrayList : The Account Balances are "
				+ listBalance);

		// iterating through dissimilar elements in ArrayList
		Iterator itr = listBalance.iterator();
		while (itr.hasNext()) {
			Object e = (Object) itr.next();
			if (e instanceof String) {
				String str = e.toString();
				System.out.println("Value of String is :" + str);
			} else if (e instanceof Integer) {
				Integer i = (Integer) e;
				System.out.println("Value of Integer is :" + i);
			} else if (e instanceof Double) {
				Double d = (Double) e;
				System.out.println("Value of Double is :" + d);
			} 
		}

	}

}
