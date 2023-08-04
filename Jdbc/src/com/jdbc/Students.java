package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Students {
	public static void main(String[] args) throws Exception {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter std_id");
		int std_id=s.nextInt();
		
		System.out.println("enter std_name");
		String std_name=s.next();
		
		System.out.println("enter std_mobile");
		String std_mobile =s.next();
		
		System.out.println("enter std_countrycode");
	    String std_countrycode =s.next();
		
		System.out.println("enter std_email");
		String std_email = s.next();
		
		System.out.println("enter std_username");
	    String std_username =s.next();
	    
	    System.out.println("enter std_password");
	    String std_password =s.next();
	    
	    System.out.println("enter std_status");
	    int std_status =s.nextInt();
		
		switch(std_status) {
			case 1:
				System.out.println("active");
				break;
			case 2:
				System.out.println("no active");
				break;
			case 3:
				System.out.println("completed");
				break;
			case 4:
				System.out.println("joined date");
				break;
		default:
				System.out.println("choose valid option");
		}
		 System.out.println("enter std_sscmarks");
		    double std_sscmarks =s.nextDouble();
		    
		    System.out.println("enter std_intermarks");
		    double std_intermarks =s.nextDouble();
		    
		    System.out.println("enter std_graduationmarks");
		    double std_graduationmarks =s.nextDouble();
		    
		    System.out.println("enter std_sscmemo");
		    String std_sscmemo =s.next();
		    
		    System.out.println("enter std_intermemo");
		    String std_intermemo =s.next();
		    
		    System.out.println("enter std_graduationmemo");
		    String std_graduationmemo =s.next();
		    
		    System.out.println("enter std_skills");
		    String std_skills =s.next();
		    
		    System.out.println("enter std_created_date");
		    String std_created_date =s.next();
		    
		    System.out.println("enter std_updated_date");
		    String std_updated_date =s.next();
		    
		    System.out.println("enter std_record_status");
		    int std_record_status =s.nextInt();
		    
		    switch(std_record_status) {
			case 1:
				System.out.println("active");
				break;
			case 2:
				System.out.println("no active");
				break;
			case 3:
				System.out.println("block");
				break;
		default:
				System.out.println("choose valid option");
		}
		    System.out.println("enter std_address");
		    String std_address =s.next();
		    
		    System.out.println("enter std_pincode");
		    String std_pincode =s.next();
		    
		    System.out.println("enter std_job_preference_location");
		    String std_job_preference_location =s.next(); 
		    
		    System.out.println("enter std_job_joinedin_company");
		    String std_job_joinedin_company =s.next();
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/java8features","root","");
		Statement st=c.createStatement();
		
String query="INSERT INTO students VALUES("+std_id+",'"+std_name+"','"+std_mobile+"','"+std_countrycode+"','"+std_email+"','"+std_username+"','"+std_password+"',"+std_status+","+std_sscmarks+","+std_intermarks+","+std_graduationmarks+",'"+std_sscmemo+"','"+std_intermemo+"','"+std_graduationmemo+"','"+std_skills+"','"+std_created_date+"','"+std_updated_date+"',"+std_record_status+",'"+std_address+"','"+std_pincode+"','"+std_job_preference_location+"','"+std_job_joinedin_company+"')";

		int result=st.executeUpdate(query);
		
		System.out.println(result);
		c.close();
    }}
