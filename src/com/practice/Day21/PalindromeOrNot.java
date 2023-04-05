package com.practice.Day21;

import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to check palindrome or not");
		String input = sc.nextLine();
		String reverse = "";
		int length = input.length();
		for (int i = 0; i < length; i++) {
			char ch = input.charAt(i);
			reverse = ch + reverse;
		}
		System.out.println(reverse);
		
		if (reverse.equals(input)) {
			System.out.println("This String is a palindrome");
		} else
			System.out.println("This String is not a Palindrome");

		sc.close();
	}
}