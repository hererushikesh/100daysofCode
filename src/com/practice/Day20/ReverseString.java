package com.practice.Day20;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Hello-World";
		String reverse = "";

		int length = name.length();
		for (int i = 0; i < length; i++) {
			char ch = name.charAt(i);
			reverse = ch + reverse;
		}
		System.out.println(reverse);
	}
}
