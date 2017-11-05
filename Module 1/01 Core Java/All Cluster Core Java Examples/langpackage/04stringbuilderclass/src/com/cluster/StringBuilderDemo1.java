package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class StringBuilderDemo1 {

	public static void main(String[] args) {
		
		// creates StringBuffer object with default capacity of 16 empty characters for manipulation 
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.append("Hello");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.append("World");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		
		
		// creates StringBuffer object with required capacity of 30 empty characters for manipulation
		/*StringBuilder sb2 = new StringBuilder(30);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		sb2.append("Hello");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		sb2.append("World");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());*/
		
		// creates StringBuffer object with default capacity of 16 empty characters for manipulation plus the size of String
/*		StringBuilder sb3 = new StringBuilder("Hello");
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());
		sb3.append("World");
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());
*/		

	}

}
