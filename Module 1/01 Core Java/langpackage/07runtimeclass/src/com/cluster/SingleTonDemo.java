package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SingleTonDemo {
	public static void main(String[] args) {
	//	Hello h = new Hello();
		Hello h1 = Hello.getHello();
		System.out.println("Val of h1" + h1);
		h1.m1();
		h1.m2();
		
		Hello h2 = Hello.getHello();
		System.out.println("Val of h2" + h2);
		

	}

}
