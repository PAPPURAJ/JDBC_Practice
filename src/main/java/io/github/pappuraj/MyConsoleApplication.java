package io.github.pappuraj;

import java.util.Scanner;

public class MyConsoleApplication {
		
	static void pr(String s) {
		System.out.print(s);
	}
	
	static void prl(String s) {
		System.out.println(s);
	}
	
	public static void start() {
		
		Scanner sc=new Scanner(System.in);
		
		prl("\n\nWelcome to our project!\n........................\n\n");
		while(true) {
			prl("Selection option: \n\n1. Insert product\n"
					+ "2. Update product\n3. Update product\n4. Delete product\n"
					+ "5. Search by ID\n6. Search by model\n7. Search by name\n"
					+ "8. Search by category\n9. Search by price range\n0. Exit");
			pr("\nYour input: ");
			Character in=sc.next().charAt(0);
		}
	}
	
	

	
}
