package p1;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Shipment extends Boxweight {
	int cost;

	public Shipment(int width, int height, int depth, int weight, int cost) {
		super(width, height, depth, weight);
		this.cost = cost;
	}
	
	void m3()
	{
		System.out.println("Val of cost is " + cost);
	}
}
