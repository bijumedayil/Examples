package com.cluster;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import com.cluster.util.DBUtil;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class PersistingLoginTimeDemo3 {
		
	// When you want to store only DATE, and do not want to include time use SQL Date.
	private static void persistingSQLDate() throws ClassNotFoundException, SQLException{
		
		Connection con = DBUtil.getConnection();
		
		String sqlQuery = "INSERT INTO EMPLOGIN (NAME, LOGIN) VALUES (?,?)";
		java.util.Date date = new java.util.Date();
		System.out.println("Util date :- " + date);
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		System.out.println("SQL date - " + sqlDate);
		PreparedStatement pst = null;
		pst = con.prepareStatement(sqlQuery);
		pst.setString(1,"RAJESH");
		pst.setDate(2, sqlDate);
		pst.execute();
			
	}

	// When you want to store both DATE and TIME, use a combination of java.util.Date and java.sql.Timestamp.
	private static void persistingSQLTimeStamp()  throws ClassNotFoundException, SQLException{
		Connection con = DBUtil.getConnection();
		String SQL_QUERY = "INSERT INTO EMPLOGIN (NAME, LOGIN) VALUES (?,?)";
		java.util.Date utilDate = new java.util.Date();
		System.out.println("Util date :- " + utilDate);
		Timestamp timeStamp = new Timestamp(utilDate.getTime());
		System.out.println("Timestamp :- " + timeStamp);
		PreparedStatement pst;
		pst = con.prepareStatement(SQL_QUERY);
		pst.setString(1, "RAMESH");
		pst.setTimestamp(2, timeStamp);
		pst.execute();
	}
	
	
	private static void retrivingDateFromDB() throws ClassNotFoundException, SQLException{
		Connection con = DBUtil.getConnection();
		ResultSet rs;
			Statement st = con.createStatement();
			rs = st.executeQuery("SELECT NAME, LOGIN FROM EMPLOGIN");
			while(rs.next()){
				
				// for displaying only date use getDate()
				String s = rs.getString(1);
				java.util.Date date = rs.getDate(2);
				System.out.println(s + "\t" + date);
				
				// for displaying both date and time use getTimeStamp()
			/*	String s = rs.getString(1);
				java.sql.Timestamp ts = rs.getTimestamp(2);
				System.out.println(s + "\t" + ts);
				*/
			}
		}
	
	
	public static void main(String[] args) {
		try {
			//	persistingSQLDate();
			//	persistingSQLTimeStamp();
			 	retrivingDateFromDB();
				System.out.println("DONE!!!!!!!!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
