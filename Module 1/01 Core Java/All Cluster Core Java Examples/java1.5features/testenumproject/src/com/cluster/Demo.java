package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Demo {
	public static void main(String[] args) {
		
		Box z ; // declaring a variable of enum type
	//	z = new Box();
		z = Box.b2; // initalizing the enum variable
		System.out.println("Value of z is: " + z);
		
		Box p = Box.b2;
		System.out.println("Value of p is: " + p);
		

		int y = p.ordinal();
		System.out.println("Ordinal value of b2 is  " + y);
		
		/*if(z == p)
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
*/		

	}

}
