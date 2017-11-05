package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class StaticInnerClassDemo 
{
	public static void main(String[] args) 
	{
		// outer class functionality
		Outer o = new Outer();
		o.m1();
		
		// Inner class functionality outside outer class
		Outer.Inner oi = new Outer.Inner(); 
		oi.m2();
	}
}
