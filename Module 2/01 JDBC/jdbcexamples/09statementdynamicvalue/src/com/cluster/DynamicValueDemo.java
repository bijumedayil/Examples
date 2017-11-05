package com.cluster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class DynamicValueDemo {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver is loaded");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "ravioracle","ravioracle");
			System.out.println("got database connection");
			st = con.createStatement();
			
			
			System.out.println("Please enter ID : ");
	        int id = sc.nextInt();
	        System.out.println("Please enter name : ");
	        String name = sc.next();
	        System.out.println("Please enter salary ");
	        int sal = sc.nextInt();
	        
	        
	        //using executeUpdate() method to insert,update or delete only one record
			int i = st.executeUpdate("INSERT INTO EMP (EMP_ID, NAME,SALARY) VALUES("+id+",'"+name+"',"+sal+")");
			if(i == 1)
			{
				System.out.println("Your values have been successfully inserted");
			}
			else
			{
				System.out.println("Your values have not been inserted");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("Exception caught: " + e);
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Exception caught: " + e);
			e.printStackTrace();
		} finally {
			sc.close();
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
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
