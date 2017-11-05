package p2;

//import p1.Box;
//import p1.Hello;
import p1.*;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class DemoClient {

	public static void main(String[] args) {
		
	//	p1.Hello h = new p1.Hello();// fully qualified class name
		
		Hello h = new Hello();
		System.out.println("Val of p is " + h.p);
		System.out.println("Val of q is " + h.q);
		h.fun();
		
		Box box1 = new Box(1, 2, 3); // simple name
		System.out.println("val of width is "+ box1.width);
		System.out.println("val of height is "+ box1.height);
		System.out.println("val of depth is "+ box1.depth);
		int vol1 = box1.volume();
		System.out.println("Vol og box1 is " + vol1);
		
/*		Box box2 = new Box(4,5,6);
		Box box3 = new Box(11,12,13);*/
		
	/*	p1.Box box1 = new p1.Box(1, 2, 3); // fully qualified class name
		System.out.println("val of width is "+ box1.width);
		System.out.println("val of height is "+ box1.height);
		System.out.println("val of depth is "+ box1.depth);
		int vol1 = box1.volume();
		System.out.println("Vol og box1 is " + vol1);
		
		p1.Box box2 = new p1.Box(4, 5, 6);
		p1.Box box3 = new p1.Box(11, 12, 13);*/
		
		

	}

}
