package com.jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

	public class JdbcExuteQuery{
		
		public static void main(String[] args) throws Exception {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
			
			Statement s= conn.createStatement();
			String query = "SELECT * FROM employee";
			
		ResultSet rs=s.executeQuery(query);
		int count =0;
		while(rs.next()) {
			//System.out.println(++count);
			System.out.println(rs.getString(1));
			System.out.println(rs.getString("emp_name"));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString("joining_date"));
		
			System.out.println("-------------");
		}
			conn.close();
			
		}
		}
	

                                                