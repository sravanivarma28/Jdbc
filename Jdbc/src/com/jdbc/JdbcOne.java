package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcOne {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","");
		
		Statement s= conn.createStatement();
		String query = "INSERT INTO users VALUES(1,'ramya',7979869)";
		
		int result=s.executeUpdate(query);
		System.out.println(result);
		conn.close();
		
	}

}
