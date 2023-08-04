package com.jdbc;

	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
	
	public class Example {
		public static void main(String[] args) throws Exception {
				Scanner scanner =new Scanner(System.in);
				System.out.println("enter tablename");
				String tableName =scanner.next(); 
				
				System.out.println("enter select case");
				String tableNames =scanner.next(); 
				
				switch(tableName) {
					case "fetchById":
						fetchById(tableName);
						System.out.println("id");
						break;
					case "fetchByName":
						fetchByName(tableName);
						System.out.println("name");
						break;
					case "fetchByMobile":
						fetchByMobile(tableName);
						System.out.println("mobile");
						break;
				default:
					System.out.println("choose valid option");
				}
			}
			public static Statement dbConnection() throws Exception{
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","");
				
				Statement s= conn.createStatement();
				return s;
			}
			public static void fetchById(String tableName) throws Exception {
				
				String query = "SELECT * FROM " + tableName + " WHERE id = 1 ";
				
				System.out.println(query);
				ResultSet rs = dbConnection().executeQuery(query);
				int count = 0;
				while(rs.next()) {
					System.out.print("id = "+rs.getString("id"));
					System.out.print("name = "+rs.getString(2));
					System.out.print("mobile = "+rs.getString(3));

			}}
				public static void fetchByName(String tableName) throws Exception {
					
					String query = "SELECT * FROM " + tableName + " WHERE name = 'sravani' ";
					
					System.out.println(query);
					ResultSet rs = dbConnection().executeQuery(query);
					int count = 0;
					while(rs.next()) {
						System.out.print("id = "+rs.getString(1));
						System.out.print("name = "+rs.getString("name"));
						System.out.print("mobile = "+rs.getString(3));
				
			            }}
					public static void fetchByMobile(String tableName) throws Exception {
						
						String query = "SELECT * FROM " + tableName + " WHERE mobile = '7894327329' ";
						
						System.out.println(query);
						ResultSet rs = dbConnection().executeQuery(query);
						int count = 0;
						while(rs.next()) {
							System.out.print("id = "+rs.getString(1));
							System.out.print("name = "+rs.getString(2));
							System.out.print("mobile = "+rs.getString("mobile"));
						}}}
