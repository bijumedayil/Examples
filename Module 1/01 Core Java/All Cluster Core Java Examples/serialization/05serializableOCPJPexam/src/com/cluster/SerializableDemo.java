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
	int x = 10;
	
	A()
	{
		System.out.println("Inside default constructor");
	}
	
	void m1(int p)
	{
		x = p;
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SerializableDemo {
	public static void main(String[] args) {
	try {
		A a = new A();
		// doing serialization
		System.out.println("Value of object a before m1() method: " + a.x +"\t" +a);
		a.m1(99);
		System.out.println("Value of object a before serialization: " + a.x +"\t" +a);
		FileOutputStream fos = new FileOutputStream("hello.ser"); // create a FileOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(fos); // connect the ObjectOutputStream to FileOutputStream
		oos.writeObject(a);// serialize the object and write to file
		oos.close(); // close the resource

		// doing deserialization
		FileInputStream fis = new FileInputStream("hello.ser"); // create a FileInputStream
		ObjectInputStream ois = new ObjectInputStream(fis);// connect the ObjectInputStream to FileInputStream
		A a1 = (A) ois.readObject();// read the file and deserialize the object
		ois.close(); // close the resource
		System.out.println("Value of object a is: " + a.x + "\t" + a);
		System.out.println("Value of deserialized object a1 is: " + a1.x + "\t" + a1);
	
		}
		catch (Exception e) {
			System.out.println("Exception caught " + e);
		}
	}
}

