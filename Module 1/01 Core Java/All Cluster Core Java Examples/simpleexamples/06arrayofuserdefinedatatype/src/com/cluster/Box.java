package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Box {
	int width;
	int height;
	int depth;
	
	public Box(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	int volume()
	{
		int z = 0;
		z = width*height*depth;
		return z;
	}
	
	void m1()
	{
		System.out.println("Val of width is " + width);
		System.out.println("Val of height is " + height);
		System.out.println("Val of depth is " + depth);
	}
	
	/*public String toString()
	{
		String s = "Val of w, h & d is " + width +"\t" + height + "\t" + depth; 
		return s;
	}*/
	
	
}
