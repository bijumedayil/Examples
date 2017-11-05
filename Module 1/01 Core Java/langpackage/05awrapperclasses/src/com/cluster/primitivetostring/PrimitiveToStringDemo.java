package com.cluster.primitivetostring;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class PrimitiveToStringDemo {
	public static void main(String[] args) {
		// Program to convert primitive to String
		
		//1)Using toString() method 
		//a) Using toString(primitive value) method of corresponding wrapper class
		int x = 99;
		String s1 = Integer.toString(x);
		
		//b)Using toString() method
		byte b = 10;
		Byte bb = new Byte(b);
		String s2 = bb.toString();
		
		//2)Using valueOf() method of class String
		//a) Using valueOf(primitive value) method of class String
		short s = 12;
		String s4 = String.valueOf(s);
		
		//b) Using valueOf(wrapper object) method of class String
		double d = 99.99;
		Double dd = new Double(d);
		String s3 = String.valueOf(dd);
	}
}
