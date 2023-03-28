package com.practice.Day15;

import java.util.Scanner;

public class WhileLoopUsingBreak {
	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Eneterd a number to check while loop is working or not!");
			number = input.nextInt();
			if (number==0) {
				System.out.println("Enter a non zero number!");
				break;
			}
			System.out.println("You entered a Number : " + number);
		}
		input.close();
	}
}
