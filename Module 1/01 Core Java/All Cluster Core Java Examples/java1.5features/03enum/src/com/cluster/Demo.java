package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Demo {
	public static void main(String args[]) {
		Apple ap = Apple.GOLDENDEL;
		System.out.println(ap.price + "\t" + ap.toString() + "\t" + ap.color);

		// Use an enum to control a switch statement.
		switch (ap) {
		case JONATHAN:
			System.out.println("Jonathan is good.");
			break;
		case GOLDENDEL:
			System.out.println("Golden Delicious is very good.");
			break;
		case REDEL:
			System.out.println("Red Delicious is OK.");
			break;
		case WINESAP:
			System.out.println("Winesap is not good.");
			break;
		case CORTLAND:
			System.out.println("Cortland is fine.");
			break;
		}
	}
}
