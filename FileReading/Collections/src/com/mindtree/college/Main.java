package com.mindtree.college;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < 3; i++) {
			System.out.println("enter  id");
			int n = sc.nextInt();
			hs.add(n);
		}
		// System.out.println(hs);

		String arr[] = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("enter  name");
			String name = sc.next();
			arr[i] = name;
		}

		for (int i = 0; i < 3; i++)
			System.out.println(arr[i]);

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		Iterator itr = hs.iterator();
		while (itr.hasNext()){
		for (int i = 0; i < arr.length; i++) {

				hm.put((Integer) itr.next(), arr[i]);
		}
			}
		System.out.println(hm);//for id and names

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			System.out.println("enter marks");

			int marks = sc.nextInt();
			al.add(marks);
		}

		HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();

		Iterator itr1 = al.iterator();
		Iterator itr2 = hs.iterator();

		while (itr2.hasNext() && itr1.hasNext()) {
			hm1.put((Integer) itr2.next(), (Integer) itr1.next());
		}
		System.out.println(hm1);// for id and marks

		HashMap<Integer, Integer> hm2 = new HashMap<Integer, Integer>();
		Set<Integer> set = hm.keySet();
		Iterator it = set.iterator();

		for (Integer values : set) {
			System.out.println(it.next() + " " + hm.get(values) + " " + hm1.get(values));
		}

	}
}
