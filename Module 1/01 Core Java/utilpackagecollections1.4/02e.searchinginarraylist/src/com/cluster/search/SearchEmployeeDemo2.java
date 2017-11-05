package com.cluster.search;

import java.util.ArrayList;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SearchEmployeeDemo2 {
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmployeeId(101);
		employee1.setName("AAA");
		employee1.setPhone("1111");
		employee1.setEmail("AA@CLUSTERINDIA.COM");
		
		Employee employee2 = new Employee();
		employee2.setEmployeeId(102);
		employee2.setName("BBB");
		employee2.setPhone("2222");
		employee2.setEmail("BB@CLUSTERINDIA.COM");
		
		Employee employee3 = new Employee();
		employee3.setEmployeeId(103);
		employee3.setName("CCC");
		employee3.setPhone("3333");
		employee3.setEmail("CC@CLUSTERINDIA.COM");
		
		Employee employee4 = new Employee();
		employee4.setEmployeeId(104);
		employee4.setName("DDD");
		employee4.setPhone("4444");
		employee4.setEmail("DD@CLUSTERINDIA.COM");
		
		Employee employee5 = new Employee();
		employee5.setEmployeeId(105);
		employee5.setName("EEE");
		employee5.setPhone("5555");
		employee5.setEmail("EE@CLUSTERINDIA.COM");

		// add all employees into ArrayList
		ArrayList employeeList = new ArrayList();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		
		
		// search an employee
		
		Employee userEmployee = new Employee();
		userEmployee.setEmployeeId(104);
		userEmployee.setName("DDD");
		userEmployee.setPhone("4444");
		userEmployee.setEmail("DD@CLUSTERINDIA.COM");
		
		if (employeeList.contains(userEmployee)) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is not present");
		}
		

	}

}
