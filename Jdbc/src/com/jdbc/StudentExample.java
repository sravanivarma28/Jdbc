package com.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.Statement;

public class StudentExample {
	public static void main(String[] args) throws Exception {
		Scanner s =new Scanner(System.in);
		System.out.println("enter table name");
		String tableName = s.next();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/java8features","root","");
		Statement st=c.createStatement();
		
		String query = "SELECT std_id, std_name,std_sscmarks FROM "+ tableName;
		System.out.println(query);
		ResultSet r = st.executeQuery(query);
		
		ArrayList<StudentData> a =new ArrayList<StudentData>();
		while(r.next()) {
		a.add(new StudentData(r.getInt("std_id"),r.getString("std_name"),r.getDouble("std_sscmarks")));
	}
	System.out.println(a);
	a.stream().forEach(n->{
		
		System.out.println(n.getStd_id());
		System.out.println(n.getStd_name());
		System.out.println(n.getStd_sscmarks());
		});
          List<StudentData> sd = a.stream().sorted((std1,std2)->std1.getStd_name().compareTo(std2.getStd_name()))
                     .filter(std->std.getStd_sscmarks()>500).collect(Collectors.toList());
	sd.stream().forEach(n-> {
		
		System.out.println(n.getStd_id());
		System.out.println(n.getStd_name());
		System.out.println(n.getStd_sscmarks());
		});
	
	        }}
