package p1;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Demo {
	public static void main(String[] args) {
		Hello hello = null;
		hello = new HelloImpl();
		hello.m1();
		int res = hello.add(10, 20);
		System.out.println("Sum of both numbers is " + res);
	}
}
