package com.cluster;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
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
public class FileToDatabaseDemo {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		Scanner sc = null;
		
		try {
			
			sc = new Scanner(new File("hello.txt"));
			con = DBUtil.getConnection();
			System.out.println("got database connection ");
			st = con.createStatement();
			
			while (sc.hasNext()) {
				int id = sc.nextInt();
				String name = sc.next();
				int sal = sc.nextInt();
				
			//	using execute() method to insert only one record
				st.execute("INSERT INTO EMP (EMP_ID, NAME,SALARY) VALUES("+id+",'"+name+"',"+sal+")");
			
			//	grouping all the queries into a batch
			//	st.addBatch("INSERT INTO EMP (EMP_ID, NAME,SALARY) VALUES("+id+",'"+name+"',"+sal+")");
			}
			//st.executeBatch();
			System.out.println("Completed storing values into database");
		} catch (ClassNotFoundException e) {
			System.out.println("Exception caught: " + e);
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Exception caught: " + e);
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
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
