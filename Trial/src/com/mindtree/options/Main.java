package com.mindtree.options;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("1) display" + " " + "2) withdraw" + " " + "3) deposit" + " " + "4) exit");
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		do {

			System.out.println("enter ur input");
			int n = sc.nextInt();
			Bank b = new Bank();

			if (n == 1)
				b.display();
			else if (n == 2) {
				System.out.println("enter the amount you want to withdraw");

				double amt = sc.nextDouble();
				try {
					b.withdraw(amt);
				} catch (WithdrawException e) {
					System.out.println(e.getMessage());
				}
				
			} else if (n == 3) {
				System.out.println("enter the amount you want to deposit");
				double amt = sc.nextDouble();
				if (amt < 0)
					System.out.println("Invalid input");
				else
					b.deposit(amt);
			} else if (n == 4)
				break;
			else
				System.out.println("wrong input");
		} while (true);

	}
}
