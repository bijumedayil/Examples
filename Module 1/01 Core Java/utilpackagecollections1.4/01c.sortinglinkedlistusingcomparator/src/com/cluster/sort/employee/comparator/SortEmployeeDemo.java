package com.cluster.sort.employee.comparator;

import java.util.LinkedList;
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
		
		LinkedList employeeList = new LinkedList();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		
	//	System.out.println(employeeList);
		
		System.out.println("LIST OF EMPLOYEES BEFORE SORTING");
		
		Iterator itr =  employeeList.iterator();
		while(itr.hasNext())
		{
			Object e = itr.next();
			Employee emp = (Employee)e;
			System.out.print("Employee Id  is " + emp.getEmployeeId() + " ");
			System.out.print("Name is " + emp.getName() + " ");
			System.out.print("Phone is " + emp.getPhone() + " ");
			System.out.print("Email is " + emp.getEmail() + "\n");
		}
		
		System.out.println(); 
		System.out.println("LIST OF EMPLOYEES AFTER SORTING BY ID");
		
		Collections.sort(employeeList, new EmployeeIdComparator());
		
		// set the iterator to the beginning
		itr = employeeList.iterator();
		while(itr.hasNext())
		{
			Object e = itr.next();
			Employee emp = (Employee)e;
			System.out.print("Employee Id  is " + emp.getEmployeeId() + " ");
			System.out.print("Name is " + emp.getName() + " ");
			System.out.print("Phone is " + emp.getPhone() + " ");
			System.out.print("Email is " + emp.getEmail() + "\n");
			
		}
		
		System.out.println(); 
		System.out.println("LIST OF EMPLOYEES AFTER SORTING BY NAME");
		
		Collections.sort(employeeList, new EmployeeNameComparator());
		
		// set the iterator to the beginning
		itr = employeeList.iterator();
		while(itr.hasNext())
		{
			Object e = itr.next();
			Employee emp = (Employee)e;
			System.out.print("Employee Id  is " + emp.getEmployeeId() + " ");
			System.out.print("Name is " + emp.getName() + " ");
			System.out.print("Phone is " + emp.getPhone() + " ");
			System.out.print("Email is " + emp.getEmail() + "\n");
			
		}
		
	}

}
