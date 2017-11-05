package com.cluster.object.equals;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Test {
	int x;
	int y;
	
	
	public Test(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public boolean equals(Object obj){
		boolean b = false;
		if(obj instanceof Test){
			Test z = (Test)obj;
			if((this.x==z.x)&&(this.y==z.y)){
				b = true;
				return b;
			}
			else{
				return b;
			}
		}
		else{
			System.out.println("Sorry you are passing a wrong object");
			return b;
		}
	}
	

}
