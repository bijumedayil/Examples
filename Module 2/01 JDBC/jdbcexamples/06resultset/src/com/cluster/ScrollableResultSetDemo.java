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
public class ScrollableResultSetDemo {
	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver is loaded");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "ravioracle","ravioracle");
			System.out.println("got database connection");

			// getting a scrollable resultset
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			// selecting all rows
			rs = st.executeQuery("SELECT * FROM EMP");
			
			//cursor moves to next row
			System.out.println("Displaying using next.......");
			rs.next();
			System.out.print(rs.getInt("EMP_ID") + "\t");
			System.out.print(rs.getString("NAME") + "\t");
			System.out.println(rs.getInt("SALARY"));
			System.out.println();

			//cursor moves to exact 4th row
			System.out.println("Displaying fourth row using absolute().......");
			rs.absolute(4);
			System.out.print(rs.getInt("EMP_ID") + "\t");
			System.out.print(rs.getString("NAME") + "\t");
			System.out.println(rs.getInt("SALARY"));
			System.out.println();

			//cursor moves to previous row i.e 3rd row
			System.out.println("Displaying using previous().......");
			rs.previous();
			System.out.print(rs.getInt("EMP_ID") + "\t");
			System.out.print(rs.getString("NAME") + "\t");
			System.out.println(rs.getInt("SALARY"));
			System.out.println();

			//cursor moves relatively 3 positions forward
			System.out.println("Displaying using relative() forward.......");
			rs.relative(3);
			System.out.print(rs.getInt("EMP_ID") + "\t");
			System.out.print(rs.getString("NAME") + "\t");
			System.out.println(rs.getInt("SALARY"));
			System.out.println();

			//cursor moves relatively 4 positions backward
			System.out.println("Displaying using relative() backward.......");
			rs.relative(-4);
			System.out.print(rs.getInt("EMP_ID") + "\t");
			System.out.print(rs.getString("NAME") + "\t");
			System.out.println(rs.getInt("SALARY"));
			System.out.println();

			//cursor moves to first row
			System.out.println("Displaying first row.......");
			rs.first();
			System.out.print(rs.getInt("EMP_ID") + "\t");
			System.out.print(rs.getString("NAME") + "\t");
			System.out.println(rs.getInt("SALARY"));
			System.out.println();

			// cursor moves to last row
			System.out.println("Displaying last row.......");
			rs.last();
			System.out.print(rs.getInt("EMP_ID") + "\t");
			System.out.print(rs.getString("NAME") + "\t");
			System.out.println(rs.getInt("SALARY"));
			System.out.println();

		} catch (ClassNotFoundException cnfe) {
			System.out.println(cnfe);
			cnfe.printStackTrace();

		} catch (SQLException sqle) {
			System.out.println(sqle);
			sqle.printStackTrace();
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
			} catch (SQLException sqle) {
				System.out.println(sqle);
				sqle.printStackTrace();
				System.out.println("Error in closing resources");
			}
		}
	}
}
