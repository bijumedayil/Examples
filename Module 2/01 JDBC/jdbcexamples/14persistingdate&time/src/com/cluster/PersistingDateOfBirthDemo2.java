package com.cluster;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.cluster.util.DBUtil;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
// using java support
public class PersistingDateOfBirthDemo2 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;

		try {
			con = DBUtil.getConnection();

			String dob = "31-12-2008";
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			Date utildate = df.parse(dob);
			java.sql.Date sqlDate = new java.sql.Date(utildate.getTime());

			String sqlQuery = "INSERT INTO EMPDOB (NAME, DOB) VALUES (?,?)";
			pst = con.prepareStatement(sqlQuery);
			pst.setString(1, "RAMESH");
			pst.setDate(2, sqlDate);
			pst.execute();
			System.out.println("DONE!!!!!!!!!!");

		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		
	}
}
