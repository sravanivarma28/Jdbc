package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcExample {
	public static void main(String[] args) throws Exception {
		
		//load and register driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//create a connection with database
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","");
		//create statement object
		
		Statement s= conn.createStatement();
		String query=" INSERT INTO users(name,mobile) VALUES('chinna',98767676)";
		
		//execute my sql query
		int result=s.executeUpdate(query);
		System.out.println(result);
		
	}

}
