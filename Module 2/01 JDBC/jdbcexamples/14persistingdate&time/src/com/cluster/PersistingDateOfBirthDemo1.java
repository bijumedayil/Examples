package com.cluster;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.cluster.util.DBUtil;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// using sql support
public class PersistingDateOfBirthDemo1 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;

		try {
			con = DBUtil.getConnection();
			String sqlQuery = "INSERT INTO EMPDOB(NAME, DOB) VALUES ('RAJESH', TO_DATE('31-12-2008','DD-MM-YYYY'))";
			st = con.createStatement();
			st.execute(sqlQuery);
			System.out.println("DONE!!!!!!!!!!");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
