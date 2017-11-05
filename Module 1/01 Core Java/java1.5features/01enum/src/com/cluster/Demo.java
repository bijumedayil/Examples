package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
enum Box {
	b, b1, b2, b3, b4;
}

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Demo {
	public static void main(String[] args) {
		
		Box z; // can declare a reference variable of enum 
		z = Box.b1; // initializing a enum variable;
		
		System.out.println("Value of z is: " + z);
		
		z = Box.b3;

		if(z == Box.b3) // check for equality using == operator
		{
			System.out.println("z contains box3");
		}
	}
}

