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
public class TransactionDemo {
	public static void main(String[] args) {
		System.out.println("Begin of main program");
		Connection con = null;
		Statement st = null;

		try {
			con = DBUtil.getConnection();
			con.setAutoCommit(false); // begin of transaction
			st = con.createStatement();
			st.execute("INSERT INTO EMP(EMP_ID,NAME,SALARY) VALUES(101,'RAJESH',1000)");
			st.execute("INSERT INTO PHONE(PHONE_ID,EMP_ID,PHONE_NUMBER) VALUES(1,101,'12345')");
			st.execute("INSERT INTO PHONE(PHONE_ID,EMP_ID,PHONE_NUMBER) VALUES(2,101,'11111')");
			System.out.println("Inserted successfully....");
			con.commit(); // end of transaction
		} 
		catch (Exception e) {
			System.out.println(e);
			try {
				System.out.println("Employee not inserted....");
				con.rollback(); // end of transaction
			} catch (SQLException e1) {
				e1.printStackTrace();
			} 
		}
		
		finally{
			try {
				if(con != null){
				con.close();
				}
				if(st != null){
					st.close();
				}
			} catch (SQLException e) {
				System.out.println("Error in closing resources");
			}
		}
		System.out.println("End of main program");
	}
}
