package com.cluster.wrappertostring;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class WrapperToStringDemo {

	public static void main(String[] args) {
		// Program to convert wrapper to String
		
		int x = 99;
		Integer i = new Integer(x);
		//1)using toString() method
		String s1 = i.toString();
		// 2) Using toString(wrapper object) method in the corresponding wrapper class
		String s2 = Integer.toString(i);
		

		//3)Using valueOf(wrapper object) method of class String
		double d = 99.99;
		Double dd = new Double(d);
		String s3 = String.valueOf(dd);
	}
}
