package com.cluster;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Ex4BufferedReaderDemo {

	// other institute program
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter a first value");
			String s1 =  reader.readLine();
			int x = Integer.parseInt(s1);
			System.out.println("Please enter a second value");
			String s2 =  reader.readLine();
			int y = Integer.parseInt(s2);
			int z = x + y;
			System.out.println("val of x is " + x);
			System.out.println("val of y is " + y);
			System.out.println("val of z is " + z);
			

	}

}
