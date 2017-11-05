package com.cluster;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class CallableStatementDemo {

	public static void main(String[] args) {
		Connection con = null;
		CallableStatement cst1 = null;
		CallableStatement cst2 = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver is loaded");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "ravioracle","ravioracle");
			System.out.println("got database connection");

			cst1 = con.prepareCall("{CALL PROC1(101)}");
		//	cst1.setInt(1,102);
			int p= cst1.executeUpdate();
			System.out.println("Value of p is : " + p);
			
			cst2 = con.prepareCall("{CALL PROC2(?,?,?)}");
			cst2.setInt(1,104);
			cst2.registerOutParameter(2,Types.INTEGER);
			cst2.registerOutParameter(3,Types.INTEGER);
			int q= cst2.executeUpdate();
			int t = cst2.getInt(2);
			int a = cst2.getInt(3);

			System.out.println("Value of q is : " + q);
			System.out.println("Total marks is : " + t);
			System.out.println("Average marks is : " + a);
			
		} catch (ClassNotFoundException e) {
			System.out.println("Exception caught : " + e);
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Exception caught : " + e);
			e.printStackTrace();
		} 
		finally {
			try {
				if (cst1 != null) {
					cst1.close();
				}
				
				if (cst2 != null) {
					cst2.close();
				}
				
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("Error in closing resources: " + e);
				e.printStackTrace();
			}
		}
	}
}
