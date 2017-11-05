package com.cluster;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.cluster.to.Employee;
import com.cluster.util.DBUtil;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class JdbcCollectionsDemo {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnection();
			System.out.println("Got connection....");
			st = con.createStatement();
			
			// retreiving id from EMPLOYEE table
			/*String strSQL = "SELECT EMP_ID FROM EMP";
			rs = st.executeQuery(strSQL);
			List<Integer> listNames = new LinkedList<Integer>();
			
			while (rs.next())
			{
				listNames.add(rs.getInt("EMP_ID"));
			}
			Collections.sort(listNames);
			for (Integer strName : listNames) {
				System.out.println(strName);
			}*/
			
			// retrieve a employee detail
			/*String strSQL = "SELECT * FROM EMP WHERE EMP_ID = 102";
			rs = st.executeQuery(strSQL);
			Employee emp = null;
			if(rs.next())
			{
				emp = new Employee();
				emp.setEmployeeId(rs.getInt("EMP_ID"));
				emp.setName(rs.getString("NAME"));
				emp.setEmail(rs.getString("EMAIL"));
				emp.setPhone(rs.getString("PHONE"));
				
			}
			
			System.out.println("Employee ID    :" + emp.getEmployeeId());
			System.out.println("Employee Name  :" + emp.getName());
			System.out.println("Employee Email :" + emp.getEmail());
			System.out.println("Employee Phone :" + emp.getPhone());
			*/
			
			// retrieve all employee detail
			String strSQL = "SELECT * FROM EMP";
			rs = st.executeQuery(strSQL);
			List<Employee> listEmployee = new ArrayList<Employee>();
			
			while(rs.next())
			{
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("EMP_ID"));
				emp.setName(rs.getString("NAME"));
				emp.setEmail(rs.getString("EMAIL"));
				emp.setPhone(rs.getString("PHONE"));
				listEmployee.add(emp);
			}
			
			for (Employee emp : listEmployee) {
				System.out.print("Employee ID    :" + emp.getEmployeeId() +"\t");
				System.out.print("Employee Name  :" + emp.getName()+"\t");
				System.out.print("Employee Email :" + emp.getEmail()+"\t");
				System.out.println("Employee Phone :" + emp.getPhone());
				
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("Exception caught: " + e);
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Exception caught: " + e);
			e.printStackTrace();
		}
		
		finally
		{
			try 
			{
			if(con!= null)
				{
						con.close();
				}
			}
			catch (SQLException e) {
				System.out.println("Error in closing resources: " + e);
				e.printStackTrace();
			}
		}
	}
}
