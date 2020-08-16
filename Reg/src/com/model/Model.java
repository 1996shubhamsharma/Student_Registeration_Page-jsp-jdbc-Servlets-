package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Model {
	private String name;
	private String sid;
	private String clg;
	private int marks;
		private int age;
	private Connection con;
	private PreparedStatement pstmt;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Model() throws Throwable{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/form";
			String usn = "root";
			String password = "1996shubu";
			Connection con = DriverManager.getConnection(url,usn,password);
			
			
	}
	public boolean insert() throws Exception{
		pstmt = con.prepareStatement("insert into form(name,sid,clg_name,marks,age) values(?,?,?,?,?)");
		pstmt.setString(1, name);
		pstmt.setString(2, sid);
		pstmt.setString(3, clg);
		pstmt.setInt(4, marks);
		pstmt.setInt(5, age);
		int x = pstmt.executeUpdate();
		if(x>0)
		{
			return true;
		}
		return false;
	}

}
