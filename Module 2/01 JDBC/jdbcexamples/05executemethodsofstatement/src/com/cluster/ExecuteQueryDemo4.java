package com.cluster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ExecuteQueryDemo4 {
	public static void main(String[] args) {
		Connection con =null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver is loaded");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ravioracle","ravioracle"); 
			System.out.println("got database connection");
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM EMP");
			
			while (rs.next()){
				System.out.print(rs.getInt("EMP_ID")+"\t");
				System.out.print(rs.getString("NAME")+"\t");
				System.out.println(rs.getString("SALARY"));
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Exception caught: " + e);
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.out.println("Exception caught: " + e);
			e.printStackTrace();
		}
		finally{
			try {
			if(rs != null){
				rs.close();
			}
			if(st != null){
				st.close();
			}
			if(con != null){
				con.close();
			}
			}
			catch(SQLException e)
			{
				System.out.println("Error in closing resources: " + e);
				e.printStackTrace();
			}
		}

	}

}
