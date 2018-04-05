package com.mindtree.jdbctrial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Welcome123");

			// insert
			/*
			 * PreparedStatement stmt=con.prepareStatement(
			 * "insert into employee values(?,?)"); Scanner sc=new
			 * Scanner(System.in); System.out.println("enter id"); int
			 * n=sc.nextInt(); System.out.println("enter name"); String
			 * name=sc.next(); stmt.setInt(1, n); stmt.setString(2, name); int
			 * rs=stmt.executeUpdate(); System.out.println(rs);
			 */

			// retrieve
			/*
			 * PreparedStatement stmt=con.prepareStatement(
			 * "select * from employee where id=?"); Scanner sc=new
			 * Scanner(System.in); System.out.println(
			 * "enter id which u want to retrieve"); int id=sc.nextInt();
			 * stmt.setInt(1, id); ResultSet rs=stmt.executeQuery();
			 * while(rs.next()) System.out.println(rs.getInt(1)+" "
			 * +rs.getString(2));
			 */

			// update
			/*
			 * PreparedStatement stmt=con.prepareStatement(
			 * "update employee set name=? where id=1"); Scanner sc=new
			 * Scanner(System.in); System.out.println(
			 * "enter name of id 1 u want to update"); String name=sc.next();
			 * stmt.setString(1, name); int rs=stmt.executeUpdate();
			 * System.out.println(rs);
			 */

			// delete

			/*
			 * PreparedStatement stmt=con.prepareStatement(
			 * "delete from employee where id=?"); Scanner sc=new
			 * Scanner(System.in); System.out.println(
			 * "enter id which u want to delete"); int id=sc.nextInt();
			 * stmt.setInt(1, id); int rs=stmt.executeUpdate();
			 * System.out.println(rs);
			 */

			// retrieval using collection
			PreparedStatement stmt = con.prepareStatement("select * from employee where id=?");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter id which u want to retrieve");
			int id = sc.nextInt();
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			HashSet<String> hs = new HashSet<String>();
			while (rs.next())
				hs.add(rs.getInt(1) + " " + rs.getString(2));

			System.out.println(hs);

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
