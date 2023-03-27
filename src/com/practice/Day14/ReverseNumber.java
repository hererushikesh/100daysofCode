package com.practice.Day14;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse !");
		int number = sc.nextInt();
		while (number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		System.out.println("The reverse number is "+reverse);
		sc.close();
	}
}
