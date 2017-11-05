package com.cluster;

import java.io.PrintWriter;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Ex2PrintWriterDemo {

	public static void main(String[] args) 
	{
		PrintWriter writer = new PrintWriter(System.out, false);
		int i = 10;
		String s = "hello";
		double d = 10.99;
		writer.println(i);
		writer.println(d);
		writer.println(s);
		

	}

}
