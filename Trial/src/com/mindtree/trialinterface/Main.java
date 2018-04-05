package com.mindtree.trialinterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("Enter the bank of ur choice");
		String choice = br.readLine();
		if (choice.equals("Axis")) {
			Axis ax = new Axis();
			ax.withdraw();
			ax.display();
		} else if (choice.equals("Hdfc")) {
			Hdfc hd = new Hdfc();
			hd.withdraw();
			hd.display();
		} else if (choice.equals("Icici")) {
			Icici ic = new Icici();
			ic.withdraw();
			ic.display();
		} else if (choice.equals("Kotak")) {
			Kotak ko = new Kotak();
			ko.withdraw();
			ko.display();
		} else
			System.out.println("Incorrect choice of bank");
	}

}
