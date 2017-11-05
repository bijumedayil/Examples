package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Demo {

	public static void main(String[] args) {
		
		// 1 way StringBuffer object gets created with default capacity of 16
	/*	StringBuffer sb1 = new StringBuffer();
		System.out.println("Value of sb1 is " + sb1);
		System.out.println("length of sb1 is " + sb1.length());
		System.out.println("Value of sb1 is " + sb1.capacity());
		sb1.append("Hello");
		System.out.println("Value of sb1 is " + sb1);
		System.out.println("length of sb1 is " + sb1.length());
		System.out.println("Value of sb1 is " + sb1.capacity());
		sb1.append("World");
		System.out.println("Value of sb1 is " + sb1);
		System.out.println("length of sb1 is " + sb1.length());
		System.out.println("Value of sb1 is " + sb1.capacity());
		sb1.append("Cluster");
		System.out.println("Value of sb1 is " + sb1);
		System.out.println("length of sb1 is " + sb1.length());
		System.out.println("Value of sb1 is " + sb1.capacity());
	*/	
		
/*		StringBuffer sb2 = new StringBuffer(30);
		System.out.println("Value of sb1 is " + sb2);
		System.out.println("length of sb1 is " + sb2.length());
		System.out.println("Value of sb1 is " + sb2.capacity());
		sb2.append("Hello");
		System.out.println("Value of sb1 is " + sb2);
		System.out.println("length of sb1 is " + sb2.length());
		System.out.println("Value of sb1 is " + sb2.capacity());
		
*/		
		StringBuffer sb3 = new StringBuffer("Hello");
		System.out.println("Value of sb1 is " + sb3);
		System.out.println("length of sb1 is " + sb3.length());
		System.out.println("Value of sb1 is " + sb3.capacity());
		sb3.append("World");
		System.out.println("Value of sb1 is " + sb3);
		System.out.println("length of sb1 is " + sb3.length());
		System.out.println("Value of sb1 is " + sb3.capacity());
	}

}
