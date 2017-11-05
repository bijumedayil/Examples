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
public class Demo {
	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver is loaded");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "RAVIORACLE","RAVIORACLE");
			System.out.println("Got database connection");
			Statement st = con.createStatement();
			st.execute("INSERT INTO EMP(EMP_ID, NAME, SALARY)VALUES(106,'KUMAR', 6000)");
			st.execute("INSERT INTO EMP(EMP_ID, NAME, SALARY)VALUES(107,'RAMA', 7000)");
			
			ResultSet rs = st.executeQuery("SELECT * FROM EMP");
			
			while(rs.next())
			{
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int sal = rs .getInt("SALARY");
			System.out.println(id + "\t" + name +"\t" + sal);
			}
			
			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Exception caught : " + e);
		} catch (SQLException e) {
			System.out.println("Exception caught : " + e);
		}
	}

}
