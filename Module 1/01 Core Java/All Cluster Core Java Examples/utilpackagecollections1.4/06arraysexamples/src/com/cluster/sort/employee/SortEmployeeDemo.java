package com.cluster.sort.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SortEmployeeDemo {

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
		
		Employee arlEmployee [] = new Employee[4];
		arlEmployee[0] = employee1;
		arlEmployee[1] = employee2;
		arlEmployee[2] = employee3;
		arlEmployee[3] = employee4;
		
		
		System.out.println("LIST OF EMPLOYEES BEFORE SORTING");
		
		System.out.println("Original Order: ");
		for (int i = 0; i < arlEmployee.length; i++) {
			System.out.print("Employee Id is " + arlEmployee[i].getEmployeeId() + " ");
			System.out.print("Name is " + arlEmployee[i].getName() + " ");
			System.out.print("Phone is " + arlEmployee[i].getPhone() + " ");
			System.out.print("Email is " + arlEmployee[i].getEmail() + " ");
			System.out.println();
		}
		
		System.out.println();
		
		// sort() calls compare() of Comparator
		Arrays.sort(arlEmployee, new EmployeeIdComparator());
		
		System.out.println("LIST OF EMPLOYEES AFTER SORTING BY ID");
		for (int i = 0; i < arlEmployee.length; i++) {
			System.out.print("Employee Id is " + arlEmployee[i].getEmployeeId() + " ");
			System.out.print("Name is " + arlEmployee[i].getName() + " ");
			System.out.print("Phone is " + arlEmployee[i].getPhone() + " ");
			System.out.print("Email is " + arlEmployee[i].getEmail() + " ");
			System.out.println();
		}
		
	}

}
