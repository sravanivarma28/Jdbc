package com.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ProductsExample {
	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter table name");
		String tableName =s.next();
		
		Class.forName("com.mysql.jdbc.Driver");
	  Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
	  
	  Statement st = c.createStatement();
	  String query ="SELECT * FROM "+tableName;
	  
	  ResultSet r =st.executeQuery(query);
	  System.out.println(query);
	  
	  ArrayList<Products> a = new ArrayList();
	 while(r.next()) {
		  a.add(new Products (r.getString(1),r.getDouble(2),r.getDouble(3)));
	 }
	  List<Products> productDetails =a.stream().filter(n->n.getPrice()<3000).collect(Collectors.toList());

           for(Products values:productDetails) {
	 System.out.println(values.getName());
	// System.out.println(values.getOffer_price());
	 System.out.println(values.getPrice());
             }}}

class Products{
private String name;
private double offer_price;
private double price;

public Products(String name, double offer_price, double price) {
	super();
	this.name = name;
	this.offer_price = offer_price;
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getOffer_price() {
	return offer_price;
}
public void setOffer_price(double offer_price) {
	this.offer_price = offer_price;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}}

