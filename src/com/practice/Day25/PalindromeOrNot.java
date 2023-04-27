package com.practice.Day25;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		String original, reverse = "";
		char ch;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String or Any Integer to check Palindrome or Not..!");
		original = sc.next();
		int length = original.length();
		for (int i = 0; i < length; i++) {
			ch = original.charAt(i);
			reverse = ch + reverse;
		}
		if (original.equals(reverse))
			System.out.println("This is a Palindrome Number");
		else
			System.out.println("This is not a Palindrome number ");

		sc.close();
	}
}
