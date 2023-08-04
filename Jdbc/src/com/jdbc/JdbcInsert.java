package com.jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
	
public class JdbcInsert {
public static void main(String[] args) throws Exception {
	
	//load and register driver
	Class.forName("com.mysql.jdbc.Driver");

	
	//create a connection with database
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost/practice","root",""); 
	//create statement object
	Statement s=c.createStatement();
	String query = "INSERT INTO college VALUES('anjali','7895467543'),('raji',87654369),('saru',89665545);";
			                                  
			                                          		
	//execute my sql query
	int result = s.executeUpdate(query);
	System.out.println(result);
	c.close();
	
}
}

