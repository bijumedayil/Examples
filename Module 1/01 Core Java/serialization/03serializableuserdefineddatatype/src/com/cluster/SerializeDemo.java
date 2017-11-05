package com.cluster;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class A implements Serializable {
	int x;
	int y;
//	Test t;
	transient Test t; 

	A(int x, int y, Test t) {
		System.out.println("Inside A const");
		this.x = x;
		this.y = y;
		this.t = t;
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Test //implements Serializable
{
	int p;
	int q;

	Test(int i, int j) {
		p = i;
		q = j;
	}

}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SerializeDemo {
	public static void main(String[] args) {
		Test t = new Test(5,5);
		A a = new A(10, 20, t);
		try {
			FileOutputStream fos = new FileOutputStream("hello.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a);
			oos.close();

			FileInputStream fis = new FileInputStream("hello.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			A a1 = (A) ois.readObject();
			ois.close();

			System.out.println("Vlaue of a ant t is: " + a + "\t" + a.t);
			System.out.println("Vlaue of a1 ant t is: " + a1 + "\t" + a1.t);
			System.out.println("Value of a object: " + a.x + "\t" + a.y + "\t"+ a.t.p + "\t" + a.t.q);
			System.out.println("Value of deserialized a1 object: " + a1.x + "\t" + a1.y );
			System.out.println("Value of test object in a is: " +  a1.t.p + "\t" + a1.t.q);

		} catch (Exception e) {
			System.out.println("Exception caught " + e);
		}
	}
}
