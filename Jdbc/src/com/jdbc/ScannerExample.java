package com.jdbc;
    import java.util.Scanner;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;
	
	public class ScannerExample {
		public static void main(String[] args) throws Exception {
			Scanner scanner =new Scanner(System.in);
	
			System.out.println("enter number of employes");
			String number=scanner.next();
			
			System.out.println("enter employe id");
			String emp_id=scanner.next();
			
			System.out.println("enter employe name");
			String emp_name=scanner.next();

			System.out.println("enter employe mobile");
			String emp_mobie=scanner.next();
			
			System.out.println("enter employe joining date");
			String joining_date=scanner.next();

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
			
			Statement s= conn.createStatement();
			String query = "INSERT INTO employee VALUES('"+emp_id+"','"+emp_name+"','"+emp_mobie+"','"+joining_date+"')";
			
			int result=s.executeUpdate(query);
			System.out.println(result);
			conn.close();
		}}