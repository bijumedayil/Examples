package com.cluster.sort.employee.comparable;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Employee // implements Comparable
{
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
	
/*	 public int compareTo(Object e) 
	 {
		 if (!(e instanceof Employee))
		 {
		 throw new ClassCastException();
		 } 
		 else 
		 {
		 Employee emp = (Employee) e;
		 Integer a = new Integer(this.employeeId);
		 Integer b = new Integer(emp.employeeId);
		 return a.compareTo(b);
		 }
	 }
	 
*/
/*	public int compareTo(Object e) 
	 {
		 if (!(e instanceof Employee))
		 {
		 throw new ClassCastException();
		 } 
		 else 
		 {
			 Employee emp = (Employee) e;
			 int a = this.employeeId;
			 int b = emp.employeeId;
			 
			 if (a > b) 
			 {
					return 1;
			 } 
			 else if (a < b) 
			 {
					return -1;
			 } 
			 else 
			 {
					return 0;
			 }
		 }
	 }
*/

	 public String toString()
	{
		String s = "Emp Id is " + employeeId + " " +
				   "Emp Name is " + name + " " +
				   "Phone is " + phone + " " +
				   "Email is " + email + "\n";
		return s;
				   
	}

}
