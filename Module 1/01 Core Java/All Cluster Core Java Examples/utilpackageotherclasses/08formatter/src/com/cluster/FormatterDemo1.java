package com.cluster;

import java.util.Formatter;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class FormatterDemo1 {
	public static void main(String[] args) {

		Formatter fmt = new Formatter();
		String name = "Ravi";
		int id = 101;
		double fees = 12345.67;
		fmt.format("My name is %s and my id is %d and fees is %f", name,id,fees);
		System.out.println(fmt);
		
		System.out.println("My name is " + name + " and my id is " + id);
		
		// printf() can also use format specifier
		// printf is similar to C syntax
		System.out.printf("My name is %s and my id is %d", name,id);
	
	}
}
