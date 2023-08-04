package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CaseStudyExample {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","");
		Statement s =c.createStatement();
		//update records
		
		String query = "UPDATE vegetable SET name = 'cucumber' WHERE id = 2 ";
		int result = s.executeUpdate(query);
		//while(r.next()) {
			
	//	System.out.println(r.getInt(1));
	//	System.out.println(r.getString(2));
		c.close();		
	}}
//Class.forName("com.jdbc.mysql.Driver");
//Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
//Statement s=c.createStatement();
//String query ="INSERT INTO products VALUES('Laptop',1,70000)";
//int rs=s.executeUpdate(query);