package com.cluster;

import java.util.Scanner;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ScannerDemo1 {

	public static void main(String[] args) {
		System.out.println("Please enter two numbers to add");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("Sum of both numbers " + a + " & " + b + " is " + c);
	}
}
