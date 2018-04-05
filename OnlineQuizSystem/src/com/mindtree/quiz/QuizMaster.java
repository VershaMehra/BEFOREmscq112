package com.mindtree.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class QuizMaster {

	static Scanner sc = new Scanner(System.in);
	static PreparedStatement stmt;
	static String name;

	static void start(Connection con) {

		System.out.println(" START THE QUIZ !!");
		System.out.println("Name the Participant");
		 name = sc.nextLine();

		try {
			stmt = con.prepareStatement("select * from participant_details where name=?");
			stmt.setString(1, name);
			ResultSet rs = stmt.executeQuery();
			while (rs.next())
				System.out.println("WELCOME" + " " + rs.getString(1));

		} catch (SQLException e) {
			
			System.out.println(e);
		}

	}
	

	static void askQuestions(Connection con) throws SQLException {

		int score=0;
		stmt = con.prepareStatement("select * from questionbank");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			
				System.out.println("YOUR QUESTION IS :-" + " " + rs.getString(1) + " " + "A)" + " " + rs.getString(2) + " "
						+ "B)" + " " + rs.getString(3) + " " + "C)" + " " + rs.getString(4));
				String answer = sc.nextLine();
				if (answer.equals(rs.getString(5)))
				{
					System.out.println("CORRECT ANSWER");
					score=score+10;
				}
				else
					System.out.println("WRONG ANSWER");
			}
			
		
		Participant part=new Participant();
		part.score(con,score,name);
	}

}
