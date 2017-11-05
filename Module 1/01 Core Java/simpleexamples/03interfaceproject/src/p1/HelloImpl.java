package p1;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class HelloImpl implements Hello {

	@Override
	public void m1() {
		System.out.println("Inside m1");

	}

	@Override
	public int add(int x, int y) {
		int z = 0;
		z = x+y;
		return z;
	}

}
