package com.practice.Day24;

public class ReverString {
	public static void main(String[] args) {
		String original = "Rushikesh", reverse = "";
		char ch;
		for (int i = 0; i < original.length(); i++) {
			ch = original.charAt(i);
			reverse = ch + reverse;
		}
		System.out.println(reverse);
	}
}
