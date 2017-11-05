package com.cluster.userdefineddata;

import java.util.ArrayList;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// Program to store user defined data in ArrayList
public class StoringUserdefinedDataInArrayListDemo {
	
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
		
		ArrayList employeeList = new ArrayList();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		
		System.out.println(employeeList);
		
	}

}
