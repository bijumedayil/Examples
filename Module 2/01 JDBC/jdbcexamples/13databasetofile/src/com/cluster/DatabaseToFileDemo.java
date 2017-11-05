package com.cluster;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.cluster.util.DBUtil;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class DatabaseToFileDemo {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new File("cluster.txt"));
			con = DBUtil.getConnection();
			System.out.println("got database connection");
			st = con.createStatement();
			
			//using execute() method to insert,update or delete only one record
			rs = st.executeQuery("SELECT * FROM EMP");
			
			while (rs.next())
			{
//				System.out.print(rs.getInt("EMP_ID")+"\t");
//				System.out.print(rs.getString("NAME")+"\t");
//				System.out.println(rs.getString("SALARY"));
				
				pw.write(rs.getInt("EMP_ID")+"\t");
				pw.write(rs.getString("NAME")+"\t");
				pw.write(rs.getString("SALARY")+"\n");
				pw.flush();
			}
			System.out.println("Finished writing to File");
		} catch (ClassNotFoundException e) {
			System.out.println("Exception caught: " + e);
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Exception caught: " + e);
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
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
