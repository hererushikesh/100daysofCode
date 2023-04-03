package com.practice.Day19;

import java.util.Scanner;

public class SubstringOfString {

	public static void main(String[] args) {
		String string, sub;
		int c, i, length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to ger SubString :");
		string = sc.nextLine();
		length = string.length();
		System.out.println("Substrings of  \"" + string + "\" are :- ");

		for (c = 0; c < length; c++) {
			for (i = 1; i <= length - c; i++) {
				sub = string.substring(c, c + i);
				System.out.println(sub);
			}
		}
	}
}
