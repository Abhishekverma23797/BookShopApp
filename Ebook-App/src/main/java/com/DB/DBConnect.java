package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class DBConnect {

	private  static Connection con;

	public  static Connection getConn() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop", "root", "Aa23797@");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}
}
