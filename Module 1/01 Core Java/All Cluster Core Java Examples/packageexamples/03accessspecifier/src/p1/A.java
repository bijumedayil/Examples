package p1;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class A {

	private int w = 10; // private tyoe of access
	int x = 20; // default type of access
	protected int y = 30; // protected type of access
	public int z = 40;
	
	public void showA()
	{
		System.out.println("Inside showA() of class A");
		System.out.println("Accessing members directly");
		System.out.println(w);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		System.out.println("Accessing members by creating object");
		A obj = new A();
		System.out.println(obj.w);
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
	}
}
