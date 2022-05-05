package com.Student.Manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Studentdao {
	public static boolean insertStudentTDB(Student st) {

		boolean f = false;

		try {
			Connection con = CP.createC();
			String q = "Insert into students(sname,sphone,scity) values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, st.getStudentname());
			pstmt.setString(2, st.getStudentphoneno());
			pstmt.setString(3, st.getStudentcity());
			pstmt.executeUpdate();
			System.out.print("connected");
			f=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int userId) {
		// TODO Auto-generated method stub
		boolean f = false;

		try {
			Connection con = CP.createC();
			String q = "delet from student where sid?";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1, userId);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void showAllStudent() {

		// TODO Auto-generated method stub
		boolean f = false;

		try {
			Connection con = CP.createC();
			String q = "Select * from Student";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);

			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString("scity");

				System.out.println("ID:" + id);
				System.out.println("name:" + name);
				System.out.println("phoneno:" + phone);
				System.out.println("city:" + city);
				System.out.println("************************");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
