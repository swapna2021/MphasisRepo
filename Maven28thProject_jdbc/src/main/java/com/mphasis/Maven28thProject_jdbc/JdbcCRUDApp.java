package com.mphasis.Maven28thProject_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCRUDApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String uname = "root";
		String pwd = "";
		String url = "jdbc:mysql://localhost:3306/mphasisdb";

		Connection con = DriverManager.getConnection(url, uname, pwd);
		Statement st = con.createStatement();

		// inserting record
//    		String query="insert into emptable values(?,?,?,?,?,?,?)";
//    		PreparedStatement ps=con.prepareStatement(query);
//    		ps.setInt(1,677);
//    		ps.setString(2, "amith");
//    		ps.setString(3, "9090909090");
//    		ps.setString(4,"bglr");
//    		ps.setInt(5, 1);
//    		ps.setInt(6,35);
//    		ps.setString(7, "amith@Gmail.com");
//    		
//    		
//    		System.out.println("row inserted successfully");

		// update record

//    		String query="update emptable set mobile=? where employeeid=?";
//    		PreparedStatement ps=con.prepareStatement(query);
//    		ps.setString(1,"7878787878");
//    		ps.setInt(2,679);
//    		ps.executeUpdate();
//    		
//    		System.out.println("row updated successfully");

		// delete record 679
		String query = "delete from emptable where employeeid=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, 679);
		ps.executeUpdate();
		System.out.println("row deleted");

		// read records
		ResultSet rs = st.executeQuery("select * from emptable");
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnsCount = rsmd.getColumnCount();
		while (rs.next()) {
			for (int i = 1; i <= columnsCount; i++)
				System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(rsmd.getColumnName(i)));
			System.out.println("------------------------------");

		}

		rs.close();
		st.close();
		con.close();

	}

}
