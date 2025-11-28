package com.mphasis.Maven28thProject_jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JdbcProcCallDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		

		Class.forName("com.mysql.cj.jdbc.Driver");

		String uname = "root";
		String pwd = "";
		String url = "jdbc:mysql://localhost:3306/mphasisdb";

		Connection con = DriverManager.getConnection(url, uname, pwd);
		
		CallableStatement cs=con.prepareCall("{call retrieveEmp}");
		ResultSet rs=cs.executeQuery();
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnsCount = rsmd.getColumnCount();
		while (rs.next()) {
			for (int i = 1; i <= columnsCount; i++)
				System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(rsmd.getColumnName(i)));
			System.out.println("------------------------------");

		}
		
		
	}

}
