package com.practice.Day16;

import java.util.Scanner;

public class BreakContinueWhileLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String number;
		while (true) {
			System.out.println("Enter a number!");
			number = input.next();
			if (number.matches("\\d{10}")) {
				System.out.println("you Entered a number is : " + number);
				continue;
			} else {
				System.out.println("please enter a valid number!");
				break;
			}
		}input.close();
	}
}
