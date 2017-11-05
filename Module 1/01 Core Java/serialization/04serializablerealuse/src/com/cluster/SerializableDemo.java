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
class Employee implements Serializable {
	private int employeeId;
	private String name;
	private String phone;
	private String email;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SerializableDemo {
	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setEmployeeId(101);
		emp1.setName("Ravi");
		emp1.setPhone("11111");
		emp1.setEmail("ravi@clusterindia.com");

		try {
			FileOutputStream fos = new FileOutputStream("emp.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp1);
			oos.close();

			FileInputStream fis = new FileInputStream("emp.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee emp2 = (Employee) ois.readObject();
			ois.close();

			System.out.println("Value of Employee emp1 is " + emp1);
			System.out.println("Value of deserialized Employee emp2 is " + emp2);
			System.out.println(emp2.getEmployeeId());
			System.out.println(emp2.getName());
			System.out.println(emp2.getPhone());
			System.out.println(emp2.getEmail());
		} catch (Exception e) {
			System.out.println("Exception caught " + e);
		}
	}
}
