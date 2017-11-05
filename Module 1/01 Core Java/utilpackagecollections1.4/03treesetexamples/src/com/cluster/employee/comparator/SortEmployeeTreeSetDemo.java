package com.cluster.employee.comparator;

import java.util.TreeSet;
import java.util.Collections;
import java.util.Iterator;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SortEmployeeTreeSetDemo {
	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.setEmployeeId(103);
		employee1.setName("AMOGH");
		employee1.setPhone("333");
		employee1.setEmail("AMOGH@CLUSTER.COM");

		Employee employee2 = new Employee();
		employee2.setEmployeeId(101);
		employee2.setName("RAVI");
		employee2.setPhone("111");
		employee2.setEmail("RAVI@CLUSTER.COM");

		Employee employee3 = new Employee();
		employee3.setEmployeeId(104);
		employee3.setName("VINAY");
		employee3.setPhone("444");
		employee3.setEmail("VINAY@CLUSTER.COM");

		Employee employee4 = new Employee();
		employee4.setEmployeeId(102);
		employee4.setName("KUMAR");
		employee4.setPhone("222");
		employee4.setEmail("KUMAR@CLUSTER.COM");

		TreeSet employeeSet = new TreeSet(new EmployeeIdComparator());
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		employeeSet.add(employee3);
		employeeSet.add(employee4);

		Iterator itr = employeeSet.iterator();
		while (itr.hasNext()) {
			Object e = itr.next();
			Employee emp = (Employee) e;
			System.out.print("Employee Id  is " + emp.getEmployeeId() + " ");
			System.out.print("Name is " + emp.getName() + " ");
			System.out.print("Phone is " + emp.getPhone() + " ");
			System.out.print("Email is " + emp.getEmail() + "\n");
		}

	}
}