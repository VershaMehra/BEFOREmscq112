package com.mindtree.quiz;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, SQLException {
		do {
			Connection con = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "Welcome123");
			} catch (ClassNotFoundException e) {
				System.out.println(e);
			} catch (Exception e) {
				System.out.println(e);
			}

			System.out.println("Welcome to Online Quiz !!!");
			System.out.println(" ");
			System.out.println(" SELECT YOUR ROLE :- 1)Admin 2)Quiz Master ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if (choice == 1)
				try {
					Admin.login(con);
					Admin.selectOptions(con);
				} catch (SQLException e) {
					System.out.println(e);

				}

			else if (choice == 2) {

				QuizMaster.start(con);
				QuizMaster.askQuestions(con);

			}
		} while (true);

	}

}
