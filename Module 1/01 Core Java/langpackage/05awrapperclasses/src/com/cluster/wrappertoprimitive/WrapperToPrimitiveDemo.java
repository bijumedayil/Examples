package com.cluster.wrappertoprimitive;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class WrapperToPrimitiveDemo {
	public static void main(String[] args) {
		// Program to convert wrapper object to another primitive type

		int i = 999;
		Integer z = new Integer(i);

		byte b = z.byteValue();
		short s = z.shortValue();
		long l = z.longValue();
		float f = z.floatValue();
		double d = z.doubleValue();
		System.out.println(b);
		System.out.println(s);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);

		// cannot convert int to boolean and character
		// char c = z.charValue();
		// boolean b = z.booleanValue();

	}

}
