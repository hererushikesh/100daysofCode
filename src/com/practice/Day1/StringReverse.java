package com.practice.Day1;

import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		firstApproach();
		secondApproach();

	}

	private static void firstApproach() {
		System.out.print("Enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] charArray = str.toCharArray(); // y o g e s h
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}

	private static void secondApproach() {
		System.out.print("Enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] charArray = str.toCharArray(); // y o g e s
		for (int i = 0; i < charArray.length / 2; i++) {
			char temp = charArray[i];
			charArray[i] = charArray[charArray.length - 1 - i];
			charArray[charArray.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(charArray));
	}
}
