package p1;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class C {
	
	public void showC()
	{
		System.out.println("Inside showC() of class C");
		System.out.println("Accessing members directly");
	//	System.out.println(w);
	//	System.out.println(x);
	//	System.out.println(y);
	//	System.out.println(z);
		
		System.out.println("Accessing members by creating object");
		A obj = new A();
	//	System.out.println(obj.w);
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
	}

}
