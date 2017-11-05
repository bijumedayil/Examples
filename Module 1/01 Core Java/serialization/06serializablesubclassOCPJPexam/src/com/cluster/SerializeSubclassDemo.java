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
class A  {

	int x ;

	A() {
	//	x = 99;
		System.out.println("Inside A constructor");
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class B extends A implements Serializable{

	int y;

	B() {
		System.out.println("Inside B constructor");
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SerializeSubclassDemo {
	public static void main(String[] args) {

		B b = new B();
		b.x = 10;
		b.y = 20;

		try {
			FileOutputStream fos = new FileOutputStream("hello.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(b);
			oos.close();

			FileInputStream fis = new FileInputStream("hello.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println("creating deserialized object");
			B b1 = (B) ois.readObject();
			ois.close();

			System.out.println(b.x + "	" + b.y);
			System.out.println(b1.x + "	" + b1.y);
		} catch (Exception e) {
			System.out.println("Exception caught " + e);
		}
	}
}
