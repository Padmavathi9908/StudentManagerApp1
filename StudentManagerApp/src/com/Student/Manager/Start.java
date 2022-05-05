package com.Student.Manager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws IOException {
		System.out.println("wellcome to studentmanagerapp");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("PRESS 1 to ADD students");
			System.out.println("PRESS 2 TO DELETE students");
			System.out.println("PRESS 3 TO DISPLAY students");
			System.out.println("PRESS 4 TO EXIT app");
			int c = Integer.parseInt(br.readLine());

			if (c == 1) {
				// add students
				System.out.println("enter the user name");
				String name = br.readLine();

				System.out.println("enter phone number");
				String phone = br.readLine();

				System.out.println("enter your city");
				String city = br.readLine();

				Student st = new Student(name, phone, city);
				boolean answer = Studentdao.insertStudentTDB(st);

				if (answer) {
					System.out.println("student added successecfully");
				}

				else {
					System.out.println("something went wrong");
				}
			}

			else if (c == 2) {
				// delete students
				System.out.println("enter the student id deleted");
				int userId = Integer.parseInt(br.readLine());
				boolean f = Studentdao.deleteStudent(userId);

				if (f) {
					System.out.println("Deleted");

				} else {
					System.out.println("something went wrong");
				}
			} else if (c == 3) {
				// display students
				Studentdao.showAllStudent();
			} else if (c == 4) {
				// exit
				break;
			} else {

			}

		}
		System.out.println("Thankyou for using my application*****");
		System.out.println("see you soon *** bye bye");

		// TODO Auto-generated method stub

	}

}
