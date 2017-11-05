package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ArrayUDDDemo {
	public static void main(String[] args) {
		
	//	Box []z ; // declaring the array 
	//	z = new Box[5]; // creating the array
	//	Box []z  = new Box[5]; // declaring & creating the array 
	
		Box b = new Box(0,0,0);
		Box b1 = new Box(1,1,1);
		Box b2 = new Box(2,2,2);
		
		Box z[] = {b,b1,b2, new Box(3,3,3), new Box(4,4,4)};
		
		z[0] = b; // initializing the array
		z[1] = b1;
		z[2] = b2;
		z[3] = new Box(3,3,3);
		z[4] = new Box(4,4,4);
		
		Box m4 = z[4];
		/*System.out.println("Val of width is"+ m4.width);
		System.out.println("Val of height is"+ m4.height);
		System.out.println("Val of depth is"+ m4.depth);*/
		
		/*System.out.println("Val of width is"+ z[4].width);
		System.out.println("Val of height is"+ z[4].height);
		System.out.println("Val of depth is"+ z[4].depth);
		int v = z[4].volume();
		*/
				
		for (int i = 0; i < z.length; i++) {
			System.out.print("Val in "+ i +"index is" + z[i].width +z[i].height + z[i].depth );
			System.out.println("\t" + z[i].volume());
		}
		
	}

}
