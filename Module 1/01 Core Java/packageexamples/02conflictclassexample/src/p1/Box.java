package p1;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Box {
	public int width;
	public int height;
	public int depth;
	
	public Box(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public int volume ()
	{
		int z = 0;
		z = width* height* depth;
		return z;
	}
}
