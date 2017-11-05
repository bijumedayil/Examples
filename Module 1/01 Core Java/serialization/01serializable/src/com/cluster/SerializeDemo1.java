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
	int z;

	A()
	{
		System.out.println("Inside default constructor");
	}
	A(int x, int y, int z) {
		System.out.println("Inside parameterized contructor");
		this.x = x;
		this.y = y;
		this.z = z;
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SerializeDemo1 {
	public static void main(String[] args) {
	try {
		A a = new A(10,20,30);
		// doing serialization
		FileOutputStream fos = new FileOutputStream("hello.ser"); // create a FileOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(fos); // connect the ObjectOutputStream to FileOutputStream
		oos.writeObject(a);// serialize the object and write to file
		oos.close(); // close the resource

		// doing deserialization
		FileInputStream fis = new FileInputStream("hello.ser"); // create a FileInputStream
		ObjectInputStream ois = new ObjectInputStream(fis);// connect the ObjectInputStream to FileInputStream
		A a1 = (A) ois.readObject();// read the file and deserialize the object
		ois.close(); // close the resource
		System.out.println("Value of object a is: " + a.x + "\t" + a.y+ "\t" + a.z + "\t" + a);
		System.out.println("Value of deserialized object a1 is: " + a1.x + "\t" + a1.y + "\t" + a1.z + "\t" + a1);
	
		}
		catch (Exception e) {
			System.out.println("Exception caught " + e);
		}
	}
}
