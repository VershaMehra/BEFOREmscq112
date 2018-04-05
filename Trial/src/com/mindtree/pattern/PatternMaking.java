package com.mindtree.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatternMaking {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("enter n");
		int n = Integer.parseInt(br.readLine());
		int k = 1;
		if (!(n % 2 == 0)) {

			for (int i = 0; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (j == (n + 1) / 2) {
						if (i == 0 || i == n)
							System.out.print(n);
						else{
							System.out.print(k);
							k++;
						}
					} else
						System.out.print(n);

				}
				
				System.out.println(" ");
		
			}
			
		}

		else
			for (int i = 0; i <= n; i++) {
				for (int j = 1; j <= n + 1; j++) {
					if (j == (n+2)/2) {
						if (i == 0 || i == n)
							System.out.print(n);
						else{
							System.out.print(k);
							k++;
						}
					} else
						System.out.print(n);

				}
				
				System.out.println(" ");
			}
	}

}
