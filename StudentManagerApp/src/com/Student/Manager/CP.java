package com.Student.Manager;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection conn;

	public static Connection createC() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String user = "root";
			String password = "pavan1991@";

			String url = "jdbc:mysql://Localhost:3306/student_manager";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	}

}
