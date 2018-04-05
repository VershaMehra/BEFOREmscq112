package com.mindtree.hello;

import java.util.HashMap;

public class NaturalNumbers {

	public static void main(String[] args) {

		/*
		 * String statement = "I love java I love coding I love programming";
		 * int j = statement.length(); int count = 0; for (int i = 0; i < j;
		 * i++) {
		 * 
		 * for (int k = 0; k < j; k++) {
		 * 
		 * if (statement.charAt(i) == statement.charAt(k)) count++;
		 * 
		 * }
		 * 
		 * System.out.println("frequency of" + " " + statement.charAt(i) + " " +
		 * "is" + count); count = 0; }
		 */

		String s1 = "i love programming i love jave i love coding";
		String s[] = s1.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < s.length; i++) {
			if (!(hm.containsKey(s[i])))
				hm.put(s[i], 1);
			else {
				hm.put(s[i], (hm.get(s[i]) + 1));
			}
		}
		System.out.println(hm);
	}

}
