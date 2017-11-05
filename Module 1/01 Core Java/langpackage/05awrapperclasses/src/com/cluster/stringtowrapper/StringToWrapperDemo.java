package com.cluster.stringtowrapper;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class StringToWrapperDemo {
	public static void main(String[] args) {
		// Program to convert String to Wrapper

		String s1 = "999";
		
		// using constructor
		Integer y = new Integer(s1);

		// Using valueOf(String) method of corresponding wrapper class
		Integer x = Integer.valueOf(s1);
	}

}
