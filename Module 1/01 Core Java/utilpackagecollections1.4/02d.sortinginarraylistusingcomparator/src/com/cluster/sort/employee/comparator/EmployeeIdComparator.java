package com.cluster.sort.employee.comparator;

import java.util.Comparator;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class EmployeeIdComparator implements Comparator{

	public int compare(Object object1, Object object2) {
		
		if (!((object1 instanceof Employee)&& (object2 instanceof Employee))) 
		{
			throw new ClassCastException();
		} 
		else 
		{
			Employee emp1 = (Employee)object1;
			Employee emp2 = (Employee)object2;
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
}
