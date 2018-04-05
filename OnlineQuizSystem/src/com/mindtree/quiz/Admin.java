package com.mindtree.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Admin {
	static Scanner sc = new Scanner(System.in);
	static InputStreamReader in = new InputStreamReader(System.in);
	static BufferedReader br = new BufferedReader(in);
	static boolean flag = true;

	static void login(Connection con) {

		System.out.println("Enter Username");
		String name = sc.nextLine();
		System.out.println("Enter Password");
		String pwd = sc.nextLine();

		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("select * from admin");
			ResultSet rs = stmt.executeQuery();
			while (rs.next())
				if (name.equals(rs.getString(1)) && pwd.equals(rs.getString(2)))
					System.out.println("WELCOME TO QUIZ");
				else
					System.out.println("WRONG PASSWORD");

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	static void selectOptions(Connection con) throws SQLException, IOException {
		System.out.println(
				"CHOOSE THE OPTIONS :- 1)EDIT THE QUESTION BANK  2)ENTER THE PARTICIPANT DETAILS 3)GENERATE REPORTS");
		int options = sc.nextInt();
		if (options == 1) {

			do {
				PreparedStatement stmt = con.prepareStatement("insert into QuestionBank values(?,?,?,?,?)");
				System.out.println("Enter the Question");
				String question = br.readLine();

				System.out.println("Option A )");
				String opA = br.readLine();

				System.out.println("Option B )");
				String opB = br.readLine();

				System.out.println("Option C )");
				String opC = br.readLine();

				System.out.println("Correct Answer )");
				String correct = br.readLine();
				stmt.setString(1, question);
				stmt.setString(2, opA);
				stmt.setString(3, opB);
				stmt.setString(4, opC);
				stmt.setString(5, correct);
				int rs = stmt.executeUpdate();
				System.out.println(" Question Added Successfully !!!");

				System.out.println(" 1) ADD QUESTION AGAIN !!   2) EXIT");
				int n = sc.nextInt();
				if (n != 1) {
					break;
				}

			} while (true);

		} else if (options == 2) {
			do {
				PreparedStatement stmt = con.prepareStatement("insert into participant_details values(?,?,?) ");
				System.out.println("ENTER THE PARTICIPANT NAME");
				String name = br.readLine();
				System.out.println("ENTER THE PARTICIPANT CITY");
				String city = br.readLine();
				System.out.println("ENTER THE PARTICIPANT CONTACT");
				long contact = Long.parseLong(br.readLine());

				stmt.setString(1, name);
				stmt.setString(2, city);
				stmt.setLong(3, contact);
				int n = stmt.executeUpdate();

				System.out.println("PARTICIPANT ADDED SUCCESSFULLY !!!");
				System.out.println(" 1) ADD THE PARTICIPANT AGAIN !!   2) EXIT");
				int a = sc.nextInt();
				if (a != 1)
					flag = false;
			} while (flag == true);

		} else {
			PreparedStatement stmt = con
					.prepareStatement("select name from participant_details ORDER BY score DESC LIMIT 1");
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			System.out.println("WINNER IS "+" "+ rs.getString(1));
		}
		con.close();
	}

}
