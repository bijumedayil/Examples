package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Demo1 {
	public static void main(String[] args) {
		
		Box z; // can declare a reference variable of enum 
		z = Box.b3; // initializing a enum variable;

		System.out.println("Value of z is: " + z);
		
		if(z == Box.b3) // check for equality using == operator
		{
			System.out.println("z contains box3");
		}
		int a = z.width;
		System.out.println("value of a is " + a);
		
		int p = Box.b1.width;
		int q = Box.b1.height;
		int r = Box.b1.depth;
		
		System.out.println("Values of box1 are: " + p +"\t" + q+ "\t" + r);
		
		int m = Box.b2.volume();
		System.out.println("Volume of box2 is " + m);
		
	}
}

