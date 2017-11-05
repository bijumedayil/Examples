package com.cluster;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class A implements Serializable {
	int x;
	static int y; // static variables cannot be serialized because they belong to class
	transient int z; // transient keyword is used to skip serialization of instance variables 

	A() {
		System.out.println("Inside constructor");
		x = 10;
		y = 20;
		z = 30;
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SerializeDemo1 {
	public static void main(String[] args) {
		A a = new A();
		try {
			FileOutputStream fos = new FileOutputStream("hello.ser"); // create a FileOutputStream
			ObjectOutputStream oos = new ObjectOutputStream(fos); // connect the ObjectOutputStream to FileOutputStream
			oos.writeObject(a);// serialize the object and write to file
			oos.close(); // close the resource
			System.out.println("Value of object a is: " + a.x + "\t" + a.y+ "\t" + a.z + "\t" + a);
		} catch (Exception e) {
			System.out.println("Exception caught " + e);
		}
		System.out.println("Serialization Done!!!!!!!!");
	}
}
