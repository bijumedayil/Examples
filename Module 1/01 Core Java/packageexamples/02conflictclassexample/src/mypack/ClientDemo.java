package mypack;

//import p1.Box;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ClientDemo {

	public static void main(String[] args) {
		p1.Box box1 = new p1.Box(1, 2, 3);
		System.out.println(" val of width is" + box1.width);
		System.out.println(" val of height is" + box1.height);
		System.out.println(" val of depth is" + box1.depth);
		
		p2.Box box2 = new p2.Box();
		System.out.println(" val of p is" + box2.p);
		System.out.println(" val of q is" + box2.q);
		box2.fun();
	}
}
