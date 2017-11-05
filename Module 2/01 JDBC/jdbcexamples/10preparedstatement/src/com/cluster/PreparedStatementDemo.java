package com.cluster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class PreparedStatementDemo {
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pst1 = null;
		PreparedStatement pst2 = null;
		PreparedStatement pst3 = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver is loaded");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "ravioracle","ravioracle");
			System.out.println("got database connection");

			pst1 = con.prepareStatement("INSERT INTO EMP (EMP_ID, NAME, SALARY) VALUES(?,?,?)");

			// inserting a row
			pst1.setInt(1, 107);
			pst1.setString(2, "RAMA");
			pst1.setInt(3, 7000);
		//	int i = pst1.executeUpdate();
		//	System.out.println("Value of i is: " + i);
			pst1.addBatch();
			
			pst1.setInt(1, 108);
			pst1.setString(2, "JEEVAN");
			pst1.setInt(3, 8000);
		//	pst1.executeUpdate();
			pst1.addBatch();
			
			pst1.setInt(1, 109);
			pst1.setString(2, "VINAY");
			pst1.setInt(3, 9000);
		//	pst1.executeUpdate();
			pst1.addBatch();
			int a[] = pst1.executeBatch();

			
			// updating a row
			pst2 = con.prepareStatement("UPDATE EMP SET SALARY = ? WHERE NAME = ?");
			pst2.setInt(1, 3333);
			pst2.setString(2, "GANESH");
		//	boolean b = pst2.execute();
		//	System.out.println("Value of b is: " + b);
			pst2.addBatch();

			pst2.setInt(1, 5555);
			pst2.setString(2, "RAVI");
		//	pst2.execute();
			pst2.addBatch();
			pst2.executeBatch();
			

			// getting a scrollable resultset
			pst3 = con.prepareStatement("SELECT EMP_ID, NAME, SALARY FROM EMP WHERE EMP_ID > ?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			pst3.setInt(1, 104);
			rs = pst3.executeQuery();
			
			while (rs.next()){
				System.out.print(rs.getInt("EMP_ID")+"\t");
				System.out.print(rs.getString("NAME")+"\t");
				System.out.println(rs.getString("SALARY"));
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("Exception caught: " + e);
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Exception caught: " + e);
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pst1 != null) {
					pst1.close();
				}
				
				if (pst2 != null) {
					pst2.close();
				}
				
				if (pst3 != null) {
					pst3.close();
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
