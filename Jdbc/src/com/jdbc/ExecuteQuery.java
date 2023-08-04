package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
	
	
	public class ExecuteQuery {
		public static void main(String[] args) throws Exception {
			Scanner scanner =new Scanner(System.in);
			System.out.println("enter tablename");
			String tableName = scanner.next();
			fetchById(tableName);
		}
		public static Statement dbConnection() throws Exception{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","");
			
			Statement s= conn.createStatement();
			return s;
		}
		public static void fetchById(String tableName) throws Exception {
		
			String query = "SELECT * FROM " + tableName + " WHERE id = 2 ";
			
			System.out.println(query);
			ResultSet rs = dbConnection().executeQuery(query);
			int count = 0;
			while(rs.next()) {
				System.out.print("id = "+rs.getString("id"));
				System.out.print("name = "+rs.getString(2));
				System.out.print("mobile = "+rs.getString(3));

		}}}