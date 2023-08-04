package com.jdbc;

public class StudentData {
	private int std_id;
	private String std_name;
	private double std_sscmarks;
	
	public StudentData(int std_id, String std_name, double std_sscmarks) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.std_sscmarks = std_sscmarks;
	}
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public double getStd_sscmarks() {
		return std_sscmarks;
	}
	public void setStd_sscmarks(double std_sscmarks) {
		this.std_sscmarks = std_sscmarks;
	}

	
}
