package com.mindtree.namesarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayOfNames {

	public static void main(String[] args) throws IOException {

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("How many names you want to enter");
		int n = Integer.parseInt(br.readLine());
		String name[] = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter name");
			name[i] = br.readLine();
		}
		/*
		 * System.out.println("names are"); for (int i = 0; i < n; i++) {
		 * 
		 * System.out.println(name[i]); }
		 */

		System.out.println("enter surname ");
		String surname = br.readLine();
		for (int i = 0; i < n; i++) {
			if (name[i].contains(surname)) {
				String s[] = name[i].split(" ");
				if (s[0].equalsIgnoreCase(surname))
					System.out.println(name[i]);

			}

		}
	}
}
