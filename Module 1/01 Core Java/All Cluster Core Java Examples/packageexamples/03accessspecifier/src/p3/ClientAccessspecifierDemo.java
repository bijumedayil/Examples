package p3;

import p1.A;
import p1.B;
import p1.C;
import p2.D;
import p2.E;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ClientAccessspecifierDemo {
	public static void main(String[] args) {
	//	p1.A a = new p1.A(); // fully qualified class name
		A a = new A();
		a.showA();
		B b = new B();
		b.showB();
		C c = new C();
		c.showC();
		D d = new D();
		d.showD();
		E e = new E();
		e.showE();
	}
}
