package com.Student.Manager;

public class Student {
	private int studentId;
	private String studentname;
	private String studentphoneno;
	private String studentcity;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentphoneno() {
		return studentphoneno;
	}

	public void setStudentphoneno(String studentphoneno) {
		this.studentphoneno = studentphoneno;
	}

	public String getStudentcity() {
		return studentcity;
	}

	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}

	public Student(int studentId, String studentname, String studentphoneno, String studentcity) {
		super();
		this.studentId = studentId;
		this.studentname = studentname;
		this.studentphoneno = studentphoneno;
		this.studentcity = studentcity;
	}

	public Student(String studentname, String studentphoneno, String studentcity) {
		super();
		this.studentname = studentname;
		this.studentphoneno = studentphoneno;
		this.studentcity = studentcity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname=" + studentname + ", studentphoneno=" + studentphoneno
				+ ", studentcity=" + studentcity + "]";
	}

}
