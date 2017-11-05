package com.cluster;

import java.util.StringTokenizer;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class StringTokenizerDemo {
	public static void main(String[] args) {

		String str = "Welcome, to, Cluster,. Software, Solutions";

		// will use the specified delimiter
		StringTokenizer st = new StringTokenizer(str,",");
		while (st.hasMoreTokens()) {
			String s1 = st.nextToken();
			System.out.println(s1);
		}
	
	}
}
