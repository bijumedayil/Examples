package com.cluster.sort.employee.comparator;

import java.util.Comparator;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class EmployeeIdComparator implements Comparator<Employee>{

	public int compare(Employee emp1, Employee emp2) {
		
			int a = emp1.getEmployeeId();
			int b = emp2.getEmployeeId();
			
			Integer x = a;
			Integer y = b;
			
			// compare first object with second object to sort in ascending order
			return x.compareTo(y);
			
		/*	// compare second object with first object to sort in descending order
			return y.compareTo(x);
		*/	
	}
}
