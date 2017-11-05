package p1;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Boxweight extends Box{
	int weight;

	public Boxweight(int width, int height, int depth,int weight) {
		super(width,height,depth);
		this.weight = weight;
	}
	void m2()
	{
		System.out.println("Val of weight is " + weight);
	}
}
