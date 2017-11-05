package com.cluster.employeee;

import java.util.HashSet;
import java.util.Iterator;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class InsertEmployeeDemo {
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
		employee4.setEmployeeId(102);
		employee4.setName("BBB");
		employee4.setPhone("2222");
		employee4.setEmail("BB@CLUSTERINDIA.COM");
		
		
		

		// add all employees into HashSet
		HashSet employeeSet = new HashSet();
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		employeeSet.add(employee3);
		
		// cannot add duplicate employee
		employeeSet.add(employee4);
		
		
		Iterator itr = employeeSet.iterator();
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
