package com.cluster;

import static java.lang.Math.*;
import static java.lang.Integer.parseInt;
import static com.cluster.A.p;
import static com.cluster.A.show;
import static java.lang.System.out;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class A {
	public static final int p = 55;

	public static void show() {
		System.out.println("Inside show method");
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class StaticImportDemo {
	public static void main(String args[]){

		double x = sqrt(625); 
		System.out.println(x);
		
		System.out.println(p);
		show();
		
		String s = "99";
		int z = parseInt(s);
		System.out.println("value of z is: " + z);
		
		out.println("hello world");
	}
}
