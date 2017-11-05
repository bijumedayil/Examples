package com.cluster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class DynamicValueDemo {
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pst1 = null;
		PreparedStatement pst2 = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver is loaded");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "ravioracle","ravioracle");
			System.out.println("got database connection");
			
			System.out.println("Please enter ID : ");
	        int id = sc.nextInt();
	        System.out.println("Please enter name : ");
	        String name = sc.next();
	        System.out.println("Please enter salary : ");
	        int sal = sc.nextInt();
	        
			pst1 = con.prepareStatement("INSERT INTO EMP (EMP_ID, NAME,SALARY) VALUES(?,?,?)");

			// inserting a row
			pst1.setInt(1, id);
			pst1.setString(2, name);
			pst1.setInt(3, sal);
			int i = pst1.executeUpdate();
			
			System.out.println("Value of i is" + i);
			if(i == 1)
			{
				System.out.println("Your values have been successfully inserted");
			}
			else
			{
				System.out.println("Your values have not been inserted");
			}
			System.out.println("--------------------------------------------");
			//updating a row
			System.out.println("Please enter the employee name you want to upgrade the salary: ");
			String empname = sc.next();
		    System.out.println("Please enter salary : ");
		    int upsal = sc.nextInt();
		    
		    pst2 = con.prepareStatement("UPDATE EMP SET SALARY = ? WHERE NAME = ?");
			pst2.setInt(1, upsal);
			pst2.setString(2, empname);
			int j = pst2.executeUpdate();
			
			System.out.println("Value of j is : " + j);
			if(j == 1)
			{
				System.out.println("Your values have been successfully updated");
			}
			else
			{
				System.out.println("Your values have not been updated");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("Exception caught: " + e);
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Exception caught: " + e);
			e.printStackTrace();
		} 
		finally {
			sc.close();
			try {
				if (pst1 != null) {
					pst1.close();
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
