package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class StringBuilderDemo2 {

	public static void main(String[] args) {
		// methods of StringBuffer
		StringBuilder sb = new StringBuilder();
		System.out.println("Length of string buffer is "+ sb.length());
		System.out.println("Capacity of string buffer is "+ sb.capacity());
		sb.append("apple");
		System.out.println("Length of string buffer is "+ sb.length());
		System.out.println("Capacity of string buffer is "+ sb.capacity());
		
		StringBuilder sb1 = new StringBuilder("hello");
		System.out.println("Value of sb1 is " +sb1);
		System.out.println("Length of string buffer is "+ sb1.length());
		System.out.println("Capacity of string buffer is "+ sb1.capacity());
		sb1.append("1234");
		System.out.println("After appending " + sb1);
		sb1.replace(2, 4, "cluster");
		System.out.println("After replacing " + sb1);
		sb1.delete(3,6);
		System.out.println("After deleting " + sb1);
		sb1.insert(5,"A");
		System.out.println("After inserting " + sb1);
		sb1.reverse();
		System.out.println("After reversing " + sb1);
		
		
		//checking equality of StringBuffer
		//convert StringBuffer to String and call equals()
		//because equals() is not overridden in StringBuffer class
		
		StringBuilder sb2 = new StringBuilder("hello");
		StringBuilder sb3 = new StringBuilder("hello");
		System.out.println("sb2 and sb3 are equal "+ (sb2==sb3));
		System.out.println("sb2 and sb3 are equal "+ sb2.equals(sb3));
		
		String s1 = sb2.toString();
		String s2 = sb3.toString();
		System.out.println("s1 and s2 are equal "+ s1.equals(s2));
		System.out.println("s1 and s2 are equal "+ (s1==s2));
		
	}
}
