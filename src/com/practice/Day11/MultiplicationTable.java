package com.practice.Day11;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to get a Multiplication Table :");

		int num = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		scanner.close();
	}
}
