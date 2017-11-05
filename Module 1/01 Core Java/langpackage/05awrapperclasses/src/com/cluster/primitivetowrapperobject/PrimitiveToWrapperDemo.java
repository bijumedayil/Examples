package com.cluster.primitivetowrapperobject;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class PrimitiveToWrapperDemo {
	public static void main(String[] args) {
		// Program to convert primitive to wrapper objects

		// 1)By using constructor
		// 2) By using valueOf(primitive type) method

		// to convert int to wrapper object
		int i = 10;
		Integer x = new Integer(i);
		Integer p = Integer.valueOf(i);
		System.out.println(i);
		System.out.println(x);
		System.out.println(p);

		// to convert double to wrapper object
		double d = 99.99;
		Double y = new Double(d);
		Double q = Double.valueOf(d);
		System.out.println(d);
		System.out.println(y);
		System.out.println(q);

		// to convert boolean to wrapper object
		boolean b = true;
		Boolean z = new Boolean(b);
		Boolean r = Boolean.valueOf(b);
		System.out.println(b);
		System.out.println(z);
		System.out.println(r);

	}
}
