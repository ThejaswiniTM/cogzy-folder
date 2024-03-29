package com.cogzy.programs;

import java.util.Scanner;

public class Loop {

	static String getString(String message) {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	public static void main(String[] args) {

		String ans;
		int xx, y, z;
		xx = y = z = 0;

		String intInput = "", nonIntInput = "";
		do {
			String input = "";
			try {
				input = getString("Enter a number");
				int num = Integer.parseInt(input);
				xx += num;
				y++;
				intInput += num + " , ";
			} catch (Exception e) {
				System.out.println("Invalid input, only members expected");
				z++;
				nonIntInput += intInput + ",";
			}
			ans = getString("Do you want to continue yes/no:");
		} while (!ans.equalsIgnoreCase("no"));

		System.out.printf("Number of inputs = %d\n", y + z);
		System.out.printf("Number of integer inputs = %d\n", y);
		System.out.printf("Number of non integer inputs = %d\n", z);
		System.out.printf("Sum of all integer inputs = %d\n", xx);
		System.out.printf("The integer inputs = %s\n", intInput);
	}

}
