package com.cluster;
 

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class AnonymousInnerClassDemo 
{
	public static void main(String[] args)
	{
		Hello h = new Hello();
		h.show();
		
		// can use the overridden method of anonymous class in another class
		h.a.m1(); 
		h.b.m2();
		h.c.m3();
	}
}
