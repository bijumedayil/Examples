package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public enum Box {

	b(1,2,3), b1(10, 20, 30), b2(5, 6, 7), b3(5), b4;

	int width;
	int height;
	int depth;

	private Box(int x, int y, int z) {
		System.out.println("Inside 3 parameters constructor");
		width = x;
		height = y;
		depth = z;
	}

	private Box(int x) {
		System.out.println("Inside 1 parameters constructor");
		width = x;
		height = x;
		depth = x;
	}

	private Box() {
		System.out.println("Inside no parameters constructor");
		width = 1;
		height = 1;
		depth = 1;
	}

	int volume() {
		int vol = 0;
		vol = width * height * depth;
		return vol;
	}
}
