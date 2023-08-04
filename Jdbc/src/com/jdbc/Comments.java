package com.jdbc;

	import java.util.Scanner;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;
	
	public class Comments {
		
		public static void main(String[] args) throws Exception {
			Scanner scanner =new Scanner(System.in);
				
			System.out.println("enter id");
			String id=scanner.next();
			
			System.out.println("enter descrition");
			String description = scanner.next();

			System.out.println("enter reg_id");
			String reg_id = scanner.next();
			
			System.out.println("enter post_id");
			String post_id = scanner.next();

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/socialmedia","root","");
			
			Statement s= conn.createStatement();
			String query = "INSERT INTO comments VALUES("+id+",'"+description+"',"+reg_id+","+post_id+")";
			
			int result=s.executeUpdate(query);
			System.out.println(result);
			conn.close();
		}}